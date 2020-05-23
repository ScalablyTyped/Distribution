package typings.winrtUwp.Windows.Media.Editing

import typings.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an overlay that can be used in a media composition. */
trait MediaOverlay extends js.Object {
  /** Gets or sets a value indicating whether audio is enabled for the MediaOverlay . */
  var audioEnabled: Boolean
  /** Gets the media clip to be used for the overlay. */
  var clip: MediaClip
  /** Gets or sets the time span from the start of the clip after which the media overlay should be rendered. */
  var delay: Double
  /** Gets the opacity of the overlay. */
  var opacity: Double
  /** Gets the position of the overlay. */
  var position: Rect
}

object MediaOverlay {
  @scala.inline
  def apply(audioEnabled: Boolean, clip: MediaClip, delay: Double, opacity: Double, position: Rect): MediaOverlay = {
    val __obj = js.Dynamic.literal(audioEnabled = audioEnabled.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaOverlay]
  }
}

