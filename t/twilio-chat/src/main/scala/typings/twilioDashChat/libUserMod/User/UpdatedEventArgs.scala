package typings.twilioDashChat.libUserMod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatedEventArgs extends js.Object {
  var updateReasons: js.Array[UpdateReason]
  var user: typings.twilioDashChat.libUserMod.User
}

object UpdatedEventArgs {
  @scala.inline
  def apply(updateReasons: js.Array[UpdateReason], user: typings.twilioDashChat.libUserMod.User): UpdatedEventArgs = {
    val __obj = js.Dynamic.literal(updateReasons = updateReasons, user = user)
  
    __obj.asInstanceOf[UpdatedEventArgs]
  }
}

