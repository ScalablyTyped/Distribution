package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the Live Photo playback stops.
  */
trait LivePhotoViewStopEvent extends LivePhotoViewBaseEvent {
  /**
    * Returns the `playbackStyle` that was provided to start the playback.
    */
  var playbackStyle: Double
}

object LivePhotoViewStopEvent {
  @scala.inline
  def apply(playbackStyle: Double, source: LivePhotoView): LivePhotoViewStopEvent = {
    val __obj = js.Dynamic.literal(playbackStyle = playbackStyle.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LivePhotoViewStopEvent]
  }
}

