package typings.weappApi.mod.wx

import typings.weappApi.anon.TapIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionSheetOptions extends StObject {
  
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  
  // 按钮的文字颜色
  var itemColor: js.UndefOr[String] = js.undefined
  
  // 必填，按钮的文字数组，数组长度最大为 6
  var itemList: js.Array[String]
  
  var success: js.UndefOr[ActionSheetSuccessCallback] = js.undefined
}
object ActionSheetOptions {
  
  @scala.inline
  def apply(itemList: js.Array[String]): ActionSheetOptions = {
    val __obj = js.Dynamic.literal(itemList = itemList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetOptions]
  }
  
  @scala.inline
  implicit class ActionSheetOptionsMutableBuilder[Self <: ActionSheetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
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
    def setSuccess(value: /* res */ TapIndex => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
