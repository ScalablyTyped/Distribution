package typings.twilioChat.memberMod

import typings.twilioChat.sessionMod.Session
import typings.twilioChat.usersMod.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberServices extends js.Object {
  var session: Session
  var users: Users
}

object MemberServices {
  @scala.inline
  def apply(session: Session, users: Users): MemberServices = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MemberServices]
  }
}

