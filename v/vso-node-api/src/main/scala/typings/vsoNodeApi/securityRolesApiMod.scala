package typings.vsoNodeApi

import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.securityRolesInterfacesMod.RoleAssignment
import typings.vsoNodeApi.securityRolesInterfacesMod.SecurityRole
import typings.vsoNodeApi.securityRolesInterfacesMod.UserRoleAssignmentRef
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vso-node-api/SecurityRolesApi", JSImport.Namespace)
@js.native
object securityRolesApiMod extends js.Object {
  
  @js.native
  trait ISecurityRolesApi extends ClientApiBase {
    
    def getRoleAssignments(scopeId: String, resourceId: String): js.Promise[js.Array[RoleAssignment]] = js.native
    
    def getRoleDefinitions(scopeId: String): js.Promise[js.Array[SecurityRole]] = js.native
    
    def removeRoleAssignment(scopeId: String, resourceId: String, identityId: String): js.Promise[Unit] = js.native
    
    def removeRoleAssignments(identityIds: js.Array[String], scopeId: String, resourceId: String): js.Promise[Unit] = js.native
    
    def setRoleAssignment(roleAssignment: UserRoleAssignmentRef, scopeId: String, resourceId: String, identityId: String): js.Promise[RoleAssignment] = js.native
    
    def setRoleAssignments(roleAssignments: js.Array[UserRoleAssignmentRef], scopeId: String, resourceId: String): js.Promise[js.Array[RoleAssignment]] = js.native
  }
  
  @js.native
  class SecurityRolesApi protected () extends ISecurityRolesApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
}
