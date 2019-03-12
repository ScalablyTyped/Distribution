package typings
package vsoDashNodeDashApiLib.securityRolesApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISecurityRolesApi
  extends vsoDashNodeDashApiLib.clientApiBasesMod.ClientApiBase {
  def getRoleAssignments(scopeId: java.lang.String, resourceId: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesSecurityRolesInterfacesMod.RoleAssignment]
  ] = js.native
  def getRoleDefinitions(scopeId: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesSecurityRolesInterfacesMod.SecurityRole]
  ] = js.native
  def removeRoleAssignment(scopeId: java.lang.String, resourceId: java.lang.String, identityId: java.lang.String): js.Promise[scala.Unit] = js.native
  def removeRoleAssignments(identityIds: js.Array[java.lang.String], scopeId: java.lang.String, resourceId: java.lang.String): js.Promise[scala.Unit] = js.native
  def setRoleAssignment(
    roleAssignment: vsoDashNodeDashApiLib.interfacesSecurityRolesInterfacesMod.UserRoleAssignmentRef,
    scopeId: java.lang.String,
    resourceId: java.lang.String,
    identityId: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesSecurityRolesInterfacesMod.RoleAssignment] = js.native
  def setRoleAssignments(
    roleAssignments: js.Array[vsoDashNodeDashApiLib.interfacesSecurityRolesInterfacesMod.UserRoleAssignmentRef],
    scopeId: java.lang.String,
    resourceId: java.lang.String
  ): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesSecurityRolesInterfacesMod.RoleAssignment]
  ] = js.native
}

