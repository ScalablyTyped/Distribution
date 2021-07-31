package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScaleSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 缩放值 */
  var scale: Double
}
object GetScaleSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, scale: Double): GetScaleSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScaleSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetScaleSuccessCallbackResultMutableBuilder[Self <: GetScaleSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
