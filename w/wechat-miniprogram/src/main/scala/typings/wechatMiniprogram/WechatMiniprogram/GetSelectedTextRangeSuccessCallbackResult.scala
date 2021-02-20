package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSelectedTextRangeSuccessCallbackResult extends StObject {
  
  /** 输入框光标结束位置 */
  var end: Double = js.native
  
  var errMsg: String = js.native
  
  /** 输入框光标起始位置 */
  var start: Double = js.native
}
object GetSelectedTextRangeSuccessCallbackResult {
  
  @scala.inline
  def apply(end: Double, errMsg: String, start: Double): GetSelectedTextRangeSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSelectedTextRangeSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetSelectedTextRangeSuccessCallbackResultMutableBuilder[Self <: GetSelectedTextRangeSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
