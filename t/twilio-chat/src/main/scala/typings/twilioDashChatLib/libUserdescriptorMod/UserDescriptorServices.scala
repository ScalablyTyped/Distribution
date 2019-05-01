package typings
package twilioDashChatLib.libUserdescriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDescriptorServices extends js.Object {
  var users: twilioDashChatLib.libDataUsersMod.Users
}

object UserDescriptorServices {
  @scala.inline
  def apply(users: twilioDashChatLib.libDataUsersMod.Users): UserDescriptorServices = {
    val __obj = js.Dynamic.literal(users = users)
  
    __obj.asInstanceOf[UserDescriptorServices]
  }
}

