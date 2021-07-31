package typings.wechatMiniprogram.ICloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileResultItem extends StObject {
  
  var errMsg: String
  
  var fileID: String
  
  var status: Double
}
object DeleteFileResultItem {
  
  @scala.inline
  def apply(errMsg: String, fileID: String, status: Double): DeleteFileResultItem = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileResultItem]
  }
  
  @scala.inline
  implicit class DeleteFileResultItemMutableBuilder[Self <: DeleteFileResultItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileID(value: String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
