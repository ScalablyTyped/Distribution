package typings.winrtUwp.Windows.Media.Playback

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an error that occurred trying to resolve a MediaPlaybackItem . */
@js.native
trait MediaPlaybackItemError extends js.Object {
  
  /** Gets the error code associated with the playback item error. */
  var errorCode: MediaPlaybackItemErrorCode = js.native
  
  /** Gets the extended error code for the MediaPlaybackItem error. */
  var extendedError: WinRTError = js.native
}
object MediaPlaybackItemError {
  
  @scala.inline
  def apply(errorCode: MediaPlaybackItemErrorCode, extendedError: WinRTError): MediaPlaybackItemError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], extendedError = extendedError.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlaybackItemError]
  }
  
  @scala.inline
  implicit class MediaPlaybackItemErrorOps[Self <: MediaPlaybackItemError] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: MediaPlaybackItemErrorCode): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedError(value: WinRTError): Self = this.set("extendedError", value.asInstanceOf[js.Any])
  }
}
