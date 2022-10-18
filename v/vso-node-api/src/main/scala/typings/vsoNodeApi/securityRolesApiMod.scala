package typings.vsoNodeApi

import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.interfacesSecurityRolesInterfacesMod.RoleAssignment
import typings.vsoNodeApi.interfacesSecurityRolesInterfacesMod.SecurityRole
import typings.vsoNodeApi.interfacesSecurityRolesInterfacesMod.UserRoleAssignmentRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object securityRolesApiMod {
  
  @JSImport("vso-node-api/SecurityRolesApi", "SecurityRolesApi")
  @js.native
  open class SecurityRolesApi protected () extends ISecurityRolesApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  @js.native
  trait ISecurityRolesApi extends ClientApiBase {
    
    def getRoleAssignments(scopeId: String, resourceId: String): js.Promise[js.Array[RoleAssignment]] = js.native
    
    def getRoleDefinitions(scopeId: String): js.Promise[js.Array[SecurityRole]] = js.native
    
    def removeRoleAssignment(scopeId: String, resourceId: String, identityId: String): js.Promise[Unit] = js.native
    
    def removeRoleAssignments(identityIds: js.Array[String], scopeId: String, resourceId: String): js.Promise[Unit] = js.native
    
    def setRoleAssignment(roleAssignment: UserRoleAssignmentRef, scopeId: String, resourceId: String, identityId: String): js.Promise[RoleAssignment] = js.native
    
    def setRoleAssignments(roleAssignments: js.Array[UserRoleAssignmentRef], scopeId: String, resourceId: String): js.Promise[js.Array[RoleAssignment]] = js.native
  }
}
