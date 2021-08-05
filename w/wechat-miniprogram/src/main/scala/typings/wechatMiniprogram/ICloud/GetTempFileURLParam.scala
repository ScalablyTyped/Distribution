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
  
  inline def apply(fileList: js.Array[String]): GetTempFileURLParam = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTempFileURLParam]
  }
  
  extension [Self <: GetTempFileURLParam](x: Self) {
    
    inline def setFileList(value: js.Array[String]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    inline def setFileListVarargs(value: String*): Self = StObject.set(x, "fileList", js.Array(value :_*))
  }
}
