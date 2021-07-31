package typings.svgSpritemapWebpackPlugin

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
    
    @scala.inline
    def apply(assets: js.Object, filename: String): Assets = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assets]
    }
    
    @scala.inline
    implicit class AssetsMutableBuilder[Self <: Assets] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssets(value: js.Object): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
  
  trait Chunk extends StObject {
    
    var chunk: js.UndefOr[Keep] = js.undefined
    
    /**
      * Filename of the generated file (located at the webpack output.path), [hash] and [contenthash] are supported.
      */
    var filename: js.UndefOr[String] = js.undefined
    
    var svg: js.UndefOr[Sizes] = js.undefined
    
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
    
    @scala.inline
    def apply(): Chunk = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Chunk]
    }
    
    @scala.inline
    implicit class ChunkMutableBuilder[Self <: Chunk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunk(value: Keep): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setSvg(value: Sizes): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvg4everybody(value: Boolean | js.Object): Self = StObject.set(x, "svg4everybody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvg4everybodyUndefined: Self = StObject.set(x, "svg4everybody", js.undefined)
      
      @scala.inline
      def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
      
      @scala.inline
      def setSvgo(value: Boolean | js.Object): Self = StObject.set(x, "svgo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgoUndefined: Self = StObject.set(x, "svgo", js.undefined)
    }
  }
  
  trait Filename extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[data | fragment] = js.undefined
    
    var variables: js.UndefOr[Mixin] = js.undefined
  }
  object Filename {
    
    @scala.inline
    def apply(): Filename = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filename]
    }
    
    @scala.inline
    implicit class FilenameMutableBuilder[Self <: Filename] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setFormat(value: data | fragment): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setVariables(value: Mixin): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
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
    
    var prefix: js.UndefOr[String | (js.Function1[/* file */ String, String]) | `false`] = js.undefined
  }
  object Generate {
    
    @scala.inline
    def apply(): Generate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Generate]
    }
    
    @scala.inline
    implicit class GenerateMutableBuilder[Self <: Generate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGenerate(value: Symbol): Self = StObject.set(x, "generate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateUndefined: Self = StObject.set(x, "generate", js.undefined)
      
      @scala.inline
      def setGutter(value: Double | `false`): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      @scala.inline
      def setIdify(value: /* file */ String | `false` => String): Self = StObject.set(x, "idify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIdifyUndefined: Self = StObject.set(x, "idify", js.undefined)
      
      @scala.inline
      def setPrefix(value: String | (js.Function1[/* file */ String, String]) | `false`): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixFunction1(value: /* file */ String => String): Self = StObject.set(x, "prefix", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
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
    
    @scala.inline
    def apply(): Keep = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Keep]
    }
    
    @scala.inline
    implicit class KeepMutableBuilder[Self <: Keep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeep(value: Boolean): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepUndefined: Self = StObject.set(x, "keep", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait Mixin extends StObject {
    
    var mixin: js.UndefOr[String] = js.undefined
    
    var sizes: js.UndefOr[String] = js.undefined
    
    var sprites: js.UndefOr[String] = js.undefined
    
    var variables: js.UndefOr[String] = js.undefined
  }
  object Mixin {
    
    @scala.inline
    def apply(): Mixin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mixin]
    }
    
    @scala.inline
    implicit class MixinMutableBuilder[Self <: Mixin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMixin(value: String): Self = StObject.set(x, "mixin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixinUndefined: Self = StObject.set(x, "mixin", js.undefined)
      
      @scala.inline
      def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      @scala.inline
      def setSprites(value: String): Self = StObject.set(x, "sprites", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpritesUndefined: Self = StObject.set(x, "sprites", js.undefined)
      
      @scala.inline
      def setVariables(value: String): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var options: js.UndefOr[js.Object] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait Sizes extends StObject {
    
    /**
      * Whether to include the width and height attributes on the root SVG element.
      * The default value for this option is based on the value of the sprite.generate.use option but when specified will always overwrite it.
      */
    var sizes: js.UndefOr[Boolean] = js.undefined
  }
  object Sizes {
    
    @scala.inline
    def apply(): Sizes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sizes]
    }
    
    @scala.inline
    implicit class SizesMutableBuilder[Self <: Sizes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSizes(value: Boolean): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
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
    
    @scala.inline
    def apply(): Symbol = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Symbol]
    }
    
    @scala.inline
    implicit class SymbolMutableBuilder[Self <: Symbol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSymbol(value: Boolean | String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      @scala.inline
      def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUse(value: Boolean): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
      
      @scala.inline
      def setView(value: Boolean | String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
}
