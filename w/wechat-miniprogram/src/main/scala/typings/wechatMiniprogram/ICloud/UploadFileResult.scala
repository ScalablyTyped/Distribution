package typings.wechatMiniprogram.ICloud

import typings.wechatMiniprogram.IAPISuccessParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// === end ===
// === API: uploadFile ===
@js.native
trait UploadFileResult extends IAPISuccessParam {
  
  var fileID: String = js.native
  
  var statusCode: Double = js.native
}
object UploadFileResult {
  
  @scala.inline
  def apply(errMsg: String, fileID: String, statusCode: Double): UploadFileResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileResult]
  }
  
  @scala.inline
  implicit class UploadFileResultMutableBuilder[Self <: UploadFileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileID(value: String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
