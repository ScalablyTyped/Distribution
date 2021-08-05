package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongPressActionsSuccessData extends StObject {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var tapIndex: js.UndefOr[Double] = js.undefined
}
object LongPressActionsSuccessData {
  
  inline def apply(): LongPressActionsSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongPressActionsSuccessData]
  }
  
  extension [Self <: LongPressActionsSuccessData](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setTapIndex(value: Double): Self = StObject.set(x, "tapIndex", value.asInstanceOf[js.Any])
    
    inline def setTapIndexUndefined: Self = StObject.set(x, "tapIndex", js.undefined)
  }
}
