package typings.wechatMiniprogram.ICloud

import typings.wechatMiniprogram.IAPISuccessParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// === end ===
// === API: deleteFile ===
@js.native
trait DeleteFileResult extends IAPISuccessParam {
  
  var fileList: js.Array[DeleteFileResultItem] = js.native
}
object DeleteFileResult {
  
  @scala.inline
  def apply(errMsg: String, fileList: js.Array[DeleteFileResultItem]): DeleteFileResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileResult]
  }
  
  @scala.inline
  implicit class DeleteFileResultMutableBuilder[Self <: DeleteFileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileList(value: js.Array[DeleteFileResultItem]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileListVarargs(value: DeleteFileResultItem*): Self = StObject.set(x, "fileList", js.Array(value :_*))
  }
}
