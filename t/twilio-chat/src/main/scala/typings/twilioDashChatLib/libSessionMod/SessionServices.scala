package typings
package twilioDashChatLib.libSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionServices extends js.Object {
  var syncClient: twilioDashSyncLib.twilioDashSyncMod.SyncClient
}

object SessionServices {
  @scala.inline
  def apply(syncClient: twilioDashSyncLib.twilioDashSyncMod.SyncClient): SessionServices = {
    val __obj = js.Dynamic.literal(syncClient = syncClient)
  
    __obj.asInstanceOf[SessionServices]
  }
}

