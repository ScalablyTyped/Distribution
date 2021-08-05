package typings.winrtUwp.Windows.Media.Playback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaPlaybackList::ItemOpened event. */
trait MediaPlaybackItemOpenedEventArgs extends StObject {
  
  /** Gets the MediaPlaybackItem that was successfully opened. */
  var item: MediaPlaybackItem
}
object MediaPlaybackItemOpenedEventArgs {
  
  inline def apply(item: MediaPlaybackItem): MediaPlaybackItemOpenedEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlaybackItemOpenedEventArgs]
  }
  
  extension [Self <: MediaPlaybackItemOpenedEventArgs](x: Self) {
    
    inline def setItem(value: MediaPlaybackItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
