package typings.vsoDashNodeDashApi.interfacesSecurityRolesInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleAssignment extends js.Object {
  /**
    * Designates the role as explicitly assigned or inherited.
    */
  var access: RoleAccess
  /**
    * User friendly description of access assignment.
    */
  var accessDisplayName: String
  /**
    * The user to whom the role is assigned.
    */
  var identity: IdentityRef
  /**
    * The role assigned to the user.
    */
  var role: SecurityRole
}

object RoleAssignment {
  @scala.inline
  def apply(access: RoleAccess, accessDisplayName: String, identity: IdentityRef, role: SecurityRole): RoleAssignment = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], accessDisplayName = accessDisplayName.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RoleAssignment]
  }
}

