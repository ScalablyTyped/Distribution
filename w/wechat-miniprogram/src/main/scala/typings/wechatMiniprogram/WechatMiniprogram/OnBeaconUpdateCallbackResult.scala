package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBeaconUpdateCallbackResult extends StObject {
  
  /** 当前搜寻到的所有 iBeacon 设备列表 */
  var beacons: js.Array[IBeaconInfo]
}
object OnBeaconUpdateCallbackResult {
  
  @scala.inline
  def apply(beacons: js.Array[IBeaconInfo]): OnBeaconUpdateCallbackResult = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeaconUpdateCallbackResult]
  }
  
  @scala.inline
  implicit class OnBeaconUpdateCallbackResultMutableBuilder[Self <: OnBeaconUpdateCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeacons(value: js.Array[IBeaconInfo]): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeaconsVarargs(value: IBeaconInfo*): Self = StObject.set(x, "beacons", js.Array(value :_*))
  }
}
