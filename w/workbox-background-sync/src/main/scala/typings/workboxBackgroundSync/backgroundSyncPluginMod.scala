package typings.workboxBackgroundSync

import typings.workboxBackgroundSync.queueMod.QueueOptions
import typings.workboxCore.typesMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backgroundSyncPluginMod {
  
  /**
    * A class implementing the `fetchDidFail` lifecycle callback. This makes it
    * easier to add failed requests to a background sync Queue.
    *
    * @memberof workbox-background-sync
    */
  @JSImport("workbox-background-sync/BackgroundSyncPlugin", "BackgroundSyncPlugin")
  @js.native
  open class BackgroundSyncPlugin protected ()
    extends StObject
       with WorkboxPlugin {
    /**
      * @param {string} name See the {@link workbox-background-sync.Queue}
      *     documentation for parameter details.
      * @param {Object} [options] See the
      *     {@link workbox-background-sync.Queue} documentation for
      *     parameter details.
      */
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
    
    /* private */ val _queue: Any = js.native
  }
}
