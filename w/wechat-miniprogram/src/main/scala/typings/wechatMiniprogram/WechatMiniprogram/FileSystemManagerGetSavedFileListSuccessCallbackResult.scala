package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemManagerGetSavedFileListSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 文件数组 */
  var fileList: js.Array[FileItem]
}
object FileSystemManagerGetSavedFileListSuccessCallbackResult {
  
  inline def apply(errMsg: String, fileList: js.Array[FileItem]): FileSystemManagerGetSavedFileListSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemManagerGetSavedFileListSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemManagerGetSavedFileListSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setFileList(value: js.Array[FileItem]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    inline def setFileListVarargs(value: FileItem*): Self = StObject.set(x, "fileList", js.Array(value*))
  }
}
