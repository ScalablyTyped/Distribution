package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  // 源文件路径，可以是普通文件或目录
  var newPath: String
  
  var oldPath: String
}
object RenameOptions {
  
  inline def apply(newPath: String, oldPath: String): RenameOptions = {
    val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenameOptions] (val x: Self) extends AnyVal {
    
    inline def setNewPath(value: String): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
    
    inline def setOldPath(value: String): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
  }
}
