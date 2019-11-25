package typings.twilioDashChat.libSessionMod

import typings.twilioDashSync.twilioDashSyncMod.SyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionServices extends js.Object {
  var syncClient: SyncClient
}

object SessionServices {
  @scala.inline
  def apply(syncClient: SyncClient): SessionServices = {
    val __obj = js.Dynamic.literal(syncClient = syncClient.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SessionServices]
  }
}

