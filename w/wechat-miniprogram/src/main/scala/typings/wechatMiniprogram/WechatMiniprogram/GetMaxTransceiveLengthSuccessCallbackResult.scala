package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMaxTransceiveLengthSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 最大传输长度 */
  var length: Double
}
object GetMaxTransceiveLengthSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, length: Double): GetMaxTransceiveLengthSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMaxTransceiveLengthSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetMaxTransceiveLengthSuccessCallbackResultMutableBuilder[Self <: GetMaxTransceiveLengthSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
