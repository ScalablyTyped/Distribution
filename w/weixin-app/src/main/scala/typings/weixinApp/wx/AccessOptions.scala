package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 文件
trait AccessOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var path: String
}
object AccessOptions {
  
  inline def apply(path: String): AccessOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessOptions]
  }
  
  extension [Self <: AccessOptions](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
