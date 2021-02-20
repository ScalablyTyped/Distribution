package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 文件
@js.native
trait AccessOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var path: String = js.native
}
object AccessOptions {
  
  @scala.inline
  def apply(path: String): AccessOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessOptions]
  }
  
  @scala.inline
  implicit class AccessOptionsMutableBuilder[Self <: AccessOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
