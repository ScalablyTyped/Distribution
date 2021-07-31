package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowActionSheetOption extends StObject {
  
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
  
  @scala.inline
  def apply(itemList: js.Array[String]): ShowActionSheetOption = {
    val __obj = js.Dynamic.literal(itemList = itemList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowActionSheetOption]
  }
  
  @scala.inline
  implicit class ShowActionSheetOptionMutableBuilder[Self <: ShowActionSheetOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemColorUndefined: Self = StObject.set(x, "itemColor", js.undefined)
    
    @scala.inline
    def setItemList(value: js.Array[String]): Self = StObject.set(x, "itemList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemListVarargs(value: String*): Self = StObject.set(x, "itemList", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* result */ ShowActionSheetSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
