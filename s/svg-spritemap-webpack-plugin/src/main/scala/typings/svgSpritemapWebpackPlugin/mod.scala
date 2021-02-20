package typings.svgSpritemapWebpackPlugin

import typings.std.Plugin
import typings.svgSpritemapWebpackPlugin.anon.Assets
import typings.svgSpritemapWebpackPlugin.anon.Chunk
import typings.svgSpritemapWebpackPlugin.anon.Filename
import typings.svgSpritemapWebpackPlugin.anon.Generate
import typings.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginStrings.asset
import typings.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginStrings.dir
import typings.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginStrings.module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svg-spritemap-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends SVGSpritemapPlugin {
    def this(pattern: String) = this()
    def this(pattern: js.Array[String]) = this()
    def this(pattern: js.UndefOr[scala.Nothing], options: Options) = this()
    def this(pattern: String, options: Options) = this()
    def this(pattern: js.Array[String], options: Options) = this()
  }
  
  /**
    * @see {@link https://github.com/cascornelissen/svg-spritemap-webpack-plugin/blob/master/docs/options.md#options}
    */
  @js.native
  trait Options extends StObject {
    
    /**
      * The input object contains the configuration for the input of the plugin.
      */
    var input: js.UndefOr[typings.svgSpritemapWebpackPlugin.anon.Options] = js.native
    
    /**
      * The output object contains the configuration for the main output (SVG) of the plugin.
      */
    var output: js.UndefOr[Chunk] = js.native
    
    /**
      * The sprite object contains the configuration for the generated sprites in the output spritemap.
      */
    var sprite: js.UndefOr[Generate] = js.native
    
    var styles: js.UndefOr[Boolean | String | Filename] = js.native
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
      def setInput(value: typings.svgSpritemapWebpackPlugin.anon.Options): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setOutput(value: Chunk): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setSprite(value: Generate): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpriteUndefined: Self = StObject.set(x, "sprite", js.undefined)
      
      @scala.inline
      def setStyles(value: Boolean | String | Filename): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait SVGSpritemapPlugin extends Plugin {
    
    val directories: js.Array[String] = js.native
    
    val files: js.Array[String] = js.native
    
    /* private */ def getContentHash(source: String): String = js.native
    
    /* private */ def getSpritemapHashes(
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any
    ): js.Array[String] = js.native
    
    /* private */ def getStylesHashes(
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any
    ): js.Array[String] = js.native
    
    /* private */ def getStylesType(styles: js.Object): js.UndefOr[asset | dir | module] = js.native
    /* private */ def getStylesType(styles: js.Object, filename: String): js.UndefOr[asset | dir | module] = js.native
    
    /* private */ def hashFilename(fileaname: String): String = js.native
    /* private */ def hashFilename(fileaname: String, hashes: js.Array[String]): String = js.native
    
    /* private */ def rewriteAssetsHashes(filename: String): Assets = js.native
    /* private */ def rewriteAssetsHashes(filename: String, assets: js.UndefOr[scala.Nothing], hashes: js.Array[String]): Assets = js.native
    /* private */ def rewriteAssetsHashes(filename: String, assets: js.Object): Assets = js.native
    /* private */ def rewriteAssetsHashes(filename: String, assets: js.Object, hashes: js.Array[String]): Assets = js.native
    
    /* private */ def updateDependencies(): Unit = js.native
    
    /* private */ def writeStylesToDisk(styles: js.Object, `type`: String): Unit = js.native
  }
}
