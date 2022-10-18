package typings.vsoNodeApi.interfacesIdentitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateScopeInfo extends StObject {
  
  var adminGroupDescription: String
  
  var adminGroupName: String
  
  var creatorId: String
  
  var parentScopeId: String
  
  var scopeName: String
  
  var scopeType: GroupScopeType
}
object CreateScopeInfo {
  
  inline def apply(
    adminGroupDescription: String,
    adminGroupName: String,
    creatorId: String,
    parentScopeId: String,
    scopeName: String,
    scopeType: GroupScopeType
  ): CreateScopeInfo = {
    val __obj = js.Dynamic.literal(adminGroupDescription = adminGroupDescription.asInstanceOf[js.Any], adminGroupName = adminGroupName.asInstanceOf[js.Any], creatorId = creatorId.asInstanceOf[js.Any], parentScopeId = parentScopeId.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any], scopeType = scopeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScopeInfo]
  }
  
  extension [Self <: CreateScopeInfo](x: Self) {
    
    inline def setAdminGroupDescription(value: String): Self = StObject.set(x, "adminGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setAdminGroupName(value: String): Self = StObject.set(x, "adminGroupName", value.asInstanceOf[js.Any])
    
    inline def setCreatorId(value: String): Self = StObject.set(x, "creatorId", value.asInstanceOf[js.Any])
    
    inline def setParentScopeId(value: String): Self = StObject.set(x, "parentScopeId", value.asInstanceOf[js.Any])
    
    inline def setScopeName(value: String): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
    
    inline def setScopeType(value: GroupScopeType): Self = StObject.set(x, "scopeType", value.asInstanceOf[js.Any])
  }
}
