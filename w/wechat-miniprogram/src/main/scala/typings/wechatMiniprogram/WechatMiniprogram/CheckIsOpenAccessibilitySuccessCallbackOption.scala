package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckIsOpenAccessibilitySuccessCallbackOption extends StObject {
  
  /** iOS 上开启辅助功能旁白，安卓开启 talkback 时返回 true */
  var open: Boolean
}
object CheckIsOpenAccessibilitySuccessCallbackOption {
  
  inline def apply(open: Boolean): CheckIsOpenAccessibilitySuccessCallbackOption = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIsOpenAccessibilitySuccessCallbackOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckIsOpenAccessibilitySuccessCallbackOption] (val x: Self) extends AnyVal {
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
