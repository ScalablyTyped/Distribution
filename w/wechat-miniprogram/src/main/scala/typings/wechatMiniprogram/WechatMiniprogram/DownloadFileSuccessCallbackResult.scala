package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadFileSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 用户文件路径 (本地路径)。传入 filePath 时会返回，跟传入的 filePath 一致 */
  var filePath: String
  
  /** 网络请求过程中一些调试信息
    *
    * 最低基础库： `2.10.4` */
  var profile: DownloadProfile
  
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double
  
  /** 临时文件路径 (本地路径)。没传入 filePath 指定文件存储路径时会返回，下载后的文件会存储到一个临时文件 */
  var tempFilePath: String
}
object DownloadFileSuccessCallbackResult {
  
  inline def apply(
    errMsg: String,
    filePath: String,
    profile: DownloadProfile,
    statusCode: Double,
    tempFilePath: String
  ): DownloadFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileSuccessCallbackResult]
  }
  
  extension [Self <: DownloadFileSuccessCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: DownloadProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
