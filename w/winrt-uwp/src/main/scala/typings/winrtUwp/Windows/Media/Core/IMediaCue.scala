package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the interface implemented by all media cues. */
trait IMediaCue extends js.Object {
  /** Gets or sets the duration of the media cue. */
  var duration: Double
  /** Gets or sets the identifier for the media cue. */
  var id: String
  /** Gets or sets the start time of the media cue. */
  var startTime: Double
}

object IMediaCue {
  @scala.inline
  def apply(duration: Double, id: String, startTime: Double): IMediaCue = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMediaCue]
  }
}

