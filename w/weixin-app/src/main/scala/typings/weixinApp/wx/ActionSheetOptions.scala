package typings.weixinApp.wx

import typings.weixinApp.anon.TapIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionSheetOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 按钮的文字颜色，默认为"#000000"
    */
  var itemColor: js.UndefOr[String] = js.native
  
  /**
    * 按钮的文字数组，数组长度最大为6个
    */
  var itemList: js.Array[String] = js.native
  
  /**
    * 接口调用成功的回调函数
    */
  @JSName("success")
  var success_ActionSheetOptions: js.UndefOr[js.Function1[/* res */ TapIndex, Unit]] = js.native
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
