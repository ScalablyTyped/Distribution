package typings.workboxBackgroundSync

import typings.workboxBackgroundSync.queueMod.QueueOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-background-sync", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Plugin protected ()
    extends typings.workboxBackgroundSync.pluginMod.Plugin {
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
  }
  
  @js.native
  class Queue protected ()
    extends typings.workboxBackgroundSync.queueMod.Queue {
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
  }
  
}

