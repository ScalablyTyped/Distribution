package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the Live Photo playback starts.
  */
@js.native
trait LivePhotoViewStartEvent extends LivePhotoViewBaseEvent {
  /**
    * Returns the `playbackStyle` that was provided to start the playback.
    */
  var playbackStyle: Double = js.native
}

object LivePhotoViewStartEvent {
  @scala.inline
  def apply(playbackStyle: Double, source: LivePhotoView): LivePhotoViewStartEvent = {
    val __obj = js.Dynamic.literal(playbackStyle = playbackStyle.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LivePhotoViewStartEvent]
  }
  @scala.inline
  implicit class LivePhotoViewStartEventOps[Self <: LivePhotoViewStartEvent] (val x: Self) extends AnyVal {
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
    def setPlaybackStyle(value: Double): Self = this.set("playbackStyle", value.asInstanceOf[js.Any])
  }
  
}

