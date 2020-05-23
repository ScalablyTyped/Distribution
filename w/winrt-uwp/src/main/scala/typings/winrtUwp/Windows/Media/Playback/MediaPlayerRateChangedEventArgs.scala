package typings.winrtUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the data for MediaPlayerRateChanged events. */
trait MediaPlayerRateChangedEventArgs extends js.Object {
  /** Gets the new playback rate for the media. */
  var newRate: Double
}

object MediaPlayerRateChangedEventArgs {
  @scala.inline
  def apply(newRate: Double): MediaPlayerRateChangedEventArgs = {
    val __obj = js.Dynamic.literal(newRate = newRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlayerRateChangedEventArgs]
  }
}

