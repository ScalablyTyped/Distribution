package typings.webpackLivereloadPlugin

import typings.std.Plugin
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-livereload-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with LiveReloadPlugin {
    def this(options: Options) = this()
  }
  
  @js.native
  trait LiveReloadPlugin
    extends StObject
       with Plugin {
    
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
  
  trait Options extends StObject {
    
    /**
      * livereload `<script>` automatically to `<head>`.
      * @default false
      */
    var appendScriptTag: js.UndefOr[Boolean] = js.undefined
    
    /**
      * amount of milliseconds by which to delay the live reload (in case build takes longer)
      * @default 0
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * he desired hostname for the appended `<script>` (if present) to point to
      * @default hostname of the page, like `localhost` or 10.0.2.2
      */
    var hostname: js.UndefOr[String] = js.undefined
    
    /**
      * RegExp of files to ignore. Null value means ignore nothing.
      * It is also possible to define an array and use multiple anymatch patterns
      */
    var ignore: js.UndefOr[RegExp | js.Array[RegExp] | Null] = js.undefined
    
    /**
      * The desired port for the livereload server.
      * If you define port 0, an available port will be searched for, starting from 35729.
      * @default 35729
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * protocol for livereload `<script>` src attribute value
      * @default protocol of the page, either `http` or `https`
      */
    var protocol: js.UndefOr[String] = js.undefined
    
    /**
      * create hash for each file source and only notify livereload if hash has changed
      * @default false
      */
    var useSourceHash: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAppendScriptTag(value: Boolean): Self = StObject.set(x, "appendScriptTag", value.asInstanceOf[js.Any])
      
      inline def setAppendScriptTagUndefined: Self = StObject.set(x, "appendScriptTag", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setIgnore(value: RegExp | js.Array[RegExp]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNull: Self = StObject.set(x, "ignore", null)
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: RegExp*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setUseSourceHash(value: Boolean): Self = StObject.set(x, "useSourceHash", value.asInstanceOf[js.Any])
      
      inline def setUseSourceHashUndefined: Self = StObject.set(x, "useSourceHash", js.undefined)
    }
  }
}
