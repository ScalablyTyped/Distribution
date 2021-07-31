package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBeaconsSuccessCallbackResult extends StObject {
  
  /** iBeacon 设备列表 */
  var beacons: js.Array[IBeaconInfo]
  
  var errMsg: String
}
object GetBeaconsSuccessCallbackResult {
  
  @scala.inline
  def apply(beacons: js.Array[IBeaconInfo], errMsg: String): GetBeaconsSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBeaconsSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetBeaconsSuccessCallbackResultMutableBuilder[Self <: GetBeaconsSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeacons(value: js.Array[IBeaconInfo]): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeaconsVarargs(value: IBeaconInfo*): Self = StObject.set(x, "beacons", js.Array(value :_*))
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
