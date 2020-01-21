package typings.workboxBackgroundSync

import typings.workboxBackgroundSync.queueMod.QueueOptions
import typings.workboxCore.workboxPluginMod.FetchDidFailCallback
import typings.workboxCore.workboxPluginMod.FetchDidFailCallbackParam
import typings.workboxCore.workboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-background-sync/Plugin", JSImport.Namespace)
@js.native
object pluginMod extends js.Object {
  @js.native
  class Plugin protected () extends WorkboxPlugin {
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
    @JSName("fetchDidFail")
    var fetchDidFail_Original: FetchDidFailCallback = js.native
    @JSName("fetchDidFail")
    def fetchDidFail_MPlugin(param: FetchDidFailCallbackParam): js.Promise[Unit] = js.native
  }
  
}

