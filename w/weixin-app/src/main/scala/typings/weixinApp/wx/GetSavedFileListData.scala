package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSavedFileListData extends StObject {
  
  /**
    * 接口调用结果
    */
  var errMsg: String = js.native
  
  /**
    * 文件列表
    */
  var fileList: js.Array[File] = js.native
}
object GetSavedFileListData {
  
  @scala.inline
  def apply(errMsg: String, fileList: js.Array[File]): GetSavedFileListData = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavedFileListData]
  }
  
  @scala.inline
  implicit class GetSavedFileListDataMutableBuilder[Self <: GetSavedFileListData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileList(value: js.Array[File]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileListVarargs(value: File*): Self = StObject.set(x, "fileList", js.Array(value :_*))
  }
}
