package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameOptions
  extends BaseOptions[js.Any, js.Any] {
  
  // 源文件路径，可以是普通文件或目录
  var newPath: String = js.native
  
  var oldPath: String = js.native
}
object RenameOptions {
  
  @scala.inline
  def apply(newPath: String, oldPath: String): RenameOptions = {
    val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameOptions]
  }
  
  @scala.inline
  implicit class RenameOptionsMutableBuilder[Self <: RenameOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewPath(value: String): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldPath(value: String): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
  }
}
