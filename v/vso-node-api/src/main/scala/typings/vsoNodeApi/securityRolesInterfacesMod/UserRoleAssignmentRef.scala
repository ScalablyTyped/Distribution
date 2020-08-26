package typings.vsoNodeApi.securityRolesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserRoleAssignmentRef extends js.Object {
  /**
    * The name of the role assigned.
    */
  var roleName: String = js.native
  /**
    * Identifier of the user given the role assignment.
    */
  var uniqueName: String = js.native
  /**
    * Unique id of the user given the role assignment.
    */
  var userId: String = js.native
}

object UserRoleAssignmentRef {
  @scala.inline
  def apply(roleName: String, uniqueName: String, userId: String): UserRoleAssignmentRef = {
    val __obj = js.Dynamic.literal(roleName = roleName.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRoleAssignmentRef]
  }
  @scala.inline
  implicit class UserRoleAssignmentRefOps[Self <: UserRoleAssignmentRef] (val x: Self) extends AnyVal {
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
    def setRoleName(value: String): Self = this.set("roleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueName(value: String): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
  
}

