package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadFileSuccess extends StObject {
  
  var fileID: String = js.native
  
  var statusCode: Double = js.native
}
object UploadFileSuccess {
  
  @scala.inline
  def apply(fileID: String, statusCode: Double): UploadFileSuccess = {
    val __obj = js.Dynamic.literal(fileID = fileID.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileSuccess]
  }
  
  @scala.inline
  implicit class UploadFileSuccessMutableBuilder[Self <: UploadFileSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileID(value: String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
