package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnBLEPeripheralConnectionStateChangedCallbackResult extends js.Object {
  
  /** 连接目前状态 */
  var connected: Boolean = js.native
  
  /** 连接状态变化的设备 id */
  var deviceId: String = js.native
  
  /** server 的 uuid */
  var serverId: String = js.native
}
object OnBLEPeripheralConnectionStateChangedCallbackResult {
  
  @scala.inline
  def apply(connected: Boolean, deviceId: String, serverId: String): OnBLEPeripheralConnectionStateChangedCallbackResult = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBLEPeripheralConnectionStateChangedCallbackResult]
  }
  
  @scala.inline
  implicit class OnBLEPeripheralConnectionStateChangedCallbackResultOps[Self <: OnBLEPeripheralConnectionStateChangedCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnected(value: Boolean): Self = this.set("connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerId(value: String): Self = this.set("serverId", value.asInstanceOf[js.Any])
  }
}
