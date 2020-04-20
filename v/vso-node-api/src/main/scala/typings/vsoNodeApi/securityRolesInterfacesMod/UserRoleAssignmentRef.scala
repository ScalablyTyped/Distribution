package typings.vsoNodeApi.securityRolesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRoleAssignmentRef extends js.Object {
  /**
    * The name of the role assigned.
    */
  var roleName: String
  /**
    * Identifier of the user given the role assignment.
    */
  var uniqueName: String
  /**
    * Unique id of the user given the role assignment.
    */
  var userId: String
}

object UserRoleAssignmentRef {
  @scala.inline
  def apply(roleName: String, uniqueName: String, userId: String): UserRoleAssignmentRef = {
    val __obj = js.Dynamic.literal(roleName = roleName.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRoleAssignmentRef]
  }
}

