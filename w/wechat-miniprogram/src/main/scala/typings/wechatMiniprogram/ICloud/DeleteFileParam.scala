package typings.wechatMiniprogram.ICloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFileParam extends ICloudAPIParam[DeleteFileResult] {
  
  var fileList: js.Array[String] = js.native
}
object DeleteFileParam {
  
  @scala.inline
  def apply(fileList: js.Array[String]): DeleteFileParam = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileParam]
  }
  
  @scala.inline
  implicit class DeleteFileParamMutableBuilder[Self <: DeleteFileParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileList(value: js.Array[String]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileListVarargs(value: String*): Self = StObject.set(x, "fileList", js.Array(value :_*))
  }
}
