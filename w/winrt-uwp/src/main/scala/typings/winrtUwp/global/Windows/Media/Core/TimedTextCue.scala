package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a text cue in a TimedMetadataTrack . */
@JSGlobal("Windows.Media.Core.TimedTextCue")
@js.native
/** Initializes a new instance of the TimedTextCue class. */
class TimedTextCue ()
  extends typings.winrtUwp.Windows.Media.Core.TimedTextCue {
  /** Gets or sets the TimedTextRegion of the cue, which defines the style of the rendering area for the cue. */
  /* CompleteClass */
  override var cueRegion: typings.winrtUwp.Windows.Media.Core.TimedTextRegion = js.native
  /** Gets or sets the TimedTextStyle of the cue, which defines the style of the rendered text. */
  /* CompleteClass */
  override var cueStyle: typings.winrtUwp.Windows.Media.Core.TimedTextStyle = js.native
  /** Gets or sets the duration of the cue. */
  /* CompleteClass */
  override var duration: Double = js.native
  /** Gets or sets an identifier for the cue. */
  /* CompleteClass */
  override var id: String = js.native
  /** Gets the collection of TimedTextLine objects that convey the text of the cue. */
  /* CompleteClass */
  override var lines: IVector[typings.winrtUwp.Windows.Media.Core.TimedTextLine] = js.native
  /** Gets the start time of the cue. */
  /* CompleteClass */
  override var startTime: Double = js.native
}

