package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TruncateSyncError extends StObject {
  
  /** 错误码
    *
    * | 错误信息 | 说明 |
    * | - | - |
    * | fail no such file or directory, open ${filePath} | 指定的 filePath 所在目录不存在 |
    * | fail illegal operation on a directory, open "${filePath}" | 指定的 filePath 是一个已经存在的目录 |
    * | fail permission denied, open ${dirPath} | 指定的 filePath 路径没有写权限 |
    * | fail the maximum size of the file storage limit is exceeded | 存储空间不足 |
    * | fail sdcard not mounted | android sdcard 挂载失败 | */ var errCode: Double
  
  /** 错误信息
    *
    * | 错误信息 | 说明 |
    * | - | - |
    * | fail no such file or directory, open ${filePath} | 指定的 filePath 所在目录不存在 |
    * | fail illegal operation on a directory, open "${filePath}" | 指定的 filePath 是一个已经存在的目录 |
    * | fail permission denied, open ${dirPath} | 指定的 filePath 路径没有写权限 |
    * | fail the maximum size of the file storage limit is exceeded | 存储空间不足 |
    * | fail sdcard not mounted | android sdcard 挂载失败 | */ var errMsg: String
}
object TruncateSyncError {
  
  inline def apply(errCode: Double, errMsg: String): TruncateSyncError = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncateSyncError]
  }
  
  extension [Self <: TruncateSyncError](x: Self) {
    
    inline def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
