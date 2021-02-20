package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 搜索到的设备列表 */
@js.native
trait BluetoothDeviceInfo extends StObject {
  
  /** 用于区分设备的 id */
  var deviceId: String = js.native
  
  /** 蓝牙设备名称，某些设备可能没有 */
  var name: String = js.native
}
object BluetoothDeviceInfo {
  
  @scala.inline
  def apply(deviceId: String, name: String): BluetoothDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothDeviceInfo]
  }
  
  @scala.inline
  implicit class BluetoothDeviceInfoMutableBuilder[Self <: BluetoothDeviceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
