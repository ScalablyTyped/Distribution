package typings.vimeoPlayer.mod

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
  implicit class InvalidTrackLanguageErrorOps[Self <: InvalidTrackLanguageError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: typings.vimeoPlayer.vimeoPlayerStrings.InvalidTrackLanguageError): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
