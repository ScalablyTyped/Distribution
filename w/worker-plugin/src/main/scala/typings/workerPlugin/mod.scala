package typings.workerPlugin

import typings.webpack.mod.Plugin
import typings.workerPlugin.workerPluginBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("worker-plugin", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var chunkFilename: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var globalObject: js.UndefOr[`false` | String] = js.undefined
    
    var plugins: js.UndefOr[js.Array[String | Plugin]] = js.undefined
    
    var preserveTypeModule: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to `true`, this option enables the bundling of [SharedWorker](https://developer.mozilla.org/en-US/docs/Web/API/SharedWorker)
      */
    var sharedWorker: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to `false`, this option disables the bundling of [Worker].
      * Intended to be used with `{ sharedWorker: true }` to allow bundling of [SharedWorker] only without also bundling [Worker].
      */
    var worker: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Normally, WorkerPlugin will transform `new Worker('./a.js', { type: 'module' })`
      * to completely remove the `type` option, outputting something like `new Worker('a.worker.js')`.
      * This allows the plugin to compile Module Workers to Classic Workers, which are supported in all browsers.
      */
    var workerType: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setChunkFilename(value: String): Self = StObject.set(x, "chunkFilename", value.asInstanceOf[js.Any])
      
      inline def setChunkFilenameUndefined: Self = StObject.set(x, "chunkFilename", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setGlobalObject(value: `false` | String): Self = StObject.set(x, "globalObject", value.asInstanceOf[js.Any])
      
      inline def setGlobalObjectUndefined: Self = StObject.set(x, "globalObject", js.undefined)
      
      inline def setPlugins(value: js.Array[String | Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (String | Plugin)*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPreserveTypeModule(value: Boolean): Self = StObject.set(x, "preserveTypeModule", value.asInstanceOf[js.Any])
      
      inline def setPreserveTypeModuleUndefined: Self = StObject.set(x, "preserveTypeModule", js.undefined)
      
      inline def setSharedWorker(value: Boolean): Self = StObject.set(x, "sharedWorker", value.asInstanceOf[js.Any])
      
      inline def setSharedWorkerUndefined: Self = StObject.set(x, "sharedWorker", js.undefined)
      
      inline def setWorker(value: Boolean): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      inline def setWorkerType(value: String): Self = StObject.set(x, "workerType", value.asInstanceOf[js.Any])
      
      inline def setWorkerTypeUndefined: Self = StObject.set(x, "workerType", js.undefined)
      
      inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
    }
  }
  
  type WorkerPlugin = Plugin
}
