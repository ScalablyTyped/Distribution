package typings.workboxDashBackgroundDashSync

import typings.workboxDashBackgroundDashSync.queueMod.QueueOptions
import typings.workboxDashCore.typesWorkboxPluginMod.FetchDidFailCallback
import typings.workboxDashCore.typesWorkboxPluginMod.FetchDidFailCallbackParam
import typings.workboxDashCore.typesWorkboxPluginMod.WorkboxPlugin
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

