package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinVoIPChatError extends StObject {
  
  /** 错误码
    *
    * | 错误码 | 错误信息 | 说明 |
    * | - | - | - |
    * | -1 | 当前已在房间内 |  |
    * | -2 | 录音设备被占用，可能是当前正在使用微信内语音通话或系统通话 |  |
    * | -3 | 加入会话期间退出（可能是用户主动退出，或者退后台、来电等原因），因此加入失败 |  |
    * | -1000 | 系统错误 |  | */ var errCode: Double
  
  /** 错误信息
    *
    * | 错误码 | 错误信息 | 说明 |
    * | - | - | - |
    * | -1 | 当前已在房间内 |  |
    * | -2 | 录音设备被占用，可能是当前正在使用微信内语音通话或系统通话 |  |
    * | -3 | 加入会话期间退出（可能是用户主动退出，或者退后台、来电等原因），因此加入失败 |  |
    * | -1000 | 系统错误 |  | */ var errMsg: String
}
object JoinVoIPChatError {
  
  inline def apply(errCode: Double, errMsg: String): JoinVoIPChatError = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinVoIPChatError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JoinVoIPChatError] (val x: Self) extends AnyVal {
    
    inline def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
