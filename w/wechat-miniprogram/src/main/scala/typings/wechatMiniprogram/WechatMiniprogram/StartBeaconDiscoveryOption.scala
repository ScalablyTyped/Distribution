package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartBeaconDiscoveryOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartBeaconDiscoveryCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartBeaconDiscoveryFailCallback] = js.native
  
  /** 是否校验蓝牙开关，仅在 iOS 下有效 */
  var ignoreBluetoothAvailable: js.UndefOr[Boolean] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartBeaconDiscoverySuccessCallback] = js.native
  
  /** iBeacon 设备广播的 uuid 列表 */
  var uuids: js.Array[String] = js.native
}
object StartBeaconDiscoveryOption {
  
  @scala.inline
  def apply(uuids: js.Array[String]): StartBeaconDiscoveryOption = {
    val __obj = js.Dynamic.literal(uuids = uuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBeaconDiscoveryOption]
  }
  
  @scala.inline
  implicit class StartBeaconDiscoveryOptionMutableBuilder[Self <: StartBeaconDiscoveryOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ IBeaconError => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ IBeaconError => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setIgnoreBluetoothAvailable(value: Boolean): Self = StObject.set(x, "ignoreBluetoothAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreBluetoothAvailableUndefined: Self = StObject.set(x, "ignoreBluetoothAvailable", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ IBeaconError => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setUuids(value: js.Array[String]): Self = StObject.set(x, "uuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidsVarargs(value: String*): Self = StObject.set(x, "uuids", js.Array(value :_*))
  }
}
