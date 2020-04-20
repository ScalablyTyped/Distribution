package typings.workboxBackgroundSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queueMod {
  type QueueOnSyncHandler = js.Function1[
    /* options */ typings.workboxBackgroundSync.queueMod.QueueOnSyncEvent, 
    scala.Unit | js.Promise[scala.Unit]
  ]
}
