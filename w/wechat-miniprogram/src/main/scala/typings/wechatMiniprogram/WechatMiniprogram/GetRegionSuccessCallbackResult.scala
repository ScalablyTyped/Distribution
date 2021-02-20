package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRegionSuccessCallbackResult extends StObject {
  
  var errMsg: String = js.native
  
  /** 东北角经纬度 */
  var northeast: MapPostion = js.native
  
  /** 西南角经纬度 */
  var southwest: MapPostion = js.native
}
object GetRegionSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, northeast: MapPostion, southwest: MapPostion): GetRegionSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegionSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetRegionSuccessCallbackResultMutableBuilder[Self <: GetRegionSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNortheast(value: MapPostion): Self = StObject.set(x, "northeast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouthwest(value: MapPostion): Self = StObject.set(x, "southwest", value.asInstanceOf[js.Any])
  }
}
