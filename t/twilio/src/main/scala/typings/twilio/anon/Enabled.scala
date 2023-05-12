package typings.twilio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled extends StObject {
  
  var enabled: Boolean
  
  var friendlyName: String
  
  var installedAddOnSid: String
  
  var productName: String
  
  var sid: String
  
  var uniqueName: String
  
  var url: String
}
object Enabled {
  
  inline def apply(
    enabled: Boolean,
    friendlyName: String,
    installedAddOnSid: String,
    productName: String,
    sid: String,
    uniqueName: String,
    url: String
  ): Enabled = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], installedAddOnSid = installedAddOnSid.asInstanceOf[js.Any], productName = productName.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setInstalledAddOnSid(value: String): Self = StObject.set(x, "installedAddOnSid", value.asInstanceOf[js.Any])
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
