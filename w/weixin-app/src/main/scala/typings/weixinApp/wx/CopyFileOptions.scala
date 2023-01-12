package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyFileOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  // 源文件路径，只可以是普通文件
  var destPath: String
  
  var srcPath: String
}
object CopyFileOptions {
  
  inline def apply(destPath: String, srcPath: String): CopyFileOptions = {
    val __obj = js.Dynamic.literal(destPath = destPath.asInstanceOf[js.Any], srcPath = srcPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyFileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyFileOptions] (val x: Self) extends AnyVal {
    
    inline def setDestPath(value: String): Self = StObject.set(x, "destPath", value.asInstanceOf[js.Any])
    
    inline def setSrcPath(value: String): Self = StObject.set(x, "srcPath", value.asInstanceOf[js.Any])
  }
}
