package typings.wechatMiniprogram.ICloud

import typings.wechatMiniprogram.IAPISuccessParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// === end ===
// === API: uploadFile ===
trait UploadFileResult
  extends StObject
     with IAPISuccessParam {
  
  var fileID: String
  
  var statusCode: Double
}
object UploadFileResult {
  
  inline def apply(errMsg: String, fileID: String, statusCode: Double): UploadFileResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileResult]
  }
  
  extension [Self <: UploadFileResult](x: Self) {
    
    inline def setFileID(value: String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
