package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the DownloadBitrateChanged event. */
trait AdaptiveMediaSourceDownloadBitrateChangedEventArgs extends js.Object {
  /** Gets a value indicating the new download bitrate for the media source. */
  var newValue: Double
  /** Gets a value indicating the previous download bitrate for the media source. */
  var oldValue: Double
}

object AdaptiveMediaSourceDownloadBitrateChangedEventArgs {
  @scala.inline
  def apply(newValue: Double, oldValue: Double): AdaptiveMediaSourceDownloadBitrateChangedEventArgs = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceDownloadBitrateChangedEventArgs]
  }
}

