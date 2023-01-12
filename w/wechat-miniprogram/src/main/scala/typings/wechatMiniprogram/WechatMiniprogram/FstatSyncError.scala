package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FstatSyncError extends StObject {
  
  /** 错误码
    *
    * | 错误信息 | 说明 |
    * | - | - |
    * | bad file descriptor | 无效的文件描述符 |
    * | fail permission denied | 指定的 fd 路径没有读权限 | */ var errCode: Double
  
  /** 错误信息
    *
    * | 错误信息 | 说明 |
    * | - | - |
    * | bad file descriptor | 无效的文件描述符 |
    * | fail permission denied | 指定的 fd 路径没有读权限 | */ var errMsg: String
}
object FstatSyncError {
  
  inline def apply(errCode: Double, errMsg: String): FstatSyncError = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[FstatSyncError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FstatSyncError] (val x: Self) extends AnyVal {
    
    inline def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
