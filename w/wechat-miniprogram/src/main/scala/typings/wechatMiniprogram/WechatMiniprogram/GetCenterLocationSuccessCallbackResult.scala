package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCenterLocationSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 纬度 */
  var latitude: Double
  
  /** 经度 */
  var longitude: Double
}
object GetCenterLocationSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, latitude: Double, longitude: Double): GetCenterLocationSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCenterLocationSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetCenterLocationSuccessCallbackResultMutableBuilder[Self <: GetCenterLocationSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
