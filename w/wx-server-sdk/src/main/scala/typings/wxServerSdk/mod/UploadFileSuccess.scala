package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadFileSuccess extends StObject {
  
  var fileID: String
  
  var statusCode: Double
}
object UploadFileSuccess {
  
  inline def apply(fileID: String, statusCode: Double): UploadFileSuccess = {
    val __obj = js.Dynamic.literal(fileID = fileID.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileSuccess]
  }
  
  extension [Self <: UploadFileSuccess](x: Self) {
    
    inline def setFileID(value: String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
