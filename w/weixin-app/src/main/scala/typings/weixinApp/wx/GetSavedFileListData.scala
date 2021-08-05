package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSavedFileListData extends StObject {
  
  /**
    * 接口调用结果
    */
  var errMsg: String
  
  /**
    * 文件列表
    */
  var fileList: js.Array[File]
}
object GetSavedFileListData {
  
  inline def apply(errMsg: String, fileList: js.Array[File]): GetSavedFileListData = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavedFileListData]
  }
  
  extension [Self <: GetSavedFileListData](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setFileList(value: js.Array[File]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    inline def setFileListVarargs(value: File*): Self = StObject.set(x, "fileList", js.Array(value :_*))
  }
}
