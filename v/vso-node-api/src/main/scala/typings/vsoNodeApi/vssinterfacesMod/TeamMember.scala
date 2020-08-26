package typings.vsoNodeApi.vssinterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamMember extends js.Object {
  var identity: IdentityRef = js.native
  var isTeamAdmin: Boolean = js.native
}

object TeamMember {
  @scala.inline
  def apply(identity: IdentityRef, isTeamAdmin: Boolean): TeamMember = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], isTeamAdmin = isTeamAdmin.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamMember]
  }
  @scala.inline
  implicit class TeamMemberOps[Self <: TeamMember] (val x: Self) extends AnyVal {
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
    def setIdentity(value: IdentityRef): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTeamAdmin(value: Boolean): Self = this.set("isTeamAdmin", value.asInstanceOf[js.Any])
  }
  
}

