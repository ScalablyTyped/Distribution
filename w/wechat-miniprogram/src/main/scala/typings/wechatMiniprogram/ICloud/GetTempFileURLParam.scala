package typings.wechatMiniprogram.ICloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTempFileURLParam
  extends StObject
     with ICloudAPIParam[GetTempFileURLResult] {
  
  var fileList: js.Array[String]
}
object GetTempFileURLParam {
  
  @scala.inline
  def apply(fileList: js.Array[String]): GetTempFileURLParam = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTempFileURLParam]
  }
  
  @scala.inline
  implicit class GetTempFileURLParamMutableBuilder[Self <: GetTempFileURLParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileList(value: js.Array[String]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileListVarargs(value: String*): Self = StObject.set(x, "fileList", js.Array(value :_*))
  }
}
