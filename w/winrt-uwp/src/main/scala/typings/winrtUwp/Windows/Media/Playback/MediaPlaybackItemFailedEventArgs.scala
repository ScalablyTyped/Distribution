package typings.winrtUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaPlaybackList::ItemFailed event. */
trait MediaPlaybackItemFailedEventArgs extends js.Object {
  /** Gets a wrapper object for the MediaPlaybackItem error that provides high-level information about the cause of the error. */
  var error: MediaPlaybackItemError
  /** Gets the MediaPlaybackItem associated with the error. */
  var item: MediaPlaybackItem
}

object MediaPlaybackItemFailedEventArgs {
  @scala.inline
  def apply(error: MediaPlaybackItemError, item: MediaPlaybackItem): MediaPlaybackItemFailedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlaybackItemFailedEventArgs]
  }
}

