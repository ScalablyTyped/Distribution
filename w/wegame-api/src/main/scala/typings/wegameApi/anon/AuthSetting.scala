package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthSetting extends StObject {
  
  var authSetting: typings.wegameApi.wx.types.AuthSetting
}
object AuthSetting {
  
  inline def apply(authSetting: typings.wegameApi.wx.types.AuthSetting): AuthSetting = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthSetting] (val x: Self) extends AnyVal {
    
    inline def setAuthSetting(value: typings.wegameApi.wx.types.AuthSetting): Self = StObject.set(x, "authSetting", value.asInstanceOf[js.Any])
  }
}
