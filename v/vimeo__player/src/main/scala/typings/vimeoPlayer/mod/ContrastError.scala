package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContrastError extends Error {
  
  @JSName("name")
  var name_ContrastError: typings.vimeoPlayer.vimeoPlayerStrings.ContrastError = js.native
}
object ContrastError {
  
  @scala.inline
  def apply(message: String, method: String, name: typings.vimeoPlayer.vimeoPlayerStrings.ContrastError): ContrastError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContrastError]
  }
  
  @scala.inline
  implicit class ContrastErrorMutableBuilder[Self <: ContrastError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: typings.vimeoPlayer.vimeoPlayerStrings.ContrastError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
