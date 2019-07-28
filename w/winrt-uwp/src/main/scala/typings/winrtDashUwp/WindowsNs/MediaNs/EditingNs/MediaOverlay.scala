package typings.winrtDashUwp.WindowsNs.MediaNs.EditingNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an overlay that can be used in a media composition. */
@JSGlobal("Windows.Media.Editing.MediaOverlay")
@js.native
class MediaOverlay protected () extends js.Object {
  /**
    * Initializes a new instance of the MediaOverlay class.
    * @param clip The media clip to be used for the overlay.
    */
  def this(clip: MediaClip) = this()
  /**
    * Initializes a new instance of the MediaOverlay class.
    * @param clip The media clip to be used for the overlay.
    * @param position The position of the overlay.
    * @param opacity The opacity of the overlay, in the range of 0.0 to 1.0, where 0.0 is completely transparent and 1.0 is completely opaque.
    */
  def this(clip: MediaClip, position: Rect, opacity: Double) = this()
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

