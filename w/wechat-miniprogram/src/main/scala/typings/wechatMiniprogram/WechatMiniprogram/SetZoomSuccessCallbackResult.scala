package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetZoomSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 实际设置的缩放级别。由于系统限制，某些机型可能无法设置成指定值，会改用最接近的可设值。 */
  var zoom: Double
}
object SetZoomSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, zoom: Double): SetZoomSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetZoomSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class SetZoomSuccessCallbackResultMutableBuilder[Self <: SetZoomSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
