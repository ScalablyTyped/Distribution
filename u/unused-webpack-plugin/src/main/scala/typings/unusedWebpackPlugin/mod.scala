package typings.unusedWebpackPlugin

import typings.webpack.mod.Compiler
import typings.webpack.mod.WebpackPluginInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A webpack plugin to find unused modules/source files.
    *
    * @link https://github.com/MatthieuLemoine/unused-webpack-plugin
    */
  @JSImport("unused-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with UnusedWebpackPlugin {
    def this(options: UnusedWebpackPluginOptions) = this()
    
    /**
    	 * The run point of the plugin, required method.
    	 */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  /**
    * A webpack plugin to find unused modules/source files.
    *
    * @link https://github.com/MatthieuLemoine/unused-webpack-plugin
    */
  trait UnusedWebpackPlugin
    extends StObject
       with WebpackPluginInstance
  object UnusedWebpackPlugin {
    
    inline def apply(apply: Compiler => Unit): UnusedWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[UnusedWebpackPlugin]
    }
  }
  
  trait UnusedWebpackPluginOptions extends StObject {
    
    /**
      * Array of directories where to look for unused source files.
      *
      * @default []
      */
    var directories: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Array of exclude patterns when looking for unused source files.
      *
      * @default []
      */
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether or not the build should fail if unused files are found.
      *
      * @default false
      */
    var failOnUnused: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Root directory that will be use to display relative paths instead of absolute ones.
      */
    var root: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not to respect .gitignore file.
      *
      * @default true
      */
    var useGitIgnore: js.UndefOr[Boolean] = js.undefined
  }
  object UnusedWebpackPluginOptions {
    
    inline def apply(): UnusedWebpackPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnusedWebpackPluginOptions]
    }
    
    extension [Self <: UnusedWebpackPluginOptions](x: Self) {
      
      inline def setDirectories(value: js.Array[String]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      inline def setDirectoriesVarargs(value: String*): Self = StObject.set(x, "directories", js.Array(value*))
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setFailOnUnused(value: Boolean): Self = StObject.set(x, "failOnUnused", value.asInstanceOf[js.Any])
      
      inline def setFailOnUnusedUndefined: Self = StObject.set(x, "failOnUnused", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setUseGitIgnore(value: Boolean): Self = StObject.set(x, "useGitIgnore", value.asInstanceOf[js.Any])
      
      inline def setUseGitIgnoreUndefined: Self = StObject.set(x, "useGitIgnore", js.undefined)
    }
  }
}
