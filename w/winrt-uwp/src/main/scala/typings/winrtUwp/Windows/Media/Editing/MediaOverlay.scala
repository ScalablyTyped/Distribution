package typings.winrtUwp.Windows.Media.Editing

import typings.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an overlay that can be used in a media composition. */
@js.native
trait MediaOverlay extends js.Object {
  /** Gets or sets a value indicating whether audio is enabled for the MediaOverlay . */
  var audioEnabled: Boolean = js.native
  /** Gets the media clip to be used for the overlay. */
  var clip: MediaClip = js.native
  /** Gets or sets the time span from the start of the clip after which the media overlay should be rendered. */
  var delay: Double = js.native
  /** Gets the opacity of the overlay. */
  var opacity: Double = js.native
  /** Gets the position of the overlay. */
  var position: Rect = js.native
}

object MediaOverlay {
  @scala.inline
  def apply(audioEnabled: Boolean, clip: MediaClip, delay: Double, opacity: Double, position: Rect): MediaOverlay = {
    val __obj = js.Dynamic.literal(audioEnabled = audioEnabled.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaOverlay]
  }
  @scala.inline
  implicit class MediaOverlayOps[Self <: MediaOverlay] (val x: Self) extends AnyVal {
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
    def setAudioEnabled(value: Boolean): Self = this.set("audioEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setClip(value: MediaClip): Self = this.set("clip", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Rect): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

