package typings.twilioChat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Identity extends js.Object {
  var identity: String = js.native
  var user: String = js.native
}

object Identity {
  @scala.inline
  def apply(identity: String, user: String): Identity = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
  @scala.inline
  implicit class IdentityOps[Self <: Identity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdentity(value: String): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

