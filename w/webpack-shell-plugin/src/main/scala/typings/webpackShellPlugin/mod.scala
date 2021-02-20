package typings.webpackShellPlugin

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-shell-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends Plugin {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Switch for development environments.
      * This causes scripts to execute once.
      * Useful for running HMR on webpack-dev-server or webpack watch mode.
      * @default true
      */
    var dev: js.UndefOr[Boolean] = js.native
    
    /**
      * scripts to execute after files are emitted at the end of the compilation
      * @default []
      */
    var onBuildEnd: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * scripts to execute after webpack process is complete
      * @default []
      */
    var onBuildExit: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * scripts to execute on the initial build
      * @default []
      */
    var onBuildStart: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Switches script execution process from spawn to exec.
      * If running into problems with spawn, turn this setting on.
      * @default false
      */
    var safe: js.UndefOr[Boolean] = js.native
    
    /**
      * Enable for verbose output
      * @deprecated
      * @default false
      */
    var verbose: js.UndefOr[Boolean] = js.native
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
      def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      @scala.inline
      def setOnBuildEnd(value: js.Array[String]): Self = StObject.set(x, "onBuildEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBuildEndUndefined: Self = StObject.set(x, "onBuildEnd", js.undefined)
      
      @scala.inline
      def setOnBuildEndVarargs(value: String*): Self = StObject.set(x, "onBuildEnd", js.Array(value :_*))
      
      @scala.inline
      def setOnBuildExit(value: js.Array[String]): Self = StObject.set(x, "onBuildExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBuildExitUndefined: Self = StObject.set(x, "onBuildExit", js.undefined)
      
      @scala.inline
      def setOnBuildExitVarargs(value: String*): Self = StObject.set(x, "onBuildExit", js.Array(value :_*))
      
      @scala.inline
      def setOnBuildStart(value: js.Array[String]): Self = StObject.set(x, "onBuildStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBuildStartUndefined: Self = StObject.set(x, "onBuildStart", js.undefined)
      
      @scala.inline
      def setOnBuildStartVarargs(value: String*): Self = StObject.set(x, "onBuildStart", js.Array(value :_*))
      
      @scala.inline
      def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  type WebpackShellPlugin = Plugin
}
