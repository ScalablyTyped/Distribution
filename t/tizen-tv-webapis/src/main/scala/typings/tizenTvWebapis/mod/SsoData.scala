package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsoData extends StObject {
  
  var authToken: String
  
  var bLogin: Boolean
  
  var guid: String
  
  var id: String
  
  var uid: String
}
object SsoData {
  
  inline def apply(authToken: String, bLogin: Boolean, guid: String, id: String, uid: String): SsoData = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], bLogin = bLogin.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SsoData]
  }
  
  extension [Self <: SsoData](x: Self) {
    
    inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
    
    inline def setBLogin(value: Boolean): Self = StObject.set(x, "bLogin", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
