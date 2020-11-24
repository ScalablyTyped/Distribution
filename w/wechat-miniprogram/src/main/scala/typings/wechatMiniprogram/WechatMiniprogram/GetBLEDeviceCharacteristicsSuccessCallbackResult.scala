package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBLEDeviceCharacteristicsSuccessCallbackResult extends js.Object {
  
  /** 设备特征值列表 */
  var characteristics: js.Array[BLECharacteristic] = js.native
  
  var errMsg: String = js.native
}
object GetBLEDeviceCharacteristicsSuccessCallbackResult {
  
  @scala.inline
  def apply(characteristics: js.Array[BLECharacteristic], errMsg: String): GetBLEDeviceCharacteristicsSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetBLEDeviceCharacteristicsSuccessCallbackResultOps[Self <: GetBLEDeviceCharacteristicsSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setCharacteristicsVarargs(value: BLECharacteristic*): Self = this.set("characteristics", js.Array(value :_*))
    
    @scala.inline
    def setCharacteristics(value: js.Array[BLECharacteristic]): Self = this.set("characteristics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
}
