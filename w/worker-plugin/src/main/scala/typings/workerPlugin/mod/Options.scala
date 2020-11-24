package typings.workerPlugin.mod

import typings.workerPlugin.workerPluginBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var globalObject: js.UndefOr[`false` | String] = js.native
  
  var plugins: js.UndefOr[
    js.Array[
      String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin */ _)
    ]
  ] = js.native
  
  var preserveTypeModule: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to `true`, this option enables the bundling of [SharedWorker](https://developer.mozilla.org/en-US/docs/Web/API/SharedWorker)
    */
  var sharedWorker: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to `false`, this option disables the bundling of [Worker].
    * Intended to be used with `{ sharedWorker: true }` to allow bundling of [SharedWorker] only without also bundling [Worker].
    */
  var worker: js.UndefOr[Boolean] = js.native
  
  /**
    * Normally, WorkerPlugin will transform `new Worker('./a.js', { type: 'module' })`
    * to completely remove the `type` option, outputting something like `new Worker('a.worker.js')`.
    * This allows the plugin to compile Module Workers to Classic Workers, which are supported in all browsers.
    */
  var workerType: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGlobalObject(value: `false` | String): Self = this.set("globalObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalObject: Self = this.set("globalObject", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: (String | js.Any)*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(
      value: js.Array[
          String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin */ _)
        ]
    ): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPreserveTypeModule(value: Boolean): Self = this.set("preserveTypeModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveTypeModule: Self = this.set("preserveTypeModule", js.undefined)
    
    @scala.inline
    def setSharedWorker(value: Boolean): Self = this.set("sharedWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedWorker: Self = this.set("sharedWorker", js.undefined)
    
    @scala.inline
    def setWorker(value: Boolean): Self = this.set("worker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorker: Self = this.set("worker", js.undefined)
    
    @scala.inline
    def setWorkerType(value: String): Self = this.set("workerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerType: Self = this.set("workerType", js.undefined)
  }
}
