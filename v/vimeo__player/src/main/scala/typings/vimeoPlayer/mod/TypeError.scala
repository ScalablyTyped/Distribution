package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeError extends Error {
  
  @JSName("name")
  var name_TypeError: typings.vimeoPlayer.vimeoPlayerStrings.TypeError = js.native
}
object TypeError {
  
  @scala.inline
  def apply(message: String, method: String, name: typings.vimeoPlayer.vimeoPlayerStrings.TypeError): TypeError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeError]
  }
  
  @scala.inline
  implicit class TypeErrorMutableBuilder[Self <: TypeError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: typings.vimeoPlayer.vimeoPlayerStrings.TypeError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
