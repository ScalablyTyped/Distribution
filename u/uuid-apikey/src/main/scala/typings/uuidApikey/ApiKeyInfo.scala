package typings.uuidApikey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiKeyInfo extends StObject {
  
  var apiKey: String
  
  var uuid: String
}
object ApiKeyInfo {
  
  inline def apply(apiKey: String, uuid: String): ApiKeyInfo = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiKeyInfo] (val x: Self) extends AnyVal {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
