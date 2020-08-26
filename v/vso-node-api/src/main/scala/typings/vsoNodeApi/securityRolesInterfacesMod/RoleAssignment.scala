package typings.vsoNodeApi.securityRolesInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleAssignment extends js.Object {
  /**
    * Designates the role as explicitly assigned or inherited.
    */
  var access: RoleAccess = js.native
  /**
    * User friendly description of access assignment.
    */
  var accessDisplayName: String = js.native
  /**
    * The user to whom the role is assigned.
    */
  var identity: IdentityRef = js.native
  /**
    * The role assigned to the user.
    */
  var role: SecurityRole = js.native
}

object RoleAssignment {
  @scala.inline
  def apply(access: RoleAccess, accessDisplayName: String, identity: IdentityRef, role: SecurityRole): RoleAssignment = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], accessDisplayName = accessDisplayName.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleAssignment]
  }
  @scala.inline
  implicit class RoleAssignmentOps[Self <: RoleAssignment] (val x: Self) extends AnyVal {
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
    def setAccess(value: RoleAccess): Self = this.set("access", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessDisplayName(value: String): Self = this.set("accessDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentity(value: IdentityRef): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: SecurityRole): Self = this.set("role", value.asInstanceOf[js.Any])
  }
  
}

