package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NFCError extends StObject {
  
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
  implicit class NFCErrorMutableBuilder[Self <: NFCError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
