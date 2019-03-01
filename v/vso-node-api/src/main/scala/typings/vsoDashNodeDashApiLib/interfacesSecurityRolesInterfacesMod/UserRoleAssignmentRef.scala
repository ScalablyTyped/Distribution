package typings
package vsoDashNodeDashApiLib.interfacesSecurityRolesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRoleAssignmentRef extends js.Object {
  /**
    * The name of the role assigned.
    */
  var roleName: java.lang.String
  /**
    * Identifier of the user given the role assignment.
    */
  var uniqueName: java.lang.String
  /**
    * Unique id of the user given the role assignment.
    */
  var userId: java.lang.String
}

object UserRoleAssignmentRef {
  @scala.inline
  def apply(roleName: java.lang.String, uniqueName: java.lang.String, userId: java.lang.String): UserRoleAssignmentRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("roleName")(roleName)
    __obj.updateDynamic("uniqueName")(uniqueName)
    __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[UserRoleAssignmentRef]
  }
}

