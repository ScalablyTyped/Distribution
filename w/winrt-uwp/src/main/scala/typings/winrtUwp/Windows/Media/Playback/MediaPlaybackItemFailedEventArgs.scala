package typings.winrtUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaPlaybackList::ItemFailed event. */
@js.native
trait MediaPlaybackItemFailedEventArgs extends js.Object {
  
  /** Gets a wrapper object for the MediaPlaybackItem error that provides high-level information about the cause of the error. */
  var error: MediaPlaybackItemError = js.native
  
  /** Gets the MediaPlaybackItem associated with the error. */
  var item: MediaPlaybackItem = js.native
}
object MediaPlaybackItemFailedEventArgs {
  
  @scala.inline
  def apply(error: MediaPlaybackItemError, item: MediaPlaybackItem): MediaPlaybackItemFailedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlaybackItemFailedEventArgs]
  }
  
  @scala.inline
  implicit class MediaPlaybackItemFailedEventArgsOps[Self <: MediaPlaybackItemFailedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setError(value: MediaPlaybackItemError): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: MediaPlaybackItem): Self = this.set("item", value.asInstanceOf[js.Any])
  }
}
