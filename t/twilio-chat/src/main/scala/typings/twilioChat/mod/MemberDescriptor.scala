package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberDescriptor extends StObject {
  
  var attributes: js.UndefOr[js.Object] = js.undefined
  
  var dateCreated: Any
  
  var dateUpdated: Any
  
  var identity: String
  
  var lastConsumedMessageIndex: Double
  
  var lastConsumptionTimestamp: Double
  
  var roleSid: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[MemberType] = js.undefined
  
  var userInfo: String
}
object MemberDescriptor {
  
  inline def apply(
    dateCreated: Any,
    dateUpdated: Any,
    identity: String,
    lastConsumedMessageIndex: Double,
    lastConsumptionTimestamp: Double,
    userInfo: String
  ): MemberDescriptor = {
    val __obj = js.Dynamic.literal(dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], lastConsumedMessageIndex = lastConsumedMessageIndex.asInstanceOf[js.Any], lastConsumptionTimestamp = lastConsumptionTimestamp.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberDescriptor] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setDateCreated(value: Any): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: Any): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setLastConsumedMessageIndex(value: Double): Self = StObject.set(x, "lastConsumedMessageIndex", value.asInstanceOf[js.Any])
    
    inline def setLastConsumptionTimestamp(value: Double): Self = StObject.set(x, "lastConsumptionTimestamp", value.asInstanceOf[js.Any])
    
    inline def setRoleSid(value: String): Self = StObject.set(x, "roleSid", value.asInstanceOf[js.Any])
    
    inline def setRoleSidUndefined: Self = StObject.set(x, "roleSid", js.undefined)
    
    inline def setType(value: MemberType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserInfo(value: String): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
  }
}
