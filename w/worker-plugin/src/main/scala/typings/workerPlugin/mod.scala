package typings.workerPlugin

import typings.workerPlugin.workerPluginBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin * / any */ @JSImport("worker-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends StObject {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var globalObject: js.UndefOr[`false` | String] = js.undefined
    
    var plugins: js.UndefOr[
        js.Array[
          String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin */ js.Any)
        ]
      ] = js.undefined
    
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
      
      inline def setGlobalObject(value: `false` | String): Self = StObject.set(x, "globalObject", value.asInstanceOf[js.Any])
      
      inline def setGlobalObjectUndefined: Self = StObject.set(x, "globalObject", js.undefined)
      
      inline def setPlugins(
        value: js.Array[
              String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin */ js.Any)
            ]
      ): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(
        value: (String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin */ js.Any))*
      ): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
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
  
  type WorkerPlugin = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin */ js.Any
}
