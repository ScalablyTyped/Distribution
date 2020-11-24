package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemManagerGetSavedFileListSuccessCallbackResult extends js.Object {
  
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
  implicit class FileSystemManagerGetSavedFileListSuccessCallbackResultOps[Self <: FileSystemManagerGetSavedFileListSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileListVarargs(value: FileItem*): Self = this.set("fileList", js.Array(value :_*))
    
    @scala.inline
    def setFileList(value: js.Array[FileItem]): Self = this.set("fileList", value.asInstanceOf[js.Any])
  }
}
