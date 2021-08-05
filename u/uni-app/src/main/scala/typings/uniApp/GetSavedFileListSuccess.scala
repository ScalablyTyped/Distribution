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
  
  inline def apply(): GetSavedFileListSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSavedFileListSuccess]
  }
  
  extension [Self <: GetSavedFileListSuccess](x: Self) {
    
    inline def setErrMsg(value: Double): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
    
    inline def setFileList(value: String): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    inline def setFileListUndefined: Self = StObject.set(x, "fileList", js.undefined)
  }
}
