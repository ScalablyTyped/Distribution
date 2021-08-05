package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameworkIdentityInfo extends StObject {
  
  var displayName: String
  
  var identifier: String
  
  var identityType: FrameworkIdentityType
  
  var role: String
}
object FrameworkIdentityInfo {
  
  inline def apply(displayName: String, identifier: String, identityType: FrameworkIdentityType, role: String): FrameworkIdentityInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], identityType = identityType.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameworkIdentityInfo]
  }
  
  extension [Self <: FrameworkIdentityInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentityType(value: FrameworkIdentityType): Self = StObject.set(x, "identityType", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
