package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailableAddOnSid extends StObject {
  
  var availableAddOnSid: String
  
  var friendlyName: String
  
  var productName: String
  
  var sid: String
  
  var uniqueName: String
  
  var url: String
}
object AvailableAddOnSid {
  
  inline def apply(
    availableAddOnSid: String,
    friendlyName: String,
    productName: String,
    sid: String,
    uniqueName: String,
    url: String
  ): AvailableAddOnSid = {
    val __obj = js.Dynamic.literal(availableAddOnSid = availableAddOnSid.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], productName = productName.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableAddOnSid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvailableAddOnSid] (val x: Self) extends AnyVal {
    
    inline def setAvailableAddOnSid(value: String): Self = StObject.set(x, "availableAddOnSid", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
