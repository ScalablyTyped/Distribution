package typings.twilioChat.userMod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatedEventArgs extends js.Object {
  var updateReasons: js.Array[UpdateReason]
  var user: typings.twilioChat.userMod.User
}

object UpdatedEventArgs {
  @scala.inline
  def apply(updateReasons: js.Array[UpdateReason], user: typings.twilioChat.userMod.User): UpdatedEventArgs = {
    val __obj = js.Dynamic.literal(updateReasons = updateReasons.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatedEventArgs]
  }
}

