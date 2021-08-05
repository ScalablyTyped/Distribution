package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthSetting extends StObject {
  
  var authSetting: Scopeaddress
}
object AuthSetting {
  
  inline def apply(authSetting: Scopeaddress): AuthSetting = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSetting]
  }
  
  extension [Self <: AuthSetting](x: Self) {
    
    inline def setAuthSetting(value: Scopeaddress): Self = StObject.set(x, "authSetting", value.asInstanceOf[js.Any])
  }
}
