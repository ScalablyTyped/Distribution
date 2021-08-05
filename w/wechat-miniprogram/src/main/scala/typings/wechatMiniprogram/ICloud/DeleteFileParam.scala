package typings.wechatMiniprogram.ICloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileParam
  extends StObject
     with ICloudAPIParam[DeleteFileResult] {
  
  var fileList: js.Array[String]
}
object DeleteFileParam {
  
  inline def apply(fileList: js.Array[String]): DeleteFileParam = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileParam]
  }
  
  extension [Self <: DeleteFileParam](x: Self) {
    
    inline def setFileList(value: js.Array[String]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    inline def setFileListVarargs(value: String*): Self = StObject.set(x, "fileList", js.Array(value :_*))
  }
}
