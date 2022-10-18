package typings.vsoNodeApi.interfacesIdentitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitySnapshot extends StObject {
  
  var groups: js.Array[Identity]
  
  var identityIds: js.Array[String]
  
  var memberships: js.Array[GroupMembership]
  
  var scopeId: String
  
  var scopes: js.Array[IdentityScope]
}
object IdentitySnapshot {
  
  inline def apply(
    groups: js.Array[Identity],
    identityIds: js.Array[String],
    memberships: js.Array[GroupMembership],
    scopeId: String,
    scopes: js.Array[IdentityScope]
  ): IdentitySnapshot = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], identityIds = identityIds.asInstanceOf[js.Any], memberships = memberships.asInstanceOf[js.Any], scopeId = scopeId.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitySnapshot]
  }
  
  extension [Self <: IdentitySnapshot](x: Self) {
    
    inline def setGroups(value: js.Array[Identity]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: Identity*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setIdentityIds(value: js.Array[String]): Self = StObject.set(x, "identityIds", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdsVarargs(value: String*): Self = StObject.set(x, "identityIds", js.Array(value*))
    
    inline def setMemberships(value: js.Array[GroupMembership]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
    
    inline def setMembershipsVarargs(value: GroupMembership*): Self = StObject.set(x, "memberships", js.Array(value*))
    
    inline def setScopeId(value: String): Self = StObject.set(x, "scopeId", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: js.Array[IdentityScope]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: IdentityScope*): Self = StObject.set(x, "scopes", js.Array(value*))
  }
}
