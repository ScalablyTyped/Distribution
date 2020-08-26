package typings.winrtUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the data for MediaPlayerRateChanged events. */
@js.native
trait MediaPlayerRateChangedEventArgs extends js.Object {
  /** Gets the new playback rate for the media. */
  var newRate: Double = js.native
}

object MediaPlayerRateChangedEventArgs {
  @scala.inline
  def apply(newRate: Double): MediaPlayerRateChangedEventArgs = {
    val __obj = js.Dynamic.literal(newRate = newRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlayerRateChangedEventArgs]
  }
  @scala.inline
  implicit class MediaPlayerRateChangedEventArgsOps[Self <: MediaPlayerRateChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setNewRate(value: Double): Self = this.set("newRate", value.asInstanceOf[js.Any])
  }
  
}

