package typings.webpackLivereloadPlugin

import typings.node.bufferMod.global.Buffer
import typings.node.tlsMod.KeyObject
import typings.node.tlsMod.PxfObject
import typings.webpack.mod.Compiler
import typings.webpack.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-livereload-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with LiveReloadPlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    /* CompleteClass */
    override def applyCompilation(
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ Any
    ): Unit = js.native
    
    /* CompleteClass */
    override def autoloadJs(): String = js.native
    
    /* CompleteClass */
    override def done(stats: Stats): Unit = js.native
    
    /* CompleteClass */
    override def failed(): Unit = js.native
    
    /* CompleteClass */
    override val isRunning: Boolean = js.native
    
    /* CompleteClass */
    override def scriptTag(source: String): String = js.native
    
    /* CompleteClass */
    override def start(watching: Any, cb: js.Function0[Unit]): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ trait LiveReloadPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
    
    def applyCompilation(
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ Any
    ): Unit
    
    def autoloadJs(): String
    
    def done(stats: Stats): Unit
    
    def failed(): Unit
    
    val isRunning: Boolean
    
    def scriptTag(source: String): String
    
    def start(watching: Any, cb: js.Function0[Unit]): Unit
  }
  object LiveReloadPlugin {
    
    inline def apply(
      apply: Compiler => Unit,
      applyCompilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ Any => Unit,
      autoloadJs: () => String,
      done: Stats => Unit,
      failed: () => Unit,
      isRunning: Boolean,
      scriptTag: String => String,
      start: (Any, js.Function0[Unit]) => Unit
    ): LiveReloadPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), applyCompilation = js.Any.fromFunction1(applyCompilation), autoloadJs = js.Any.fromFunction0(autoloadJs), done = js.Any.fromFunction1(done), failed = js.Any.fromFunction0(failed), isRunning = isRunning.asInstanceOf[js.Any], scriptTag = js.Any.fromFunction1(scriptTag), start = js.Any.fromFunction2(start))
      __obj.asInstanceOf[LiveReloadPlugin]
    }
    
    extension [Self <: LiveReloadPlugin](x: Self) {
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setApplyCompilation(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ Any => Unit
      ): Self = StObject.set(x, "applyCompilation", js.Any.fromFunction1(value))
      
      inline def setAutoloadJs(value: () => String): Self = StObject.set(x, "autoloadJs", js.Any.fromFunction0(value))
      
      inline def setDone(value: Stats => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
      
      inline def setFailed(value: () => Unit): Self = StObject.set(x, "failed", js.Any.fromFunction0(value))
      
      inline def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
      
      inline def setScriptTag(value: String => String): Self = StObject.set(x, "scriptTag", js.Any.fromFunction1(value))
      
      inline def setStart(value: (Any, js.Function0[Unit]) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    }
  }
  
  /* Inlined parent std.Pick<node.https.ServerOptions<new (socket : node.node:net.Socket): node.node:http.IncomingMessage, new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request>>, 'cert' | 'key' | 'pfx'> */
  trait Options extends StObject {
    
    /**
      * livereload `<script>` automatically to `<head>`.
      * @default false
      */
    var appendScriptTag: js.UndefOr[Boolean] = js.undefined
    
    var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
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
    var ignore: js.UndefOr[js.RegExp | js.Array[js.RegExp] | Null] = js.undefined
    
    var key: js.UndefOr[String | Buffer | (js.Array[String | Buffer | KeyObject])] = js.undefined
    
    var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | PxfObject])] = js.undefined
    
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
      
      inline def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value*))
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setIgnore(value: js.RegExp | js.Array[js.RegExp]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNull: Self = StObject.set(x, "ignore", null)
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: js.RegExp*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setKey(value: String | Buffer | (js.Array[String | Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeyVarargs(value: (String | Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = StObject.set(x, "pfx", js.Array(value*))
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setUseSourceHash(value: Boolean): Self = StObject.set(x, "useSourceHash", value.asInstanceOf[js.Any])
      
      inline def setUseSourceHashUndefined: Self = StObject.set(x, "useSourceHash", js.undefined)
    }
  }
}
