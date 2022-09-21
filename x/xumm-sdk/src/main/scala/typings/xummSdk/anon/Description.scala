package typings.xummSdk.anon

import typings.xummSdk.xummSdkNumbers.`0`
import typings.xummSdk.xummSdkNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var description: String
  
  var disabled: `0` | `1`
  
  var icon_url: String
  
  var issued_user_token: String | Null
  
  var name: String
  
  var uuidv4: String
}
object Description {
  
  inline def apply(description: String, disabled: `0` | `1`, icon_url: String, name: String, uuidv4: String): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], icon_url = icon_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uuidv4 = uuidv4.asInstanceOf[js.Any], issued_user_token = null)
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: `0` | `1`): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setIcon_url(value: String): Self = StObject.set(x, "icon_url", value.asInstanceOf[js.Any])
    
    inline def setIssued_user_token(value: String): Self = StObject.set(x, "issued_user_token", value.asInstanceOf[js.Any])
    
    inline def setIssued_user_tokenNull: Self = StObject.set(x, "issued_user_token", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUuidv4(value: String): Self = StObject.set(x, "uuidv4", value.asInstanceOf[js.Any])
  }
}
