package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnzipOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  // 源文件路径，只可以是 zip 压缩文件
  var targetPath: String
  
  var zipFilePath: String
}
object UnzipOptions {
  
  inline def apply(targetPath: String, zipFilePath: String): UnzipOptions = {
    val __obj = js.Dynamic.literal(targetPath = targetPath.asInstanceOf[js.Any], zipFilePath = zipFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnzipOptions]
  }
  
  extension [Self <: UnzipOptions](x: Self) {
    
    inline def setTargetPath(value: String): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
    
    inline def setZipFilePath(value: String): Self = StObject.set(x, "zipFilePath", value.asInstanceOf[js.Any])
  }
}
