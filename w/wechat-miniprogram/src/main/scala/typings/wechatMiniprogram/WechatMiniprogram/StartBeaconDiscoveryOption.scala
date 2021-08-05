package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBeaconDiscoveryOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartBeaconDiscoveryCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartBeaconDiscoveryFailCallback] = js.undefined
  
  /** 是否校验蓝牙开关，仅在 iOS 下有效 */
  var ignoreBluetoothAvailable: js.UndefOr[Boolean] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartBeaconDiscoverySuccessCallback] = js.undefined
  
  /** iBeacon 设备广播的 uuid 列表 */
  var uuids: js.Array[String]
}
object StartBeaconDiscoveryOption {
  
  inline def apply(uuids: js.Array[String]): StartBeaconDiscoveryOption = {
    val __obj = js.Dynamic.literal(uuids = uuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBeaconDiscoveryOption]
  }
  
  extension [Self <: StartBeaconDiscoveryOption](x: Self) {
    
    inline def setComplete(value: /* res */ IBeaconError => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ IBeaconError => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setIgnoreBluetoothAvailable(value: Boolean): Self = StObject.set(x, "ignoreBluetoothAvailable", value.asInstanceOf[js.Any])
    
    inline def setIgnoreBluetoothAvailableUndefined: Self = StObject.set(x, "ignoreBluetoothAvailable", js.undefined)
    
    inline def setSuccess(value: /* res */ IBeaconError => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUuids(value: js.Array[String]): Self = StObject.set(x, "uuids", value.asInstanceOf[js.Any])
    
    inline def setUuidsVarargs(value: String*): Self = StObject.set(x, "uuids", js.Array(value :_*))
  }
}
