package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowActionSheetOption extends StObject {
  
  /** 警示文案
    *
    * 最低基础库： `2.14.0` */
  var alertText: js.UndefOr[String] = js.undefined
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ShowActionSheetCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ShowActionSheetFailCallback] = js.undefined
  
  /** 按钮的文字颜色 */
  var itemColor: js.UndefOr[String] = js.undefined
  
  /** 按钮的文字数组，数组长度最大为 6 */
  var itemList: js.Array[String]
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ShowActionSheetSuccessCallback] = js.undefined
}
object ShowActionSheetOption {
  
  inline def apply(itemList: js.Array[String]): ShowActionSheetOption = {
    val __obj = js.Dynamic.literal(itemList = itemList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowActionSheetOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShowActionSheetOption] (val x: Self) extends AnyVal {
    
    inline def setAlertText(value: String): Self = StObject.set(x, "alertText", value.asInstanceOf[js.Any])
    
    inline def setAlertTextUndefined: Self = StObject.set(x, "alertText", js.undefined)
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
    
    inline def setItemColorUndefined: Self = StObject.set(x, "itemColor", js.undefined)
    
    inline def setItemList(value: js.Array[String]): Self = StObject.set(x, "itemList", value.asInstanceOf[js.Any])
    
    inline def setItemListVarargs(value: String*): Self = StObject.set(x, "itemList", js.Array(value*))
    
    inline def setSuccess(value: /* result */ ShowActionSheetSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
