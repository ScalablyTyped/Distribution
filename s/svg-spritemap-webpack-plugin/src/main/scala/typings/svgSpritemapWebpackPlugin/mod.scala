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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svg-spritemap-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with SVGSpritemapPlugin {
    def this(pattern: String) = this()
    def this(pattern: js.Array[String]) = this()
    def this(pattern: String, options: Options) = this()
    def this(pattern: js.Array[String], options: Options) = this()
    def this(pattern: Unit, options: Options) = this()
  }
  
  /**
    * @see {@link https://github.com/cascornelissen/svg-spritemap-webpack-plugin/blob/master/docs/options.md#options}
    */
  trait Options extends StObject {
    
    /**
      * The input object contains the configuration for the input of the plugin.
      */
    var input: js.UndefOr[typings.svgSpritemapWebpackPlugin.anon.Options] = js.undefined
    
    /**
      * The output object contains the configuration for the main output (SVG) of the plugin.
      */
    var output: js.UndefOr[Chunk] = js.undefined
    
    /**
      * The sprite object contains the configuration for the generated sprites in the output spritemap.
      */
    var sprite: js.UndefOr[Generate] = js.undefined
    
    var styles: js.UndefOr[Boolean | String | Filename] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setInput(value: typings.svgSpritemapWebpackPlugin.anon.Options): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setOutput(value: Chunk): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setSprite(value: Generate): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
      
      inline def setSpriteUndefined: Self = StObject.set(x, "sprite", js.undefined)
      
      inline def setStyles(value: Boolean | String | Filename): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait SVGSpritemapPlugin
    extends StObject
       with Plugin {
    
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
    /* private */ def rewriteAssetsHashes(filename: String, assets: js.Object): Assets = js.native
    /* private */ def rewriteAssetsHashes(filename: String, assets: js.Object, hashes: js.Array[String]): Assets = js.native
    /* private */ def rewriteAssetsHashes(filename: String, assets: Unit, hashes: js.Array[String]): Assets = js.native
    
    /* private */ def updateDependencies(): Unit = js.native
    
    /* private */ def writeStylesToDisk(styles: js.Object, `type`: String): Unit = js.native
  }
}
