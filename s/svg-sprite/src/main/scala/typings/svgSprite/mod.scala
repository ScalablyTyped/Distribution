package typings.svgSprite

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.Error
import typings.svgSprite.anon.Attributes
import typings.svgSprite.anon.Box
import typings.svgSprite.anon.Generator
import typings.svgSprite.anon.Plugins
import typings.vinyl.mod.File
import typings.winston.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("svg-sprite", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with SVGSpriter {
    /**
      * The spriter's constructor (always the entry point)
      * @param config Main configuration for the spriting process
      */
    def this(config: Config) = this()
  }
  @JSImport("svg-sprite", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SVGSpriterConstructor = js.native
  
  type CompileCallback = js.Function3[/* error */ Error, /* result */ js.Any, /* data */ js.Any, js.Any]
  
  trait Config extends StObject {
    
    /**
      * Main output directory
      * @default '.'
      */
    var dest: js.UndefOr[String] = js.undefined
    
    /**
      * Logging verbosity or custom logger
      */
    var log: js.UndefOr[String | Logger] = js.undefined
    
    /**
      * Output mode configurations
      */
    var mode: js.UndefOr[Mode] = js.undefined
    
    /**
      * SVG shape configuration
      */
    var shape: js.UndefOr[Shape] = js.undefined
    
    /**
      * Sprite SVG options
      */
    var svg: js.UndefOr[Svg] = js.undefined
    
    /**
      * Custom templating variables
      */
    var variables: js.UndefOr[js.Any] = js.undefined
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      @scala.inline
      def setLog(value: String | Logger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSvg(value: Svg): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
      
      @scala.inline
      def setVariables(value: js.Any): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  trait CssAndViewSpecificModeConfig
    extends StObject
       with ModeConfig {
    
    /**
      * If given and not empty, this will be the selector name of a CSS rule commonly specifying the background-image
      * and background-repeat properties for all the shapes in the sprite (thus saving some bytes by not unnecessarily repeating them for each shape)
      */
    var common: js.UndefOr[String] = js.undefined
    
    /**
      * The arrangement of the shapes within the sprite. Might be "vertical", "horizontal", "diagonal" or "packed"
      * (with the latter being the most compact type). It depends on your project which layout is best for you.
      * @default "packed"
      */
    var layout: js.UndefOr[String] = js.undefined
    
    /**
      * If given and not empty, a mixin with this name will be added to supporting output formats (e.g. Sass, LESS, Stylus),
      * specifying the background-image and background-repeat properties for all the shapes in the sprite.
      * You may use it for creating custom CSS within @media rules. The mixin acts much like the common rule.
      * In fact, you can even combine the two - if both are enabled, the common rule will use the mixin internally.
      */
    var mixin: js.UndefOr[String] = js.undefined
  }
  object CssAndViewSpecificModeConfig {
    
    @scala.inline
    def apply(): CssAndViewSpecificModeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CssAndViewSpecificModeConfig]
    }
    
    @scala.inline
    implicit class CssAndViewSpecificModeConfigMutableBuilder[Self <: CssAndViewSpecificModeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommon(value: String): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
      
      @scala.inline
      def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setMixin(value: String): Self = StObject.set(x, "mixin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixinUndefined: Self = StObject.set(x, "mixin", js.undefined)
    }
  }
  
  /**
    * Custom callback transformation
    */
  type CustomCallbackTransform = StringDictionary[
    js.Function3[/* shape */ js.Any, /* sprite */ SVGSpriter, /* callback */ js.Function, js.Any]
  ]
  
  /**
    * Pre-defined shape transformation with custom configuration
    */
  type CustomConfigurationTransform = StringDictionary[Plugins]
  
  trait DefsAndSymbolSpecificModeConfig
    extends StObject
       with ModeConfig {
    
    /**
      * If you want to embed the sprite into your HTML source, you will want to set this to true
      * in order to prevent the creation of SVG namespace declarations and to set some other attributes for effectively hiding the library sprite.
      * @default false
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
  }
  object DefsAndSymbolSpecificModeConfig {
    
    @scala.inline
    def apply(): DefsAndSymbolSpecificModeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefsAndSymbolSpecificModeConfig]
    }
    
    @scala.inline
    implicit class DefsAndSymbolSpecificModeConfigMutableBuilder[Self <: DefsAndSymbolSpecificModeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    }
  }
  
  type GetShapesCallback = js.Function2[/* error */ Error, /* result */ js.Array[File], js.Any]
  
  trait Mode
    extends StObject
       with /* customConfigName */ StringDictionary[ModeConfig | Boolean] {
    
    var css: js.UndefOr[CssAndViewSpecificModeConfig | Boolean] = js.undefined
    
    var defs: js.UndefOr[DefsAndSymbolSpecificModeConfig | Boolean] = js.undefined
    
    var stack: js.UndefOr[ModeConfig | Boolean] = js.undefined
    
    var symbol: js.UndefOr[DefsAndSymbolSpecificModeConfig | Boolean] = js.undefined
    
    var view: js.UndefOr[CssAndViewSpecificModeConfig | Boolean] = js.undefined
  }
  object Mode {
    
    @scala.inline
    def apply(): Mode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mode]
    }
    
    @scala.inline
    implicit class ModeMutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCss(value: CssAndViewSpecificModeConfig | Boolean): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      @scala.inline
      def setDefs(value: DefsAndSymbolSpecificModeConfig | Boolean): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
      
      @scala.inline
      def setStack(value: ModeConfig | Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      @scala.inline
      def setSymbol(value: DefsAndSymbolSpecificModeConfig | Boolean): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      @scala.inline
      def setView(value: CssAndViewSpecificModeConfig | Boolean): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  trait ModeConfig extends StObject {
    
    /**
      * Add a content based hash to the name of the sprite file so that clients reliably reload the sprite
      * when it's content changes («cache busting»). Defaults to false except for «css» and «view» sprites.
      * @default true∣false
      */
    var bust: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Base directory for sprite and CSS file output. If not absolute, the path will be resolved using the main output directory (see global dest option).
      * @default "<mode>"
      */
    var dest: js.UndefOr[String] = js.undefined
    
    /**
      * A non-empty string value will trigger the creation of additional CSS rules specifying the dimensions of each shape in the sprite.
      * The string will be used as suffix to mode.<mode>.prefix during CSS selector construction and may contain the placeholder "%s",
      * which will get replaced by the value of mode.<mode>.prefix.
      * A boolean TRUE will cause the dimensions to be included directly into each shape's CSS rule (only available for «css» and «view» sprites).
      * @default "-dims"
      */
    var dimensions: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * Enabling this will trigger the creation of an HTML document demoing the usage of the sprite. Please see below for details on [rendering configurations](#rendering-configurations).
      * @default false
      */
    var example: js.UndefOr[RenderingConfiguration | Boolean] = js.undefined
    
    /**
      * Specify svg-sprite which output mode to use with this configuration
      */
    var mode: js.UndefOr[String] = js.undefined
    
    /**
      * Used for prefixing the [shape ID](#shape-ids) during CSS selector construction. If the value is empty,
      * no prefix will be used. The prefix may contain the placeholder "%s" (e.g. ".svg %s-svg"),
      * which will then get replaced by the shape ID. Please be aware that "%" is a special character
      * in this context and that you'll have to escape it by another percent sign ("%%") in case you want
      * to output it to your stylesheets (e.g. for a [Sass placeholder selector](http://sass-lang.com/documentation/file.SASS_REFERENCE.html#placeholder_selectors_)).
      * @default ".svg-%s"
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * Collection of [stylesheet rendering configurations](#rendering-configurations).
      * The keys are used as file extensions as well as file return keys. At present,
      * there are default templates for the file extensions css ([CSS](http://www.w3.org/Style/CSS/)),
      * scss ([Sass](http://sass-lang.com/)), less ([Less](http://lesscss.org/)) and styl ([Stylus](http://learnboost.github.io/stylus/)),
      * which all reside in the directory tmpl/css. Example: {css: true, scss: {dest: '_sprite.scss'}}
      * @default {}
      */
    var render: js.UndefOr[StringDictionary[RenderingConfiguration | Boolean]] = js.undefined
    
    /**
      * SVG sprite path and file name, relative to the mode.<mode>.dest directory.
      * You may omit the file extension, in which case it will be set to ".svg" automatically.
      * @default "svg/sprite.<mode>.svg"
      */
    var sprite: js.UndefOr[String] = js.undefined
  }
  object ModeConfig {
    
    @scala.inline
    def apply(): ModeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModeConfig]
    }
    
    @scala.inline
    implicit class ModeConfigMutableBuilder[Self <: ModeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBust(value: Boolean): Self = StObject.set(x, "bust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBustUndefined: Self = StObject.set(x, "bust", js.undefined)
      
      @scala.inline
      def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      @scala.inline
      def setDimensions(value: String | Boolean): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      @scala.inline
      def setExample(value: RenderingConfiguration | Boolean): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRender(value: StringDictionary[RenderingConfiguration | Boolean]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSprite(value: String): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpriteUndefined: Self = StObject.set(x, "sprite", js.undefined)
    }
  }
  
  trait RenderingConfiguration extends StObject {
    
    /**
      * HTML document destination
      * @default "sprite.<mode>.html"
      */
    var dest: js.UndefOr[String] = js.undefined
    
    /**
      * HTML document Mustache template
      * @default "tmpl/<mode>/sprite.html"
      */
    var template: js.UndefOr[String] = js.undefined
  }
  object RenderingConfiguration {
    
    @scala.inline
    def apply(): RenderingConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderingConfiguration]
    }
    
    @scala.inline
    implicit class RenderingConfigurationMutableBuilder[Self <: RenderingConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  @js.native
  trait SVGSpriter extends StObject {
    
    /**
      * Registering source SVG files
      * @param file Absolute path to the SVG file or a vinyl file object carrying all the necessary values (the following arguments are ignored then).
      * @param name The "local" part of the file path, possibly including subdirectories which will get traversed to CSS selectors using the shape.id.separator configuration option.
      * @param svg SVG file content.
      */
    def add(file: String, name: String, svg: String): SVGSpriter = js.native
    /**
      * Registering source SVG files
      * @param file Absolute path to the SVG file or a vinyl file object carrying all the necessary values (the following arguments are ignored then).
      */
    def add(file: File): SVGSpriter = js.native
    def add(file: File, name: String, svg: String): SVGSpriter = js.native
    
    /**
      * Triggering the sprite compilation
      * @param callback Callback triggered when the compilation has finished.
      */
    def compile(callback: CompileCallback): Unit = js.native
    /**
      * Triggering the sprite compilation
      * @param config Configuration object setting the output mode parameters for a single compilation run. If omitted, the mode property of the main configuration used for the constructor will be used.
      * @param callback Callback triggered when the compilation has finished.
      */
    def compile(config: Config, callback: CompileCallback): SVGSpriter = js.native
    
    /**
      * Accessing the intermediate SVG resources
      * @param dest Base directory for the SVG files in case the will be written to disk.
      * @param callback Callback triggered when the shapes are available.
      */
    def getShapes(dest: String, callback: GetShapesCallback): Unit = js.native
  }
  
  @js.native
  trait SVGSpriterConstructor
    extends StObject
       with EventEmitter
       with /**
    * The spriter's constructor (always the entry point)
    * @param config Main configuration for the spriting process
    */
  Instantiable1[/* config */ Config, SVGSpriter]
  
  /**
    * All settings affecting the SVG shapes of the sprite
    */
  trait Shape extends StObject {
    
    /**
      * Path to YAML file with extended alignment data
      */
    var align: js.UndefOr[String] = js.undefined
    
    /**
      * Output directory for optimized intermediate SVG shapes
      */
    var dest: js.UndefOr[String] = js.undefined
    
    /**
      * Dimension related options
      */
    var dimension: js.UndefOr[Attributes] = js.undefined
    
    /**
      * SVG shape ID related options
      */
    var id: js.UndefOr[Generator] = js.undefined
    
    /**
      * Path to YAML file with meta / accessibility data
      */
    var meta: js.UndefOr[String] = js.undefined
    
    /**
      * Spacing related options
      */
    var spacing: js.UndefOr[Box] = js.undefined
    
    /**
      * List of transformations / optimizations
      */
    var transform: js.UndefOr[js.Array[String | CustomConfigurationTransform | CustomCallbackTransform]] = js.undefined
  }
  object Shape {
    
    @scala.inline
    def apply(): Shape = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Shape]
    }
    
    @scala.inline
    implicit class ShapeMutableBuilder[Self <: Shape] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      @scala.inline
      def setDimension(value: Attributes): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
      
      @scala.inline
      def setId(value: Generator): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setSpacing(value: Box): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      @scala.inline
      def setTransform(value: js.Array[String | CustomConfigurationTransform | CustomCallbackTransform]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTransformVarargs(value: (String | CustomConfigurationTransform | CustomCallbackTransform)*): Self = StObject.set(x, "transform", js.Array(value :_*))
    }
  }
  
  trait Svg extends StObject {
    
    /**
      * If truthy, width and height attributes will be set on the sprite's <svg> element (where applicable).
      * @default true
      */
    var dimensionAttributes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Include a <DOCTYPE> declaration in each compiled sprite. If you provide a non-empty string here,
      * it will be used one-to-one as declaration (e.g. <!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1 Basic//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11-basic.dtd">).
      * If you set this to TRUE, *svg-sprite* will look at the registered shapes for a DOCTYPE declaration and use the first one it can find.
      * @default true
      */
    var doctypeDeclaration: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * In order to avoid CSS class name ambiguities, the default behavior is to namespace CSS class names in the source SVGs before compiling them into a sprite.
      * Each class name is prepended with a unique string. Disable this option to keep the class names untouched.
      * @default true
      */
    var namespaceClassnames: js.UndefOr[Boolean] = js.undefined
    
    /**
      * In order to avoid ID clashes, the default behavior is to namespace all IDs in the source SVGs before compiling them into a sprite.
      * Each ID is prepended with a unique string. In some situations, it might be desirable to disable ID namespacing, e.g. when you want to script the resulting sprite.
      * Just set svg.namespaceIDs to FALSE then and be aware that you might also want to disable SVGO's ID minification (shape.transform.svgo.plugins: [{cleanupIDs: false}]).
      * @default true
      */
    var namespaceIDs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Floating point precision for CSS positioning values (defaults to -1 meaning highest possible precision).
      */
    var precision: js.UndefOr[Double] = js.undefined
    
    /**
      * Shorthand for applying custom attributes to the outermost <svg> element.
      * Please be aware that certain attributes (e.g. viewBox) will be calculated dynamically and override custom rootAttributes in any case.
      */
    var rootAttributes: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Callback (or list of callbacks) that will be applied to the resulting SVG sprites as global [post-processing transformation](#svg-sprite-customization).
      * transform: Function∣Array
      */
    var transform: js.UndefOr[SvgTransformer | js.Array[SvgTransformer]] = js.undefined
    
    /**
      * Output an XML declaration at the very beginning of each compiled sprite.
      * If you provide a non-empty string here, it will be used one-to-one as declaration (e.g. <?xml version="1.0" encoding="utf-8"?>).
      * If you set this to TRUE, *svg-sprite* will look at the registered shapes for an XML declaration and use the first one it can find.
      * @default true
      */
    var xmlDeclaration: js.UndefOr[Boolean | String] = js.undefined
  }
  object Svg {
    
    @scala.inline
    def apply(): Svg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Svg]
    }
    
    @scala.inline
    implicit class SvgMutableBuilder[Self <: Svg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensionAttributes(value: Boolean): Self = StObject.set(x, "dimensionAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionAttributesUndefined: Self = StObject.set(x, "dimensionAttributes", js.undefined)
      
      @scala.inline
      def setDoctypeDeclaration(value: Boolean | String): Self = StObject.set(x, "doctypeDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoctypeDeclarationUndefined: Self = StObject.set(x, "doctypeDeclaration", js.undefined)
      
      @scala.inline
      def setNamespaceClassnames(value: Boolean): Self = StObject.set(x, "namespaceClassnames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceClassnamesUndefined: Self = StObject.set(x, "namespaceClassnames", js.undefined)
      
      @scala.inline
      def setNamespaceIDs(value: Boolean): Self = StObject.set(x, "namespaceIDs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceIDsUndefined: Self = StObject.set(x, "namespaceIDs", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setRootAttributes(value: js.Any): Self = StObject.set(x, "rootAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootAttributesUndefined: Self = StObject.set(x, "rootAttributes", js.undefined)
      
      @scala.inline
      def setTransform(value: SvgTransformer | js.Array[SvgTransformer]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformFunction1(value: /* svg */ String => String): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTransformVarargs(value: SvgTransformer*): Self = StObject.set(x, "transform", js.Array(value :_*))
      
      @scala.inline
      def setXmlDeclaration(value: Boolean | String): Self = StObject.set(x, "xmlDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlDeclarationUndefined: Self = StObject.set(x, "xmlDeclaration", js.undefined)
    }
  }
  
  type SvgTransformer = js.Function1[/* svg */ String, String]
  
  type _To = js.Object & SVGSpriterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & SVGSpriterConstructor = ^
}
