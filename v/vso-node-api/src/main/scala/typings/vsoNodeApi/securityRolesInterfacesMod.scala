package typings.vsoNodeApi

import typings.vsoNodeApi.anon.EnumValuesAssignedInherited
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object securityRolesInterfacesMod {
  
  @js.native
  sealed trait RoleAccess extends StObject
  @JSImport("vso-node-api/interfaces/SecurityRolesInterfaces", "RoleAccess")
  @js.native
  object RoleAccess extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RoleAccess with Double] = js.native
    
    /**
      * Access has been explicitly set.
      */
    @js.native
    sealed trait Assigned extends RoleAccess
    /* 1 */ val Assigned: typings.vsoNodeApi.securityRolesInterfacesMod.RoleAccess.Assigned with Double = js.native
    
    /**
      * Access has been inherited from a higher scope.
      */
    @js.native
    sealed trait Inherited extends RoleAccess
    /* 2 */ val Inherited: typings.vsoNodeApi.securityRolesInterfacesMod.RoleAccess.Inherited with Double = js.native
  }
  
  object TypeInfo {
    
    @JSImport("vso-node-api/interfaces/SecurityRolesInterfaces", "TypeInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vso-node-api/interfaces/SecurityRolesInterfaces", "TypeInfo.RoleAccess")
    @js.native
    def RoleAccess: EnumValuesAssignedInherited = js.native
    @scala.inline
    def RoleAccess_=(x: EnumValuesAssignedInherited): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RoleAccess")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/SecurityRolesInterfaces", "TypeInfo.RoleAssignment")
    @js.native
    def RoleAssignment: js.Any = js.native
    @scala.inline
    def RoleAssignment_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RoleAssignment")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait RoleAssignment extends StObject {
    
    /**
      * Designates the role as explicitly assigned or inherited.
      */
    var access: RoleAccess = js.native
    
    /**
      * User friendly description of access assignment.
      */
    var accessDisplayName: String = js.native
    
    /**
      * The user to whom the role is assigned.
      */
    var identity: IdentityRef = js.native
    
    /**
      * The role assigned to the user.
      */
    var role: SecurityRole = js.native
  }
  object RoleAssignment {
    
    @scala.inline
    def apply(access: RoleAccess, accessDisplayName: String, identity: IdentityRef, role: SecurityRole): RoleAssignment = {
      val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], accessDisplayName = accessDisplayName.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleAssignment]
    }
    
    @scala.inline
    implicit class RoleAssignmentMutableBuilder[Self <: RoleAssignment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess(value: RoleAccess): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessDisplayName(value: String): Self = StObject.set(x, "accessDisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentity(value: IdentityRef): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: SecurityRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SecurityRole extends StObject {
    
    /**
      * Permissions the role is allowed.
      */
    var allowPermissions: Double = js.native
    
    /**
      * Permissions the role is denied.
      */
    var denyPermissions: Double = js.native
    
    /**
      * Description of user access defined by the role
      */
    var description: String = js.native
    
    /**
      * User friendly name of the role.
      */
    var displayName: String = js.native
    
    /**
      * Globally unique identifier for the role.
      */
    var identifier: String = js.native
    
    /**
      * Unique name of the role in the scope.
      */
    var name: String = js.native
    
    /**
      * Returns the id of the ParentScope.
      */
    var scope: String = js.native
  }
  object SecurityRole {
    
    @scala.inline
    def apply(
      allowPermissions: Double,
      denyPermissions: Double,
      description: String,
      displayName: String,
      identifier: String,
      name: String,
      scope: String
    ): SecurityRole = {
      val __obj = js.Dynamic.literal(allowPermissions = allowPermissions.asInstanceOf[js.Any], denyPermissions = denyPermissions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecurityRole]
    }
    
    @scala.inline
    implicit class SecurityRoleMutableBuilder[Self <: SecurityRole] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowPermissions(value: Double): Self = StObject.set(x, "allowPermissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDenyPermissions(value: Double): Self = StObject.set(x, "denyPermissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserRoleAssignmentRef extends StObject {
    
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
    implicit class UserRoleAssignmentRefMutableBuilder[Self <: UserRoleAssignmentRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoleName(value: String): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
}
