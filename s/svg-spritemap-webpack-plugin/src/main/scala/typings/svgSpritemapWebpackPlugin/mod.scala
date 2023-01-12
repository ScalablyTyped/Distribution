package typings.svgSpritemapWebpackPlugin

import typings.glob.mod.IOptions
import typings.svgSpritemapWebpackPlugin.anon.Assets
import typings.svgSpritemapWebpackPlugin.anon.Callback
import typings.svgSpritemapWebpackPlugin.anon.Chunk
import typings.svgSpritemapWebpackPlugin.anon.Generate
import typings.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginStrings.asset
import typings.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginStrings.dir
import typings.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginStrings.module
import typings.webpack.mod.Compiler
import typings.webpack.mod.WebpackPluginInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svg-spritemap-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with SVGSpritemapPlugin {
    def this(pattern: String) = this()
    def this(pattern: js.Array[String]) = this()
    def this(pattern: String, options: Options) = this()
    def this(pattern: js.Array[String], options: Options) = this()
    def this(pattern: Unit, options: Options) = this()
    
    /**
    	 * The run point of the plugin, required method.
    	 */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  trait InputOptions extends StObject {
    
    /**
      * Allow the usage of the same input SVG multiple times.
      * This option work well together with the `sprite.idify` option to set a different name in the output file.
      * @default false
      */
    var allowDuplicates: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Options object to pass to [`glob`](http://npmjs.com/package/glob) to find the sprites.
      */
    var options: js.UndefOr[IOptions] = js.undefined
  }
  object InputOptions {
    
    inline def apply(): InputOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowDuplicates(value: Boolean): Self = StObject.set(x, "allowDuplicates", value.asInstanceOf[js.Any])
      
      inline def setAllowDuplicatesUndefined: Self = StObject.set(x, "allowDuplicates", js.undefined)
      
      inline def setOptions(value: IOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  /**
    * @see {@link https://github.com/cascornelissen/svg-spritemap-webpack-plugin/blob/master/docs/options.md#options}
    */
  trait Options extends StObject {
    
    /**
      * The input object contains the configuration for the input of the plugin.
      */
    var input: js.UndefOr[InputOptions] = js.undefined
    
    /**
      * The output object contains the configuration for the main output (SVG) of the plugin.
      */
    var output: js.UndefOr[Chunk] = js.undefined
    
    /**
      * The sprite object contains the configuration for the generated sprites in the output spritemap.
      */
    var sprite: js.UndefOr[Generate] = js.undefined
    
    var styles: js.UndefOr[Boolean | String | Callback] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setInput(value: InputOptions): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setOutput(value: Chunk): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setSprite(value: Generate): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
      
      inline def setSpriteUndefined: Self = StObject.set(x, "sprite", js.undefined)
      
      inline def setStyles(value: Boolean | String | Callback): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait SVGSpritemapPlugin
    extends StObject
       with WebpackPluginInstance {
    
    val directories: js.Array[String] = js.native
    
    /* private */ def getContentHash(source: String): String = js.native
    
    /* private */ def getSpritemapHashes(compilation: Any): js.Array[String] = js.native
    
    /* private */ def getStylesHashes(compilation: Any): js.Array[String] = js.native
    
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
