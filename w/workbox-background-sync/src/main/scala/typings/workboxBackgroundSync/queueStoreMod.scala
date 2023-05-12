package typings.workboxBackgroundSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueStoreMod {
  
  @JSImport("workbox-background-sync/QueueStore", "QueueStore")
  @js.native
  open class QueueStore protected ()
    extends typings.workboxBackgroundSync.libQueueStoreMod.QueueStore {
    /**
      * Associates this instance with a Queue instance, so entries added can be
      * identified by their queue name.
      *
      * @param {string} queueName
      */
    def this(queueName: String) = this()
  }
}
