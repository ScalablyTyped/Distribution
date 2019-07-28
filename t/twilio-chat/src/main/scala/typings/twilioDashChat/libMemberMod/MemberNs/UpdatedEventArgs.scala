package typings.twilioDashChat.libMemberMod.MemberNs

import typings.twilioDashChat.libMemberMod.Member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatedEventArgs extends js.Object {
  var member: Member
  var updateReasons: js.Array[UpdateReason]
}

object UpdatedEventArgs {
  @scala.inline
  def apply(member: Member, updateReasons: js.Array[UpdateReason]): UpdatedEventArgs = {
    val __obj = js.Dynamic.literal(member = member, updateReasons = updateReasons)
  
    __obj.asInstanceOf[UpdatedEventArgs]
  }
}

