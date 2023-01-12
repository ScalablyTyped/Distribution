package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseContactSuccessCallbackOption extends StObject {
  
  /** 联系人姓名 */
  var displayName: String
  
  /** 手机号 */
  var phoneNumber: String
  
  /** 选定联系人的所有手机号（部分 Android 系统只能选联系人而不能选特定手机号） */
  var phoneNumberList: String
}
object ChooseContactSuccessCallbackOption {
  
  inline def apply(displayName: String, phoneNumber: String, phoneNumberList: String): ChooseContactSuccessCallbackOption = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], phoneNumberList = phoneNumberList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseContactSuccessCallbackOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChooseContactSuccessCallbackOption] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberList(value: String): Self = StObject.set(x, "phoneNumberList", value.asInstanceOf[js.Any])
  }
}
