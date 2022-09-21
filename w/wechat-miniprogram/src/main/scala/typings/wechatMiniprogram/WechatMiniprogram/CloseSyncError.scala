package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseSyncError extends StObject {
  
  /** 错误码
    *
    * | 错误信息 | 说明 |
    * | - | - |
    * | bad file descriptor | 无效的文件描述符 | */ var errCode: Double
  
  /** 错误信息
    *
    * | 错误信息 | 说明 |
    * | - | - |
    * | bad file descriptor | 无效的文件描述符 | */ var errMsg: String
}
object CloseSyncError {
  
  inline def apply(errCode: Double, errMsg: String): CloseSyncError = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseSyncError]
  }
  
  extension [Self <: CloseSyncError](x: Self) {
    
    inline def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
