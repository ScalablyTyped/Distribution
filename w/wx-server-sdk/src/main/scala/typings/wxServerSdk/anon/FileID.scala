package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileID extends StObject {
  
  var fileID: String
}
object FileID {
  
  @scala.inline
  def apply(fileID: String): FileID = {
    val __obj = js.Dynamic.literal(fileID = fileID.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileID]
  }
  
  @scala.inline
  implicit class FileIDMutableBuilder[Self <: FileID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileID(value: String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
  }
}
