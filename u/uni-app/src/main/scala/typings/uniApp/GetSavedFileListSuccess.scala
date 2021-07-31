package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSavedFileListSuccess extends StObject {
  
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[Double] = js.undefined
  
  /**
    * 文件列表
    */
  var fileList: js.UndefOr[String] = js.undefined
}
object GetSavedFileListSuccess {
  
  @scala.inline
  def apply(): GetSavedFileListSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSavedFileListSuccess]
  }
  
  @scala.inline
  implicit class GetSavedFileListSuccessMutableBuilder[Self <: GetSavedFileListSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: Double): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
    
    @scala.inline
    def setFileList(value: String): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileListUndefined: Self = StObject.set(x, "fileList", js.undefined)
  }
}
