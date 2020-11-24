package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBLEPeripheralServerSuccessCallbackResult extends js.Object {
  
  var errMsg: String = js.native
  
  /** [BLEPeripheralServer](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-peripheral/BLEPeripheralServer.html)
    *
    * 外围设备的服务端。 */
  var server: BLEPeripheralServer = js.native
}
object CreateBLEPeripheralServerSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, server: BLEPeripheralServer): CreateBLEPeripheralServerSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBLEPeripheralServerSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class CreateBLEPeripheralServerSuccessCallbackResultOps[Self <: CreateBLEPeripheralServerSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: BLEPeripheralServer): Self = this.set("server", value.asInstanceOf[js.Any])
  }
}
