package typings.winrtUwp.Windows.Media.Playback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaPlaybackList::ItemFailed event. */
@js.native
trait MediaPlaybackItemFailedEventArgs extends StObject {
  
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
  implicit class MediaPlaybackItemFailedEventArgsMutableBuilder[Self <: MediaPlaybackItemFailedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: MediaPlaybackItemError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: MediaPlaybackItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
