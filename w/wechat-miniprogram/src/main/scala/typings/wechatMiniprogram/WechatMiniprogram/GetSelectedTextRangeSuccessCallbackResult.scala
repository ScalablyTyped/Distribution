package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSelectedTextRangeSuccessCallbackResult extends StObject {
  
  /** 输入框光标结束位置 */
  var end: Double
  
  var errMsg: String
  
  /** 输入框光标起始位置 */
  var start: Double
}
object GetSelectedTextRangeSuccessCallbackResult {
  
  inline def apply(end: Double, errMsg: String, start: Double): GetSelectedTextRangeSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSelectedTextRangeSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSelectedTextRangeSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
