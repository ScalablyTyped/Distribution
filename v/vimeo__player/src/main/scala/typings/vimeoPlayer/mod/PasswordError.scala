package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswordError extends Error {
  
  @JSName("name")
  var name_PasswordError: typings.vimeoPlayer.vimeoPlayerStrings.PasswordError = js.native
}
object PasswordError {
  
  @scala.inline
  def apply(message: String, method: String, name: typings.vimeoPlayer.vimeoPlayerStrings.PasswordError): PasswordError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordError]
  }
  
  @scala.inline
  implicit class PasswordErrorMutableBuilder[Self <: PasswordError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: typings.vimeoPlayer.vimeoPlayerStrings.PasswordError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
