package typings.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMembership extends js.Object {
  var active: Boolean = js.native
  var descriptor: IdentityDescriptor = js.native
  var id: String = js.native
  var queriedId: String = js.native
}

object GroupMembership {
  @scala.inline
  def apply(active: Boolean, descriptor: IdentityDescriptor, id: String, queriedId: String): GroupMembership = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], queriedId = queriedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMembership]
  }
  @scala.inline
  implicit class GroupMembershipOps[Self <: GroupMembership] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescriptor(value: IdentityDescriptor): Self = this.set("descriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueriedId(value: String): Self = this.set("queriedId", value.asInstanceOf[js.Any])
  }
  
}

