package typings.winrtUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaPlaybackList::ItemOpened event. */
trait MediaPlaybackItemOpenedEventArgs extends js.Object {
  /** Gets the MediaPlaybackItem that was successfully opened. */
  var item: MediaPlaybackItem
}

object MediaPlaybackItemOpenedEventArgs {
  @scala.inline
  def apply(item: MediaPlaybackItem): MediaPlaybackItemOpenedEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlaybackItemOpenedEventArgs]
  }
}

