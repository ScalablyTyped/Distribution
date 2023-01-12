package typings.wechatMiniprogram.ICloud

import typings.wechatMiniprogram.IAPISuccessParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// === end ===
// === API: getTempFileURL ===
trait GetTempFileURLResult
  extends StObject
     with IAPISuccessParam {
  
  var fileList: js.Array[GetTempFileURLResultItem]
}
object GetTempFileURLResult {
  
  inline def apply(errMsg: String, fileList: js.Array[GetTempFileURLResultItem]): GetTempFileURLResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTempFileURLResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTempFileURLResult] (val x: Self) extends AnyVal {
    
    inline def setFileList(value: js.Array[GetTempFileURLResultItem]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    inline def setFileListVarargs(value: GetTempFileURLResultItem*): Self = StObject.set(x, "fileList", js.Array(value*))
  }
}
