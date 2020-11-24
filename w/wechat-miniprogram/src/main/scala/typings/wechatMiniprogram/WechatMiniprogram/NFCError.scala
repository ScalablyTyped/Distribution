package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NFCError extends js.Object {
  
  /** 错误码
    *
    * | 错误码 | 错误信息 | 说明 |
    * | - | - | - |
    * | 0 | ok | 正常 |
    * | 13000 |  | 当前设备不支持NFC |
    * | 13001 |  | 当前设备支持NFC，但系统NFC开关未开启 |
    * | 13002 |  | 当前设备支持NFC，但不支持HCE |
    * | 13003 |  | AID列表参数格式错误 |
    * | 13004 |  | 未设置微信为默认NFC支付应用 |
    * | 13005 |  | 返回的指令不合法 |
    * | 13006 |  | 注册AID失败 | */ var errCode: Double = js.native
  
  /** 错误信息
    *
    * | 错误码 | 错误信息 | 说明 |
    * | - | - | - |
    * | 0 | ok | 正常 |
    * | 13000 |  | 当前设备不支持NFC |
    * | 13001 |  | 当前设备支持NFC，但系统NFC开关未开启 |
    * | 13002 |  | 当前设备支持NFC，但不支持HCE |
    * | 13003 |  | AID列表参数格式错误 |
    * | 13004 |  | 未设置微信为默认NFC支付应用 |
    * | 13005 |  | 返回的指令不合法 |
    * | 13006 |  | 注册AID失败 | */ var errMsg: String = js.native
}
object NFCError {
  
  @scala.inline
  def apply(errCode: Double, errMsg: String): NFCError = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[NFCError]
  }
  
  @scala.inline
  implicit class NFCErrorOps[Self <: NFCError] (val x: Self) extends AnyVal {
    
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
    def setErrCode(value: Double): Self = this.set("errCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
}
