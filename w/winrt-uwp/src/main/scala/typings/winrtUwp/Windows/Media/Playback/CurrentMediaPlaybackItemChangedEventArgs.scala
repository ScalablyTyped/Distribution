package typings.winrtUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaPlaybackList::CurrentItemChanged event. */
trait CurrentMediaPlaybackItemChangedEventArgs extends js.Object {
  /** Gets the new current MediaPlaybackItem . */
  var newItem: MediaPlaybackItem
  /** Gets the previous current MediaPlaybackItem . */
  var oldItem: MediaPlaybackItem
}

object CurrentMediaPlaybackItemChangedEventArgs {
  @scala.inline
  def apply(newItem: MediaPlaybackItem, oldItem: MediaPlaybackItem): CurrentMediaPlaybackItemChangedEventArgs = {
    val __obj = js.Dynamic.literal(newItem = newItem.asInstanceOf[js.Any], oldItem = oldItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentMediaPlaybackItemChangedEventArgs]
  }
}

