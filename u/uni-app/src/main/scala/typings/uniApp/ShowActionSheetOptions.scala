package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowActionSheetOptions extends StObject {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 按钮的文字颜色，默认为"#000000"
    */
  var itemColor: js.UndefOr[String] = js.native
  
  /**
    * 按钮的文字数组
    */
  var itemList: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ ShowActionSheetRes, Unit]] = js.native
}
object ShowActionSheetOptions {
  
  @scala.inline
  def apply(): ShowActionSheetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowActionSheetOptions]
  }
  
  @scala.inline
  implicit class ShowActionSheetOptionsMutableBuilder[Self <: ShowActionSheetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemColorUndefined: Self = StObject.set(x, "itemColor", js.undefined)
    
    @scala.inline
    def setItemList(value: js.Array[_]): Self = StObject.set(x, "itemList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemListUndefined: Self = StObject.set(x, "itemList", js.undefined)
    
    @scala.inline
    def setItemListVarargs(value: js.Any*): Self = StObject.set(x, "itemList", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* result */ ShowActionSheetRes => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
