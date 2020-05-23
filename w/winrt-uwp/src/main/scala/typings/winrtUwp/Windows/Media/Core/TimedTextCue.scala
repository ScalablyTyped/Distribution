package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a text cue in a TimedMetadataTrack . */
trait TimedTextCue extends js.Object {
  /** Gets or sets the TimedTextRegion of the cue, which defines the style of the rendering area for the cue. */
  var cueRegion: TimedTextRegion
  /** Gets or sets the TimedTextStyle of the cue, which defines the style of the rendered text. */
  var cueStyle: TimedTextStyle
  /** Gets or sets the duration of the cue. */
  var duration: Double
  /** Gets or sets an identifier for the cue. */
  var id: String
  /** Gets the collection of TimedTextLine objects that convey the text of the cue. */
  var lines: IVector[TimedTextLine]
  /** Gets the start time of the cue. */
  var startTime: Double
}

object TimedTextCue {
  @scala.inline
  def apply(
    cueRegion: TimedTextRegion,
    cueStyle: TimedTextStyle,
    duration: Double,
    id: String,
    lines: IVector[TimedTextLine],
    startTime: Double
  ): TimedTextCue = {
    val __obj = js.Dynamic.literal(cueRegion = cueRegion.asInstanceOf[js.Any], cueStyle = cueStyle.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextCue]
  }
}

