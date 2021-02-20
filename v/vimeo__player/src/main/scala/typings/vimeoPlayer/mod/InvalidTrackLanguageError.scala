package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidTrackLanguageError extends Error {
  
  @JSName("name")
  var name_InvalidTrackLanguageError: typings.vimeoPlayer.vimeoPlayerStrings.InvalidTrackLanguageError = js.native
}
object InvalidTrackLanguageError {
  
  @scala.inline
  def apply(
    message: String,
    method: String,
    name: typings.vimeoPlayer.vimeoPlayerStrings.InvalidTrackLanguageError
  ): InvalidTrackLanguageError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidTrackLanguageError]
  }
  
  @scala.inline
  implicit class InvalidTrackLanguageErrorMutableBuilder[Self <: InvalidTrackLanguageError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: typings.vimeoPlayer.vimeoPlayerStrings.InvalidTrackLanguageError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
