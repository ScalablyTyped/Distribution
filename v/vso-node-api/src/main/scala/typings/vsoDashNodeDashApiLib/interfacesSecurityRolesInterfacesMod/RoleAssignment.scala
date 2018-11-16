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

