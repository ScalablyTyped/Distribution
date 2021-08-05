package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestParams extends StObject {
  
  var appUrl: String
  
  var email: String
}
object ManifestParams {
  
  inline def apply(appUrl: String, email: String): ManifestParams = {
    val __obj = js.Dynamic.literal(appUrl = appUrl.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestParams]
  }
  
  extension [Self <: ManifestParams](x: Self) {
    
    inline def setAppUrl(value: String): Self = StObject.set(x, "appUrl", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
