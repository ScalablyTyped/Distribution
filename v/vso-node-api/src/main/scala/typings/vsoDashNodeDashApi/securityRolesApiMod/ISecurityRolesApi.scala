package typings.vsoDashNodeDashApi.securityRolesApiMod

import typings.vsoDashNodeDashApi.clientApiBasesMod.ClientApiBase
import typings.vsoDashNodeDashApi.interfacesSecurityRolesInterfacesMod.RoleAssignment
import typings.vsoDashNodeDashApi.interfacesSecurityRolesInterfacesMod.SecurityRole
import typings.vsoDashNodeDashApi.interfacesSecurityRolesInterfacesMod.UserRoleAssignmentRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISecurityRolesApi extends ClientApiBase {
  def getRoleAssignments(scopeId: String, resourceId: String): js.Promise[js.Array[RoleAssignment]] = js.native
  def getRoleDefinitions(scopeId: String): js.Promise[js.Array[SecurityRole]] = js.native
  def removeRoleAssignment(scopeId: String, resourceId: String, identityId: String): js.Promise[Unit] = js.native
  def removeRoleAssignments(identityIds: js.Array[String], scopeId: String, resourceId: String): js.Promise[Unit] = js.native
  def setRoleAssignment(roleAssignment: UserRoleAssignmentRef, scopeId: String, resourceId: String, identityId: String): js.Promise[RoleAssignment] = js.native
  def setRoleAssignments(roleAssignments: js.Array[UserRoleAssignmentRef], scopeId: String, resourceId: String): js.Promise[js.Array[RoleAssignment]] = js.native
}

