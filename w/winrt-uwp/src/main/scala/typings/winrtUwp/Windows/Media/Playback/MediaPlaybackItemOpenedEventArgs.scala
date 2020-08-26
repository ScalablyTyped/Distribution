package typings.winrtUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaPlaybackList::ItemOpened event. */
@js.native
trait MediaPlaybackItemOpenedEventArgs extends js.Object {
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
  implicit class MediaPlaybackItemOpenedEventArgsOps[Self <: MediaPlaybackItemOpenedEventArgs] (val x: Self) extends AnyVal {
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
    def setItem(value: MediaPlaybackItem): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

