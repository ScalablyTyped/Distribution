package typings
package vsoDashNodeDashApiLib.interfacesSecurityRolesInterfacesMod

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
  var accessDisplayName: java.lang.String
  /**
    * The user to whom the role is assigned.
    */
  var identity: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * The role assigned to the user.
    */
  var role: SecurityRole
}

object RoleAssignment {
  @scala.inline
  def apply(
    access: RoleAccess,
    accessDisplayName: java.lang.String,
    identity: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    role: SecurityRole
  ): RoleAssignment = {
    val __obj = js.Dynamic.literal(access = access, accessDisplayName = accessDisplayName, identity = identity, role = role)
  
    __obj.asInstanceOf[RoleAssignment]
  }
}

