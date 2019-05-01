package typings
package twilioDashChatLib.libMemberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberServices extends js.Object {
  var session: twilioDashChatLib.libSessionMod.Session
  var users: twilioDashChatLib.libDataUsersMod.Users
}

object MemberServices {
  @scala.inline
  def apply(session: twilioDashChatLib.libSessionMod.Session, users: twilioDashChatLib.libDataUsersMod.Users): MemberServices = {
    val __obj = js.Dynamic.literal(session = session, users = users)
  
    __obj.asInstanceOf[MemberServices]
  }
}

