package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupMembership extends StObject {
  
  var active: Boolean
  
  var descriptor: IdentityDescriptor
  
  var id: String
  
  var queriedId: String
}
object GroupMembership {
  
  inline def apply(active: Boolean, descriptor: IdentityDescriptor, id: String, queriedId: String): GroupMembership = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], queriedId = queriedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMembership]
  }
  
  extension [Self <: GroupMembership](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setDescriptor(value: IdentityDescriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setQueriedId(value: String): Self = StObject.set(x, "queriedId", value.asInstanceOf[js.Any])
  }
}
