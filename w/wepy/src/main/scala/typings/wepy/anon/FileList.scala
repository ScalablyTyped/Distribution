package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileList extends StObject {
  
  var errMsg: String = js.native
  
  var fileList: js.Array[js.Object] = js.native
}
object FileList {
  
  @scala.inline
  def apply(errMsg: String, fileList: js.Array[js.Object]): FileList = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileList]
  }
  
  @scala.inline
  implicit class FileListMutableBuilder[Self <: FileList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileList(value: js.Array[js.Object]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileListVarargs(value: js.Object*): Self = StObject.set(x, "fileList", js.Array(value :_*))
  }
}
