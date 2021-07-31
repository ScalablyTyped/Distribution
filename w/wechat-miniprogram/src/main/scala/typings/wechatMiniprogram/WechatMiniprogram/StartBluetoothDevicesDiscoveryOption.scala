package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.high
import typings.wechatMiniprogram.wechatMiniprogramStrings.low
import typings.wechatMiniprogram.wechatMiniprogramStrings.medium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBluetoothDevicesDiscoveryOption extends StObject {
  
  /** 是否允许重复上报同一设备。如果允许重复上报，则 [wx.onBlueToothDeviceFound](#) 方法会多次上报同一设备，但是 RSSI 值会有不同。 */
  var allowDuplicatesKey: js.UndefOr[Boolean] = js.undefined
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartBluetoothDevicesDiscoveryCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartBluetoothDevicesDiscoveryFailCallback] = js.undefined
  
  /** 上报设备的间隔。0 表示找到新设备立即上报，其他数值根据传入的间隔上报。 */
  var interval: js.UndefOr[Double] = js.undefined
  
  /** 扫描模式，越高扫描越快，也越耗电, 仅安卓 7.0.12 及以上支持。
    *
    * 可选值：
    * - 'low': 低;
    * - 'medium': 中;
    * - 'high': 高; */
  var powerLevel: js.UndefOr[low | medium | high] = js.undefined
  
  /** 要搜索的蓝牙设备主 service 的 uuid 列表。某些蓝牙设备会广播自己的主 service 的 uuid。如果设置此参数，则只搜索广播包有对应 uuid 的主服务的蓝牙设备。建议主要通过该参数过滤掉周边不需要处理的其他蓝牙设备。 */
  var services: js.UndefOr[js.Array[String]] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartBluetoothDevicesDiscoverySuccessCallback] = js.undefined
}
object StartBluetoothDevicesDiscoveryOption {
  
  @scala.inline
  def apply(): StartBluetoothDevicesDiscoveryOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBluetoothDevicesDiscoveryOption]
  }
  
  @scala.inline
  implicit class StartBluetoothDevicesDiscoveryOptionMutableBuilder[Self <: StartBluetoothDevicesDiscoveryOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDuplicatesKey(value: Boolean): Self = StObject.set(x, "allowDuplicatesKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDuplicatesKeyUndefined: Self = StObject.set(x, "allowDuplicatesKey", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ BluetoothError => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ BluetoothError => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setPowerLevel(value: low | medium | high): Self = StObject.set(x, "powerLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerLevelUndefined: Self = StObject.set(x, "powerLevel", js.undefined)
    
    @scala.inline
    def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* res */ BluetoothError => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
