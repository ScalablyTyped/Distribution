package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrMsg extends StObject {
  
  var errMsg: String
  
  var fileID: String
  
  var status: Double
  
  var tempFileURL: String
}
object ErrMsg {
  
  @scala.inline
  def apply(errMsg: String, fileID: String, status: Double, tempFileURL: String): ErrMsg = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tempFileURL = tempFileURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrMsg]
  }
  
  @scala.inline
  implicit class ErrMsgMutableBuilder[Self <: ErrMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileID(value: String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFileURL(value: String): Self = StObject.set(x, "tempFileURL", value.asInstanceOf[js.Any])
  }
}
