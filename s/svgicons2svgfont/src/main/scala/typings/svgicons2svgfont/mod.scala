package typings.svgicons2svgfont

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stream.Transform * / any */ @JSImport("svgicons2svgfont", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject {
    def this(options: SvgIcons2FontOptions) = this()
  }
  
  trait Metadata extends StObject {
    
    var name: String
    
    var path: String
    
    var renamed: Boolean
    
    var unicode: js.Array[String]
  }
  object Metadata {
    
    inline def apply(name: String, path: String, renamed: Boolean, unicode: js.Array[String]): Metadata = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], renamed = renamed.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRenamed(value: Boolean): Self = StObject.set(x, "renamed", value.asInstanceOf[js.Any])
      
      inline def setUnicode(value: js.Array[String]): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      inline def setUnicodeVarargs(value: String*): Self = StObject.set(x, "unicode", js.Array(value*))
    }
  }
  
  trait MetadataOptions extends StObject {
    
    var err: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: svgicons2svgfont.anon.Typeofconsole['error'] */ js.Any
      ] = js.undefined
    
    var log: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: svgicons2svgfont.anon.Typeofconsole['log'] */ js.Any
      ] = js.undefined
    
    var prependUnicode: js.UndefOr[Boolean] = js.undefined
    
    var startUnicode: js.UndefOr[Double] = js.undefined
  }
  object MetadataOptions {
    
    inline def apply(): MetadataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetadataOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetadataOptions] (val x: Self) extends AnyVal {
      
      inline def setErr(
        value: /* import warning: importer.ImportType#apply Failed type conversion: svgicons2svgfont.anon.Typeofconsole['error'] */ js.Any
      ): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setLog(
        value: /* import warning: importer.ImportType#apply Failed type conversion: svgicons2svgfont.anon.Typeofconsole['log'] */ js.Any
      ): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setPrependUnicode(value: Boolean): Self = StObject.set(x, "prependUnicode", value.asInstanceOf[js.Any])
      
      inline def setPrependUnicodeUndefined: Self = StObject.set(x, "prependUnicode", js.undefined)
      
      inline def setStartUnicode(value: Double): Self = StObject.set(x, "startUnicode", value.asInstanceOf[js.Any])
      
      inline def setStartUnicodeUndefined: Self = StObject.set(x, "startUnicode", js.undefined)
    }
  }
  
  type MetadataProvider = js.Function2[
    /* file */ String, 
    /* cb */ js.Function2[/* err */ Any, /* metadata */ Metadata, Unit], 
    Unit
  ]
  
  type SVGIcons2SVGFontStream = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stream.Transform */ Any
  
  trait SvgIcons2FontOptions extends StObject {
    
    /**
      * The font ascent.
      *
      * Default value: fontHeight - descent
      *
      * Use this options only if you know what you're doing.
      * A suitable value for this is computed for you.
      */
    var ascent: js.UndefOr[Double] = js.undefined
    
    /**
      * Calculate the bounds of a glyph and center it horizontally.
      */
    var centerHorizontally: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Centers the glyphs vertically in the generated font.
      * @default false
      */
    var centerVertically: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The font descent. It is usefull to fix the font baseline yourself.
      *
      * Warning: The descent is a positive value!
      */
    var descent: js.UndefOr[Double] = js.undefined
    
    /**
      * Creates a monospace font of the width of the largest input icon.
      */
    var fixedWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The outputted font height (defaults to the height of the highest input icon).
      */
    var fontHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The font id you want (Default value: the options.fontName)
      *
      * @default the options.fontName value
      */
    var fontId: js.UndefOr[String] = js.undefined
    
    /**
      * The font family name you want
      *
      * @default 'iconfont'
      */
    var fontName: js.UndefOr[String] = js.undefined
    
    /**
      * The font style you want.
      */
    var fontStyle: js.UndefOr[String] = js.undefined
    
    /**
      * The font weight
      */
    var fontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * Allows you to provide your own logging function.
      *
      * Set to function(){} to disable logging.
      *
      * @default console.log()
      */
    var log: js.UndefOr[js.Function1[/* message */ js.UndefOr[Any], Unit]] = js.undefined
    
    /**
      * The font [metadata](http://www.w3.org/TR/SVG/metadata.html).
      *
      * You can set any character data in but it is the be suited place for a copyright mention.
      */
    var metadata: js.UndefOr[String] = js.undefined
    
    /**
      * A function which determines the metadata for an icon.
      * It takes a parameter file with an icon svg and should return icon metadata (asynchronously) via the callback function.
      * You can use this function to provide custom logic for svg to codepoint mapping.
      */
    var metadataProvider: js.UndefOr[MetadataProvider] = js.undefined
    
    /**
      * Normalize icons by scaling them to the height of the highest icon.
      */
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Setup SVG path rounding.
      *
      * @default 10e12
      */
    var round: js.UndefOr[Double] = js.undefined
  }
  object SvgIcons2FontOptions {
    
    inline def apply(): SvgIcons2FontOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgIcons2FontOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SvgIcons2FontOptions] (val x: Self) extends AnyVal {
      
      inline def setAscent(value: Double): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      inline def setAscentUndefined: Self = StObject.set(x, "ascent", js.undefined)
      
      inline def setCenterHorizontally(value: Boolean): Self = StObject.set(x, "centerHorizontally", value.asInstanceOf[js.Any])
      
      inline def setCenterHorizontallyUndefined: Self = StObject.set(x, "centerHorizontally", js.undefined)
      
      inline def setCenterVertically(value: Boolean): Self = StObject.set(x, "centerVertically", value.asInstanceOf[js.Any])
      
      inline def setCenterVerticallyUndefined: Self = StObject.set(x, "centerVertically", js.undefined)
      
      inline def setDescent(value: Double): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      inline def setDescentUndefined: Self = StObject.set(x, "descent", js.undefined)
      
      inline def setFixedWidth(value: Boolean): Self = StObject.set(x, "fixedWidth", value.asInstanceOf[js.Any])
      
      inline def setFixedWidthUndefined: Self = StObject.set(x, "fixedWidth", js.undefined)
      
      inline def setFontHeight(value: Double): Self = StObject.set(x, "fontHeight", value.asInstanceOf[js.Any])
      
      inline def setFontHeightUndefined: Self = StObject.set(x, "fontHeight", js.undefined)
      
      inline def setFontId(value: String): Self = StObject.set(x, "fontId", value.asInstanceOf[js.Any])
      
      inline def setFontIdUndefined: Self = StObject.set(x, "fontId", js.undefined)
      
      inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
      
      inline def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setLog(value: /* message */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataProvider(
        value: (/* file */ String, /* cb */ js.Function2[/* err */ Any, /* metadata */ Metadata, Unit]) => Unit
      ): Self = StObject.set(x, "metadataProvider", js.Any.fromFunction2(value))
      
      inline def setMetadataProviderUndefined: Self = StObject.set(x, "metadataProvider", js.undefined)
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setRound(value: Double): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    }
  }
}
