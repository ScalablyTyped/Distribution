package typings.webpackShellPlugin

import typings.webpack.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("webpack-shell-plugin", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Switch for development environments.
      * This causes scripts to execute once.
      * Useful for running HMR on webpack-dev-server or webpack watch mode.
      * @default true
      */
    var dev: js.UndefOr[Boolean] = js.undefined
    
    /**
      * scripts to execute after files are emitted at the end of the compilation
      * @default []
      */
    var onBuildEnd: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * scripts to execute after webpack process is complete
      * @default []
      */
    var onBuildExit: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * scripts to execute on the initial build
      * @default []
      */
    var onBuildStart: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Switches script execution process from spawn to exec.
      * If running into problems with spawn, turn this setting on.
      * @default false
      */
    var safe: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable for verbose output
      * @deprecated
      * @default false
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setOnBuildEnd(value: js.Array[String]): Self = StObject.set(x, "onBuildEnd", value.asInstanceOf[js.Any])
      
      inline def setOnBuildEndUndefined: Self = StObject.set(x, "onBuildEnd", js.undefined)
      
      inline def setOnBuildEndVarargs(value: String*): Self = StObject.set(x, "onBuildEnd", js.Array(value*))
      
      inline def setOnBuildExit(value: js.Array[String]): Self = StObject.set(x, "onBuildExit", value.asInstanceOf[js.Any])
      
      inline def setOnBuildExitUndefined: Self = StObject.set(x, "onBuildExit", js.undefined)
      
      inline def setOnBuildExitVarargs(value: String*): Self = StObject.set(x, "onBuildExit", js.Array(value*))
      
      inline def setOnBuildStart(value: js.Array[String]): Self = StObject.set(x, "onBuildStart", value.asInstanceOf[js.Any])
      
      inline def setOnBuildStartUndefined: Self = StObject.set(x, "onBuildStart", js.undefined)
      
      inline def setOnBuildStartVarargs(value: String*): Self = StObject.set(x, "onBuildStart", js.Array(value*))
      
      inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  type WebpackShellPlugin = Plugin
}
