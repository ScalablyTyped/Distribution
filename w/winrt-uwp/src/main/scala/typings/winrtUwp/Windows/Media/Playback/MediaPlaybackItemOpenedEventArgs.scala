package typings.winrtUwp.Windows.Media.Playback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaPlaybackList::ItemOpened event. */
@js.native
trait MediaPlaybackItemOpenedEventArgs extends StObject {
  
  /** Gets the MediaPlaybackItem that was successfully opened. */
  var item: MediaPlaybackItem = js.native
}
object MediaPlaybackItemOpenedEventArgs {
  
  @scala.inline
  def apply(item: MediaPlaybackItem): MediaPlaybackItemOpenedEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlaybackItemOpenedEventArgs]
  }
  
  @scala.inline
  implicit class MediaPlaybackItemOpenedEventArgsMutableBuilder[Self <: MediaPlaybackItemOpenedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: MediaPlaybackItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
