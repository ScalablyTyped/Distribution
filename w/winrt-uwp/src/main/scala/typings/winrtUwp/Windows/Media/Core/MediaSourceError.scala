package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an error that occurred with a MediaSource . */
@js.native
trait MediaSourceError extends js.Object {
  
  /** Gets the extended error code for the MediaSourceError . */
  var extendedError: WinRTError = js.native
}
object MediaSourceError {
  
  @scala.inline
  def apply(extendedError: WinRTError): MediaSourceError = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceError]
  }
  
  @scala.inline
  implicit class MediaSourceErrorOps[Self <: MediaSourceError] (val x: Self) extends AnyVal {
    
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
    def setExtendedError(value: WinRTError): Self = this.set("extendedError", value.asInstanceOf[js.Any])
  }
}
