package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteUserInfo extends js.Object {
  var userId: String
}

object RemoteUserInfo {
  @scala.inline
  def apply(userId: String): RemoteUserInfo = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteUserInfo]
  }
}

