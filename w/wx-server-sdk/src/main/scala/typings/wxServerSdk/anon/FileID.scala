package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileID extends StObject {
  
  var errMsg: String
  
  var fileID: String
  
  var status: Double
  
  var tempFileURL: String
}
object FileID {
  
  inline def apply(errMsg: String, fileID: String, status: Double, tempFileURL: String): FileID = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tempFileURL = tempFileURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileID]
  }
  
  extension [Self <: FileID](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setFileID(value: String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTempFileURL(value: String): Self = StObject.set(x, "tempFileURL", value.asInstanceOf[js.Any])
  }
}
