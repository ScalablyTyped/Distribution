package typings.wechatMiniprogram.ICloud

import typings.wechatMiniprogram.IAPISuccessParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// === end ===
// === API: deleteFile ===
trait DeleteFileResult
  extends StObject
     with IAPISuccessParam {
  
  var fileList: js.Array[DeleteFileResultItem]
}
object DeleteFileResult {
  
  inline def apply(errMsg: String, fileList: js.Array[DeleteFileResultItem]): DeleteFileResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileResult]
  }
  
  extension [Self <: DeleteFileResult](x: Self) {
    
    inline def setFileList(value: js.Array[DeleteFileResultItem]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    inline def setFileListVarargs(value: DeleteFileResultItem*): Self = StObject.set(x, "fileList", js.Array(value*))
  }
}
