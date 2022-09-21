package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongPressActionsOptions extends StObject {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 按钮的文字颜色，字符串格式，默认为"#000000"
    */
  var itemColor: js.UndefOr[String] = js.undefined
  
  /**
    * 按钮的文字数组
    */
  var itemList: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ LongPressActionsSuccessData, Unit]] = js.undefined
}
object LongPressActionsOptions {
  
  inline def apply(): LongPressActionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongPressActionsOptions]
  }
  
  extension [Self <: LongPressActionsOptions](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
    
    inline def setItemColorUndefined: Self = StObject.set(x, "itemColor", js.undefined)
    
    inline def setItemList(value: js.Array[String]): Self = StObject.set(x, "itemList", value.asInstanceOf[js.Any])
    
    inline def setItemListUndefined: Self = StObject.set(x, "itemList", js.undefined)
    
    inline def setItemListVarargs(value: String*): Self = StObject.set(x, "itemList", js.Array(value*))
    
    inline def setSuccess(value: /* result */ LongPressActionsSuccessData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
