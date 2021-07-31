package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundAudioError extends StObject {
  
  /** 错误码
    *
    * | 错误码 | 错误信息 | 说明 |
    * | - | - | - |
    * | 10001 |  | 系统错误 |
    * | 10002 |  | 网络错误 |
    * | 10003 |  | 文件错误 |
    * | 10004 |  | 格式错误 |
    * | -1 |  | 未知错误 | */ var errCode: Double
  
  /** 错误信息
    *
    * | 错误码 | 错误信息 | 说明 |
    * | - | - | - |
    * | 10001 |  | 系统错误 |
    * | 10002 |  | 网络错误 |
    * | 10003 |  | 文件错误 |
    * | 10004 |  | 格式错误 |
    * | -1 |  | 未知错误 | */ var errMsg: String
}
object BackgroundAudioError {
  
  @scala.inline
  def apply(errCode: Double, errMsg: String): BackgroundAudioError = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundAudioError]
  }
  
  @scala.inline
  implicit class BackgroundAudioErrorMutableBuilder[Self <: BackgroundAudioError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
