package typings.workboxDashBackgroundDashSync

import typings.workboxDashBackgroundDashSync.queueMod.QueueOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-background-sync", JSImport.Namespace)
@js.native
object workboxDashBackgroundDashSyncMod extends js.Object {
  @js.native
  class Plugin protected ()
    extends typings.workboxDashBackgroundDashSync.pluginMod.Plugin {
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
  }
  
  @js.native
  class Queue protected ()
    extends typings.workboxDashBackgroundDashSync.queueMod.Queue {
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
  }
  
}

