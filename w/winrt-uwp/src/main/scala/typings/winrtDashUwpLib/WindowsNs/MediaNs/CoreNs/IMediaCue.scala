package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the interface implemented by all media cues. */
trait IMediaCue extends js.Object {
  /** Gets or sets the duration of the media cue. */
  var duration: scala.Double
  /** Gets or sets the identifier for the media cue. */
  var id: java.lang.String
  /** Gets or sets the start time of the media cue. */
  var startTime: scala.Double
}

object IMediaCue {
  @scala.inline
  def apply(duration: scala.Double, id: java.lang.String, startTime: scala.Double): IMediaCue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[IMediaCue]
  }
}

