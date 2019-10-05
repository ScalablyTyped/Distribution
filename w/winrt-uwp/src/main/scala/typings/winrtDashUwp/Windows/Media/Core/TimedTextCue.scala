package typings.winrtDashUwp.Windows.Media.Core

import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a text cue in a TimedMetadataTrack . */
@JSGlobal("Windows.Media.Core.TimedTextCue")
@js.native
/** Initializes a new instance of the TimedTextCue class. */
class TimedTextCue () extends js.Object {
  /** Gets or sets the TimedTextRegion of the cue, which defines the style of the rendering area for the cue. */
  var cueRegion: TimedTextRegion = js.native
  /** Gets or sets the TimedTextStyle of the cue, which defines the style of the rendered text. */
  var cueStyle: TimedTextStyle = js.native
  /** Gets or sets the duration of the cue. */
  var duration: Double = js.native
  /** Gets or sets an identifier for the cue. */
  var id: String = js.native
  /** Gets the collection of TimedTextLine objects that convey the text of the cue. */
  var lines: IVector[TimedTextLine] = js.native
  /** Gets the start time of the cue. */
  var startTime: Double = js.native
}

