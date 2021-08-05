package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyFileOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  // 源文件路径，只可以是普通文件
  var destPath: String
  
  var srcPath: String
}
object CopyFileOptions {
  
  inline def apply(destPath: String, srcPath: String): CopyFileOptions = {
    val __obj = js.Dynamic.literal(destPath = destPath.asInstanceOf[js.Any], srcPath = srcPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyFileOptions]
  }
  
  extension [Self <: CopyFileOptions](x: Self) {
    
    inline def setDestPath(value: String): Self = StObject.set(x, "destPath", value.asInstanceOf[js.Any])
    
    inline def setSrcPath(value: String): Self = StObject.set(x, "srcPath", value.asInstanceOf[js.Any])
  }
}
