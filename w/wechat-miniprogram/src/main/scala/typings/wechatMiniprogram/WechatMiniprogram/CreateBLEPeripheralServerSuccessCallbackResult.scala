package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBLEPeripheralServerSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** [BLEPeripheralServer](https://developers.weixin.qq.com/miniprogram/dev/api/device/bluetooth-peripheral/BLEPeripheralServer.html)
    *
    * 外围设备的服务端。 */
  var server: BLEPeripheralServer
}
object CreateBLEPeripheralServerSuccessCallbackResult {
  
  inline def apply(errMsg: String, server: BLEPeripheralServer): CreateBLEPeripheralServerSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBLEPeripheralServerSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBLEPeripheralServerSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setServer(value: BLEPeripheralServer): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
