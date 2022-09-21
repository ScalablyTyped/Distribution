package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 手机号 */
trait SearchContactsResult extends StObject {
  
  /** 联系人姓名 */
  var name: String
  
  /** 手机号 */
  var phoneNumber: String
}
object SearchContactsResult {
  
  inline def apply(name: String, phoneNumber: String): SearchContactsResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchContactsResult]
  }
  
  extension [Self <: SearchContactsResult](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
