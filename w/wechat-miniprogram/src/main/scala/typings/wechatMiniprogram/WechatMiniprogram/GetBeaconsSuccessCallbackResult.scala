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
  
  inline def apply(beacons: js.Array[IBeaconInfo], errMsg: String): GetBeaconsSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBeaconsSuccessCallbackResult]
  }
  
  extension [Self <: GetBeaconsSuccessCallbackResult](x: Self) {
    
    inline def setBeacons(value: js.Array[IBeaconInfo]): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
    
    inline def setBeaconsVarargs(value: IBeaconInfo*): Self = StObject.set(x, "beacons", js.Array(value*))
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
