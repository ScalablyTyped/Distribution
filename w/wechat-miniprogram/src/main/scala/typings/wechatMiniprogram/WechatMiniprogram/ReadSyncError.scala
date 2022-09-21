package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadSyncError extends StObject {
  
  /** 错误码
    *
    * | 错误信息 | 说明 |
    * | - | - |
    * | bad file descriptor | 无效的文件描述符 |
    * | fail permission denied | 指定的 fd 路径没有读权限 |
    * | fail the value of "offset" is out of range | 传入的 offset 不合法 |
    * | fail the value of "length" is out of range | 传入的 length 不合法 |
    * | fail sdcard not mounted | android sdcard 挂载失败 |
    * | bad file descriptor | 无效的文件描述符 | */ var errCode: Double
  
  /** 错误信息
    *
    * | 错误信息 | 说明 |
    * | - | - |
    * | bad file descriptor | 无效的文件描述符 |
    * | fail permission denied | 指定的 fd 路径没有读权限 |
    * | fail the value of "offset" is out of range | 传入的 offset 不合法 |
    * | fail the value of "length" is out of range | 传入的 length 不合法 |
    * | fail sdcard not mounted | android sdcard 挂载失败 |
    * | bad file descriptor | 无效的文件描述符 | */ var errMsg: String
}
object ReadSyncError {
  
  inline def apply(errCode: Double, errMsg: String): ReadSyncError = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadSyncError]
  }
  
  extension [Self <: ReadSyncError](x: Self) {
    
    inline def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
