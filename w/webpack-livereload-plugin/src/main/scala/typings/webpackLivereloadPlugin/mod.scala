package typings.webpackLivereloadPlugin

import typings.std.Plugin
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-livereload-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends LiveReloadPlugin {
    def this(options: Options) = this()
  }
  
  @js.native
  trait LiveReloadPlugin extends Plugin {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
    
    def applyCompilation(
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any
    ): Unit = js.native
    
    def autoloadJs(): String = js.native
    
    def done(
      stats: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stats */ js.Any
    ): Unit = js.native
    
    def failed(): Unit = js.native
    
    val isRunning: Boolean = js.native
    
    def scriptTag(source: String): String = js.native
    
    def start(watching: js.Any, cb: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * livereload `<script>` automatically to `<head>`.
      * @default false
      */
    var appendScriptTag: js.UndefOr[Boolean] = js.native
    
    /**
      * amount of milliseconds by which to delay the live reload (in case build takes longer)
      * @default 0
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * he desired hostname for the appended `<script>` (if present) to point to
      * @default hostname of the page, like `localhost` or 10.0.2.2
      */
    var hostname: js.UndefOr[String] = js.native
    
    /**
      * RegExp of files to ignore. Null value means ignore nothing.
      * It is also possible to define an array and use multiple anymatch patterns
      */
    var ignore: js.UndefOr[RegExp | js.Array[RegExp] | Null] = js.native
    
    /**
      * The desired port for the livereload server.
      * If you define port 0, an available port will be searched for, starting from 35729.
      * @default 35729
      */
    var port: js.UndefOr[Double] = js.native
    
    /**
      * protocol for livereload `<script>` src attribute value
      * @default protocol of the page, either `http` or `https`
      */
    var protocol: js.UndefOr[String] = js.native
    
    /**
      * create hash for each file source and only notify livereload if hash has changed
      * @default false
      */
    var useSourceHash: js.UndefOr[Boolean] = js.native
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
      def setAppendScriptTag(value: Boolean): Self = StObject.set(x, "appendScriptTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendScriptTagUndefined: Self = StObject.set(x, "appendScriptTag", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setIgnore(value: RegExp | js.Array[RegExp]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreNull: Self = StObject.set(x, "ignore", null)
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: RegExp*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setUseSourceHash(value: Boolean): Self = StObject.set(x, "useSourceHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSourceHashUndefined: Self = StObject.set(x, "useSourceHash", js.undefined)
    }
  }
}
