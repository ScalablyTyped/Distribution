package typings.weixinApp.anon

import typings.weixinApp.weixinAppStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  characteristic :{  characteristicId :string,   serviceId :string,   value :std.ArrayBuffer}} & weixin-app.wx.ErrMsgResponse */
@js.native
trait characteristiccharacteris extends js.Object {
  
  var characteristic: CharacteristicId = js.native
  
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String = js.native
}
object characteristiccharacteris {
  
  @scala.inline
  def apply(characteristic: CharacteristicId, errMsg: ok | String): characteristiccharacteris = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[characteristiccharacteris]
  }
  
  @scala.inline
  implicit class characteristiccharacterisOps[Self <: characteristiccharacteris] (val x: Self) extends AnyVal {
    
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
    def setCharacteristic(value: CharacteristicId): Self = this.set("characteristic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: ok | String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
}
