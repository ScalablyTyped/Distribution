package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 设备-----拨打电话
trait MakePhoneCallOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /**
    * 需要拨打的电话号码
    */
  var phoneNumber: String
}
object MakePhoneCallOptions {
  
  inline def apply(phoneNumber: String): MakePhoneCallOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakePhoneCallOptions]
  }
  
  extension [Self <: MakePhoneCallOptions](x: Self) {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
