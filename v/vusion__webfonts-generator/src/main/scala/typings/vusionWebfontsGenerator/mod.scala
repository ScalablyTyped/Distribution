package typings.vusionWebfontsGenerator

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.std.Pick
import typings.std.Record
import typings.vusionWebfontsGenerator.anon.Codepoints
import typings.vusionWebfontsGenerator.anon.FontName
import typings.vusionWebfontsGenerator.anon.TypeofHandlebars
import typings.vusionWebfontsGenerator.vusionWebfontsGeneratorStrings.generateCss
import typings.vusionWebfontsGenerator.vusionWebfontsGeneratorStrings.generateHtml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: GeneratedFontTypes */](
    options: WebfontsGeneratorOptions[T],
    done: js.Function2[
      /* err */ js.UndefOr[js.Error], 
      /* res */ Pick[WebfontsGeneratorResult[T], T | generateCss | generateHtml], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@vusion/webfonts-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Paths of default templates. */
  @JSImport("@vusion/webfonts-generator", "templates")
  @js.native
  val templates: Templates_ = js.native
  
  type CSSTemplateContext = js.UndefOr[TemplateOptions] & Codepoints
  
  /* Rewritten from type alias, can be one of: 
    - typings.vusionWebfontsGenerator.vusionWebfontsGeneratorStrings.eot
    - typings.vusionWebfontsGenerator.vusionWebfontsGeneratorStrings.svg
    - typings.vusionWebfontsGenerator.vusionWebfontsGeneratorStrings.ttf
    - typings.vusionWebfontsGenerator.vusionWebfontsGeneratorStrings.woff
    - typings.vusionWebfontsGenerator.vusionWebfontsGeneratorStrings.woff2
  */
  trait GeneratedFontTypes extends StObject
  object GeneratedFontTypes {
    
    inline def eot: typings.vusionWebfontsGenerator.vusionWebfontsGeneratorStrings.eot = "eot".asInstanceOf[typings.vusionWebfontsGenerator.vusionWebfontsGeneratorStrings.eot]
    
    inline def svg: typings.vusionWebfontsGenerator.vusionWebfontsGeneratorStrings.svg = "svg".asInstanceOf[typings.vusionWebfontsGenerator.vusionWebfontsGeneratorStrings.svg]
    
    inline def ttf: typings.vusionWebfontsGenerator.vusionWebfontsGeneratorStrings.ttf = "ttf".asInstanceOf[typings.vusionWebfontsGenerator.vusionWebfontsGeneratorStrings.ttf]
    
    inline def woff: typings.vusionWebfontsGenerator.vusionWebfontsGeneratorStrings.woff = "woff".asInstanceOf[typings.vusionWebfontsGenerator.vusionWebfontsGeneratorStrings.woff]
    
    inline def woff2: typings.vusionWebfontsGenerator.vusionWebfontsGeneratorStrings.woff2 = "woff2".asInstanceOf[typings.vusionWebfontsGenerator.vusionWebfontsGeneratorStrings.woff2]
  }
  
  type HTMLTemplateContext = js.UndefOr[TemplateOptions] & FontName
  
  trait TemplateOptions extends StObject {
    
    /**
      * CSS base class to which the font will be applied.
      * @deprecated Option is deprecated. Use @see {@link baseSelector} instead.
      */
    var baseClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS base selector to which the font will be applied.
      * @default '.icon'
      */
    var baseSelector: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class prefix for each of the generated icons.
      * @default 'icon-'
      */
    var classPrefix: js.UndefOr[String] = js.undefined
  }
  object TemplateOptions {
    
    inline def apply(): TemplateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setBaseClass(value: String): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
      
      inline def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
      
      inline def setBaseSelector(value: String): Self = StObject.set(x, "baseSelector", value.asInstanceOf[js.Any])
      
      inline def setBaseSelectorUndefined: Self = StObject.set(x, "baseSelector", js.undefined)
      
      inline def setClassPrefix(value: String): Self = StObject.set(x, "classPrefix", value.asInstanceOf[js.Any])
      
      inline def setClassPrefixUndefined: Self = StObject.set(x, "classPrefix", js.undefined)
    }
  }
  
  trait Templates_ extends StObject {
    
    /**
      * Default CSS template path.
      * Generates classes with names based on values from `options.templateOptions`.
      */
    var css: String
    
    /**
      * Default HTML template path.
      * Generates a HTML file with a preview of all icons in the font.
      */
    var html: String
    
    /**
      * Default CSS template path.
      * Generates mixin webfont-icon to add icon styles. It is safe to use multiple generated files with mixins together.
      */
    var scss: String
  }
  object Templates_ {
    
    inline def apply(css: String, html: String, scss: String): Templates_ = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], scss = scss.asInstanceOf[js.Any])
      __obj.asInstanceOf[Templates_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Templates_] (val x: Self) extends AnyVal {
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setScss(value: String): Self = StObject.set(x, "scss", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebfontsGeneratorOptions[T /* <: GeneratedFontTypes */] extends StObject {
    
    /** Calculate the bounds of a glyph and center it horizontally. */
    var centerHorizontally: js.UndefOr[Boolean] = js.undefined
    
    /** Specific codepoints for certain icons. Icons without codepoints will have codepoints incremented from startCodepoint skipping duplicates. */
    var codepoints: js.UndefOr[StringDictionary[Double]] = js.undefined
    
    /**
      * Whether to generate CSS file.
      * @default true
      */
    var css: js.UndefOr[Boolean] = js.undefined
    
    /** Add parameters or helper to your template. */
    var cssContext: js.UndefOr[
        js.Function3[
          /* context */ CSSTemplateContext, 
          /* options */ WebfontsGeneratorOptions[T], 
          /* handlebars */ TypeofHandlebars, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Path for generated CSS file.
      * @default path.join(options.dest, options.fontName + '.css')
      */
    var cssDest: js.UndefOr[String] = js.undefined
    
    /**
      * Fonts path used in CSS file.
      * @deprecated Option is deprecated. Use @see {@link cssFontsUrl} instead.
      */
    var cssFontsPath: js.UndefOr[String] = js.undefined
    
    /**
      * Fonts path used in CSS file.
      * @default options.destCss
      */
    var cssFontsUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Path of custom CSS template. Generator uses handlebars templates.
      * Template receives options from options.templateOptions along with the following options:
      * - fontName
      * - src `string` – Value of the `src` property for `@font-face`.
      * - codepoints `object` – Codepoints of icons in hex format.
      *
      * Paths of default templates are stored in the `webfontsGenerator.templates` object.
      * - `webfontsGenerator.templates.css` – Default CSS template path. It generates classes with names based on values from `options.templateOptions`.
      * - `webfontsGenerator.templates.scss` – Default SCSS template path. It generates mixin `webfont-icon` to add icon styles. It is safe to use multiple generated files with mixins together.
      */
    var cssTemplate: js.UndefOr[String] = js.undefined
    
    /**
      * The font descent. It is useful to fix the font baseline yourself.
      * @default 0
      */
    var descent: js.UndefOr[Double] = js.undefined
    
    /** Directory for generated font files. */
    var dest: String
    
    /** List of SVG files. */
    var files: js.Array[String]
    
    /**
      * Creates a monospace font of the width of the largest input icon.
      * @default false
      */
    var fixedWidth: js.UndefOr[Boolean] = js.undefined
    
    /** The outputted font height (defaults to the height of the highest input icon). */
    var fontHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Name of font and base name of font files.
      * @default 'iconfont'
      */
    var fontName: js.UndefOr[String] = js.undefined
    
    /**
      * Specific per format arbitrary options to pass to the generator
      *
      * format and matching generator:
      * - svg - [svgicons2svgfont](https://github.com/nfroidure/svgicons2svgfont).
      * - ttf - [svg2ttf](https://github.com/fontello/svg2ttf).
      * - woff2 - [ttf2woff2](https://github.com/nfroidure/ttf2woff2).
      * - woff - [ttf2woff](https://github.com/fontello/ttf2woff).
      * - eot - [ttf2eot](https://github.com/fontello/ttf2eot).
      */
    var formatOptions: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ format in T ]:? unknown} */ js.Any
      ] = js.undefined
    
    /**
      * Whether to generate HTML preview.
      * @default false
      */
    var html: js.UndefOr[Boolean] = js.undefined
    
    /** Add parameters or helper to your template. */
    var htmlContext: js.UndefOr[
        js.Function3[
          /* context */ HTMLTemplateContext, 
          /* options */ WebfontsGeneratorOptions[T], 
          /* handlebars */ TypeofHandlebars, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Path for generated HTML file.
      * @default path.join(options.dest, options.fontName + '.html')
      */
    var htmlDest: js.UndefOr[String] = js.undefined
    
    /**
      * HTML template path. Generator uses handlebars templates.
      *
      * Template receives options from `options.templateOptions` along with the following options:
      * - fontName
      * - styles `string` – Styles generated with default CSS template. (`cssFontsPath` is changed to relative path from `htmlDest` to `dest`)
      * - names `string[]` – Names of icons.
      */
    var htmlTemplate: js.UndefOr[String] = js.undefined
    
    /**
      * Enable or disable ligature function.
      * @default true
      */
    var ligature: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Normalize icons by scaling them to the height of the highest icon.
      * @default false
      */
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Order of `src` values in `font-face` in CSS file.
      * @default ['eot', 'woff2', 'woff', 'ttf', 'svg']
      */
    var order: js.Array[T]
    
    /** Function that takes path of file and return name of icon. */
    var rename: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
    
    /**
      * Setup SVG path rounding.
      * @default 10e12
      */
    var round: js.UndefOr[Double] = js.undefined
    
    /**
      * Starting codepoint. Defaults to beginning of unicode private area.
      * @default 0xF101
      */
    var startCodepoint: js.UndefOr[Double] = js.undefined
    
    /** Additional options for CSS & HTML templates, that extends default options. */
    var templateOptions: js.UndefOr[TemplateOptions] = js.undefined
    
    /**
      * Font file types to generate. Possible values: `svg`, `ttf`, `woff`, `woff2`, `eot`.
      * @default ['woff2', 'woff', 'eot']
      */
    var types: js.Array[T]
    
    /**
      * It is possible to not create files and get generated fonts in object to write them to files later.
      *
      * Also results object will have function generateCss([urls]) where urls is an object with future fonts urls.
      * @default true
      */
    var writeFiles: js.UndefOr[Boolean] = js.undefined
  }
  object WebfontsGeneratorOptions {
    
    inline def apply[T /* <: GeneratedFontTypes */](dest: String, files: js.Array[String], order: js.Array[T], types: js.Array[T]): WebfontsGeneratorOptions[T] = {
      val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebfontsGeneratorOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebfontsGeneratorOptions[?], T /* <: GeneratedFontTypes */] (val x: Self & WebfontsGeneratorOptions[T]) extends AnyVal {
      
      inline def setCenterHorizontally(value: Boolean): Self = StObject.set(x, "centerHorizontally", value.asInstanceOf[js.Any])
      
      inline def setCenterHorizontallyUndefined: Self = StObject.set(x, "centerHorizontally", js.undefined)
      
      inline def setCodepoints(value: StringDictionary[Double]): Self = StObject.set(x, "codepoints", value.asInstanceOf[js.Any])
      
      inline def setCodepointsUndefined: Self = StObject.set(x, "codepoints", js.undefined)
      
      inline def setCss(value: Boolean): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssContext(
        value: (/* context */ CSSTemplateContext, /* options */ WebfontsGeneratorOptions[T], /* handlebars */ TypeofHandlebars) => Unit
      ): Self = StObject.set(x, "cssContext", js.Any.fromFunction3(value))
      
      inline def setCssContextUndefined: Self = StObject.set(x, "cssContext", js.undefined)
      
      inline def setCssDest(value: String): Self = StObject.set(x, "cssDest", value.asInstanceOf[js.Any])
      
      inline def setCssDestUndefined: Self = StObject.set(x, "cssDest", js.undefined)
      
      inline def setCssFontsPath(value: String): Self = StObject.set(x, "cssFontsPath", value.asInstanceOf[js.Any])
      
      inline def setCssFontsPathUndefined: Self = StObject.set(x, "cssFontsPath", js.undefined)
      
      inline def setCssFontsUrl(value: String): Self = StObject.set(x, "cssFontsUrl", value.asInstanceOf[js.Any])
      
      inline def setCssFontsUrlUndefined: Self = StObject.set(x, "cssFontsUrl", js.undefined)
      
      inline def setCssTemplate(value: String): Self = StObject.set(x, "cssTemplate", value.asInstanceOf[js.Any])
      
      inline def setCssTemplateUndefined: Self = StObject.set(x, "cssTemplate", js.undefined)
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setDescent(value: Double): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      inline def setDescentUndefined: Self = StObject.set(x, "descent", js.undefined)
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setFixedWidth(value: Boolean): Self = StObject.set(x, "fixedWidth", value.asInstanceOf[js.Any])
      
      inline def setFixedWidthUndefined: Self = StObject.set(x, "fixedWidth", js.undefined)
      
      inline def setFontHeight(value: Double): Self = StObject.set(x, "fontHeight", value.asInstanceOf[js.Any])
      
      inline def setFontHeightUndefined: Self = StObject.set(x, "fontHeight", js.undefined)
      
      inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
      
      inline def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
      
      inline def setFormatOptions(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ format in T ]:? unknown} */ js.Any
      ): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
      
      inline def setFormatOptionsUndefined: Self = StObject.set(x, "formatOptions", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlContext(
        value: (/* context */ HTMLTemplateContext, /* options */ WebfontsGeneratorOptions[T], /* handlebars */ TypeofHandlebars) => Unit
      ): Self = StObject.set(x, "htmlContext", js.Any.fromFunction3(value))
      
      inline def setHtmlContextUndefined: Self = StObject.set(x, "htmlContext", js.undefined)
      
      inline def setHtmlDest(value: String): Self = StObject.set(x, "htmlDest", value.asInstanceOf[js.Any])
      
      inline def setHtmlDestUndefined: Self = StObject.set(x, "htmlDest", js.undefined)
      
      inline def setHtmlTemplate(value: String): Self = StObject.set(x, "htmlTemplate", value.asInstanceOf[js.Any])
      
      inline def setHtmlTemplateUndefined: Self = StObject.set(x, "htmlTemplate", js.undefined)
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setLigature(value: Boolean): Self = StObject.set(x, "ligature", value.asInstanceOf[js.Any])
      
      inline def setLigatureUndefined: Self = StObject.set(x, "ligature", js.undefined)
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setOrder(value: js.Array[T]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderVarargs(value: T*): Self = StObject.set(x, "order", js.Array(value*))
      
      inline def setRename(value: /* name */ String => String): Self = StObject.set(x, "rename", js.Any.fromFunction1(value))
      
      inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      inline def setRound(value: Double): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setStartCodepoint(value: Double): Self = StObject.set(x, "startCodepoint", value.asInstanceOf[js.Any])
      
      inline def setStartCodepointUndefined: Self = StObject.set(x, "startCodepoint", js.undefined)
      
      inline def setTemplateOptions(value: TemplateOptions): Self = StObject.set(x, "templateOptions", value.asInstanceOf[js.Any])
      
      inline def setTemplateOptionsUndefined: Self = StObject.set(x, "templateOptions", js.undefined)
      
      inline def setTypes(value: js.Array[T]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: T*): Self = StObject.set(x, "types", js.Array(value*))
      
      inline def setWriteFiles(value: Boolean): Self = StObject.set(x, "writeFiles", value.asInstanceOf[js.Any])
      
      inline def setWriteFilesUndefined: Self = StObject.set(x, "writeFiles", js.undefined)
    }
  }
  
  @js.native
  trait WebfontsGeneratorResult[T /* <: GeneratedFontTypes */] extends StObject {
    
    var eot: Buffer = js.native
    
    def generateCss(): String = js.native
    def generateCss(urls: Record[T, String]): String = js.native
    
    def generateHtml(): String = js.native
    def generateHtml(urls: Record[T, String]): String = js.native
    
    var svg: String = js.native
    
    var ttf: Buffer = js.native
    
    var woff: Buffer = js.native
    
    var woff2: Buffer = js.native
  }
}
