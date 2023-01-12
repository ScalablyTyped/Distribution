package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FtruncateSyncError extends StObject {
  
  /** 错误码
    *
    * | 错误信息 | 说明 |
    * | - | - |
    * | bad file descriptor | 无效的文件描述符 |
    * | fail permission denied | 指定的 fd 没有写权限 |
    * | fail the maximum size of the file storage limit is exceeded | 存储空间不足 |
    * | fail sdcard not mounted | android sdcard 挂载失败 | */ var errCode: Double
  
  /** 错误信息
    *
    * | 错误信息 | 说明 |
    * | - | - |
    * | bad file descriptor | 无效的文件描述符 |
    * | fail permission denied | 指定的 fd 没有写权限 |
    * | fail the maximum size of the file storage limit is exceeded | 存储空间不足 |
    * | fail sdcard not mounted | android sdcard 挂载失败 | */ var errMsg: String
}
object FtruncateSyncError {
  
  inline def apply(errCode: Double, errMsg: String): FtruncateSyncError = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[FtruncateSyncError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FtruncateSyncError] (val x: Self) extends AnyVal {
    
    inline def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
