package typings.xummSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationuuidv4 extends StObject {
  
  var application_uuidv4: String
  
  var opened_by_deeplink: Boolean
  
  var payload_uuidv4: String
  
  var url: String
}
object Applicationuuidv4 {
  
  inline def apply(application_uuidv4: String, opened_by_deeplink: Boolean, payload_uuidv4: String, url: String): Applicationuuidv4 = {
    val __obj = js.Dynamic.literal(application_uuidv4 = application_uuidv4.asInstanceOf[js.Any], opened_by_deeplink = opened_by_deeplink.asInstanceOf[js.Any], payload_uuidv4 = payload_uuidv4.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationuuidv4]
  }
  
  extension [Self <: Applicationuuidv4](x: Self) {
    
    inline def setApplication_uuidv4(value: String): Self = StObject.set(x, "application_uuidv4", value.asInstanceOf[js.Any])
    
    inline def setOpened_by_deeplink(value: Boolean): Self = StObject.set(x, "opened_by_deeplink", value.asInstanceOf[js.Any])
    
    inline def setPayload_uuidv4(value: String): Self = StObject.set(x, "payload_uuidv4", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
