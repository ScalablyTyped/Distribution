package typings.svgSpritemapWebpackPlugin

import typings.std.Record
import typings.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginBooleans.`false`
import typings.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginStrings.data
import typings.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginStrings.fragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Assets extends StObject {
    
    val assets: js.Object
    
    val filename: String
  }
  object Assets {
    
    inline def apply(assets: js.Object, filename: String): Assets = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assets]
    }
    
    extension [Self <: Assets](x: Self) {
      
      inline def setAssets(value: js.Object): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
  
  trait Attributes extends StObject {
    
    var attributes: js.UndefOr[Record[String, String | Double | Boolean]] = js.undefined
    
    /**
      * Whether to include the width and height attributes on the root SVG element.
      * The default value for this option is based on the value of the sprite.generate.use option but when specified will always overwrite it.
      */
    var sizes: js.UndefOr[Boolean] = js.undefined
  }
  object Attributes {
    
    inline def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
    
    extension [Self <: Attributes](x: Self) {
      
      inline def setAttributes(value: Record[String, String | Double | Boolean]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setSizes(value: Boolean): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    }
  }
  
  trait Callback extends StObject {
    
    /** @default undefined */
    var callback: js.UndefOr[js.Function1[/* content */ String, String]] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[data | fragment] = js.undefined
    
    /**
      * @default false
      */
    var keepAttributes: js.UndefOr[Boolean] = js.undefined
    
    var variables: js.UndefOr[Mixin] = js.undefined
  }
  object Callback {
    
    inline def apply(): Callback = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Callback]
    }
    
    extension [Self <: Callback](x: Self) {
      
      inline def setCallback(value: /* content */ String => String): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFormat(value: data | fragment): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setKeepAttributes(value: Boolean): Self = StObject.set(x, "keepAttributes", value.asInstanceOf[js.Any])
      
      inline def setKeepAttributesUndefined: Self = StObject.set(x, "keepAttributes", js.undefined)
      
      inline def setVariables(value: Mixin): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  trait Chunk extends StObject {
    
    var chunk: js.UndefOr[Keep] = js.undefined
    
    /**
      * Filename of the generated file (located at the webpack output.path), [hash] and [contenthash] are supported.
      */
    var filename: js.UndefOr[String] = js.undefined
    
    var svg: js.UndefOr[Attributes] = js.undefined
    
    /**
      * Whether to include the SVG4Everybody helper in your entries.
      */
    var svg4everybody: js.UndefOr[Boolean | js.Object] = js.undefined
    
    /**
      * Options object to pass to SVG Optimizer.
      */
    var svgo: js.UndefOr[Boolean | js.Object] = js.undefined
  }
  object Chunk {
    
    inline def apply(): Chunk = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Chunk]
    }
    
    extension [Self <: Chunk](x: Self) {
      
      inline def setChunk(value: Keep): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      inline def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setSvg(value: Attributes): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setSvg4everybody(value: Boolean | js.Object): Self = StObject.set(x, "svg4everybody", value.asInstanceOf[js.Any])
      
      inline def setSvg4everybodyUndefined: Self = StObject.set(x, "svg4everybody", js.undefined)
      
      inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
      
      inline def setSvgo(value: Boolean | js.Object): Self = StObject.set(x, "svgo", value.asInstanceOf[js.Any])
      
      inline def setSvgoUndefined: Self = StObject.set(x, "svgo", js.undefined)
    }
  }
  
  trait Generate extends StObject {
    
    var generate: js.UndefOr[Symbol] = js.undefined
    
    /**
      * Amount of pixels added between each sprite to prevent overlap.
      * @default 0
      */
    var gutter: js.UndefOr[Double | `false`] = js.undefined
    
    /**
      * Function that will be used to transform the filename of each sprite into a valid HTML id
      */
    var idify: js.UndefOr[js.Function1[/* file */ String | `false`, String]] = js.undefined
    
    /**
      * @default 'sprite-'
      */
    var prefix: js.UndefOr[String | (js.Function1[/* file */ String, String]) | `false`] = js.undefined
    
    /**
      * Whether to also prefix any selectors that are generated in the styles file, if enabled.
      * @default false
      */
    var prefixStylesSelectors: js.UndefOr[Boolean] = js.undefined
  }
  object Generate {
    
    inline def apply(): Generate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Generate]
    }
    
    extension [Self <: Generate](x: Self) {
      
      inline def setGenerate(value: Symbol): Self = StObject.set(x, "generate", value.asInstanceOf[js.Any])
      
      inline def setGenerateUndefined: Self = StObject.set(x, "generate", js.undefined)
      
      inline def setGutter(value: Double | `false`): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setIdify(value: /* file */ String | `false` => String): Self = StObject.set(x, "idify", js.Any.fromFunction1(value))
      
      inline def setIdifyUndefined: Self = StObject.set(x, "idify", js.undefined)
      
      inline def setPrefix(value: String | (js.Function1[/* file */ String, String]) | `false`): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixFunction1(value: /* file */ String => String): Self = StObject.set(x, "prefix", js.Any.fromFunction1(value))
      
      inline def setPrefixStylesSelectors(value: Boolean): Self = StObject.set(x, "prefixStylesSelectors", value.asInstanceOf[js.Any])
      
      inline def setPrefixStylesSelectorsUndefined: Self = StObject.set(x, "prefixStylesSelectors", js.undefined)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  trait Keep extends StObject {
    
    /**
      * Whether to keep the chunk after it's been emitted by webpack.
      */
    var keep: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of the chunk that will be generated.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object Keep {
    
    inline def apply(): Keep = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Keep]
    }
    
    extension [Self <: Keep](x: Self) {
      
      inline def setKeep(value: Boolean): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
      
      inline def setKeepUndefined: Self = StObject.set(x, "keep", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait Mixin extends StObject {
    
    var mixin: js.UndefOr[String] = js.undefined
    
    var sizes: js.UndefOr[String] = js.undefined
    
    var sprites: js.UndefOr[String] = js.undefined
    
    var variables: js.UndefOr[String] = js.undefined
  }
  object Mixin {
    
    inline def apply(): Mixin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mixin]
    }
    
    extension [Self <: Mixin](x: Self) {
      
      inline def setMixin(value: String): Self = StObject.set(x, "mixin", value.asInstanceOf[js.Any])
      
      inline def setMixinUndefined: Self = StObject.set(x, "mixin", js.undefined)
      
      inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSprites(value: String): Self = StObject.set(x, "sprites", value.asInstanceOf[js.Any])
      
      inline def setSpritesUndefined: Self = StObject.set(x, "sprites", js.undefined)
      
      inline def setVariables(value: String): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  trait Symbol extends StObject {
    
    var symbol: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Whether to generate a <title> element containing the filename if no title is provided in the SVG.
      */
    var title: js.UndefOr[Boolean] = js.undefined
    
    var use: js.UndefOr[Boolean] = js.undefined
    
    var view: js.UndefOr[Boolean | String] = js.undefined
  }
  object Symbol {
    
    inline def apply(): Symbol = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Symbol]
    }
    
    extension [Self <: Symbol](x: Self) {
      
      inline def setSymbol(value: Boolean | String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUse(value: Boolean): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
      
      inline def setView(value: Boolean | String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
}
