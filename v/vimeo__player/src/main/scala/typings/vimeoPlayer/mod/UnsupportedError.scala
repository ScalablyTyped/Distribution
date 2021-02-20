package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsupportedError extends Error {
  
  @JSName("name")
  var name_UnsupportedError: typings.vimeoPlayer.vimeoPlayerStrings.UnsupportedError = js.native
}
object UnsupportedError {
  
  @scala.inline
  def apply(message: String, method: String, name: typings.vimeoPlayer.vimeoPlayerStrings.UnsupportedError): UnsupportedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedError]
  }
  
  @scala.inline
  implicit class UnsupportedErrorMutableBuilder[Self <: UnsupportedError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: typings.vimeoPlayer.vimeoPlayerStrings.UnsupportedError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
