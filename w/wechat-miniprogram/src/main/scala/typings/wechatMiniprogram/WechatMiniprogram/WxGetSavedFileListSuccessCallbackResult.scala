package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WxGetSavedFileListSuccessCallbackResult extends StObject {
  
  var errMsg: String = js.native
  
  /** 文件数组，每一项是一个 FileItem */
  var fileList: js.Array[FileItem] = js.native
}
object WxGetSavedFileListSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, fileList: js.Array[FileItem]): WxGetSavedFileListSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[WxGetSavedFileListSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class WxGetSavedFileListSuccessCallbackResultMutableBuilder[Self <: WxGetSavedFileListSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileList(value: js.Array[FileItem]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileListVarargs(value: FileItem*): Self = StObject.set(x, "fileList", js.Array(value :_*))
  }
}
