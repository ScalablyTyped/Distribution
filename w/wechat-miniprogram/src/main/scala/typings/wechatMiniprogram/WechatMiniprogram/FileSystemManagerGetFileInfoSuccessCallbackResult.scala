package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemManagerGetFileInfoSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 文件大小，以字节为单位 */
  var size: Double
}
object FileSystemManagerGetFileInfoSuccessCallbackResult {
  
  inline def apply(errMsg: String, size: Double): FileSystemManagerGetFileInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemManagerGetFileInfoSuccessCallbackResult]
  }
  
  extension [Self <: FileSystemManagerGetFileInfoSuccessCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
