package typings.wechatMiniprogram.ICloud

import typings.wechatMiniprogram.IAPISuccessParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// === end ===
// === API: downloadFile ===
trait DownloadFileResult
  extends StObject
     with IAPISuccessParam {
  
  var statusCode: Double
  
  var tempFilePath: String
}
object DownloadFileResult {
  
  @scala.inline
  def apply(errMsg: String, statusCode: Double, tempFilePath: String): DownloadFileResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileResult]
  }
  
  @scala.inline
  implicit class DownloadFileResultMutableBuilder[Self <: DownloadFileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
  }
}
