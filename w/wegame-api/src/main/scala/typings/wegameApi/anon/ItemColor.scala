package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemColor extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 按钮的文字颜色，默认值#000000
    */
  var itemColor: js.UndefOr[String] = js.undefined
  
  /**
    * 按钮的文字数组，数组长度最大为 6
    */
  var itemList: js.Array[String]
  
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object ItemColor {
  
  inline def apply(itemList: js.Array[String]): ItemColor = {
    val __obj = js.Dynamic.literal(itemList = itemList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemColor]
  }
  
  extension [Self <: ItemColor](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
    
    inline def setItemColorUndefined: Self = StObject.set(x, "itemColor", js.undefined)
    
    inline def setItemList(value: js.Array[String]): Self = StObject.set(x, "itemList", value.asInstanceOf[js.Any])
    
    inline def setItemListVarargs(value: String*): Self = StObject.set(x, "itemList", js.Array(value :_*))
    
    inline def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
