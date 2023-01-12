package typings.winrtUwp.Windows.Media.Playback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaPlaybackList::CurrentItemChanged event. */
trait CurrentMediaPlaybackItemChangedEventArgs extends StObject {
  
  /** Gets the new current MediaPlaybackItem . */
  var newItem: MediaPlaybackItem
  
  /** Gets the previous current MediaPlaybackItem . */
  var oldItem: MediaPlaybackItem
}
object CurrentMediaPlaybackItemChangedEventArgs {
  
  inline def apply(newItem: MediaPlaybackItem, oldItem: MediaPlaybackItem): CurrentMediaPlaybackItemChangedEventArgs = {
    val __obj = js.Dynamic.literal(newItem = newItem.asInstanceOf[js.Any], oldItem = oldItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentMediaPlaybackItemChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurrentMediaPlaybackItemChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setNewItem(value: MediaPlaybackItem): Self = StObject.set(x, "newItem", value.asInstanceOf[js.Any])
    
    inline def setOldItem(value: MediaPlaybackItem): Self = StObject.set(x, "oldItem", value.asInstanceOf[js.Any])
  }
}
