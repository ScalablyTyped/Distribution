package typings.workboxBackgroundSync

import typings.workboxBackgroundSync.queueMod.QueueOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-background-sync", "Plugin")
  @js.native
  class Plugin protected ()
    extends typings.workboxBackgroundSync.pluginMod.Plugin {
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
  }
  
  @JSImport("workbox-background-sync", "Queue")
  @js.native
  class Queue protected ()
    extends typings.workboxBackgroundSync.queueMod.Queue {
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
  }
}
