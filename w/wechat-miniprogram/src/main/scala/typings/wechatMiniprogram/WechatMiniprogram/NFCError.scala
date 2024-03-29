package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * | 13006 |  | 注册AID失败 | */ var errCode: Double
  
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
    * | 13006 |  | 注册AID失败 | */ var errMsg: String
}
object NFCError {
  
  inline def apply(errCode: Double, errMsg: String): NFCError = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[NFCError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NFCError] (val x: Self) extends AnyVal {
    
    inline def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
