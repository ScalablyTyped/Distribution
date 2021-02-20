package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemManagerGetSavedFileListSuccessCallbackResult extends StObject {
  
  var errMsg: String = js.native
  
  /** 文件数组 */
  var fileList: js.Array[FileItem] = js.native
}
object FileSystemManagerGetSavedFileListSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, fileList: js.Array[FileItem]): FileSystemManagerGetSavedFileListSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemManagerGetSavedFileListSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class FileSystemManagerGetSavedFileListSuccessCallbackResultMutableBuilder[Self <: FileSystemManagerGetSavedFileListSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileList(value: js.Array[FileItem]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileListVarargs(value: FileItem*): Self = StObject.set(x, "fileList", js.Array(value :_*))
  }
}
