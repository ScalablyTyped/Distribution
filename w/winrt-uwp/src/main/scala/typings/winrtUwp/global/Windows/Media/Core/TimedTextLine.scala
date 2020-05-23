package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a line of text that is displayed with a TimedTextCue . */
@JSGlobal("Windows.Media.Core.TimedTextLine")
@js.native
/** Initializes a new instance of the TimedTextLine class. */
class TimedTextLine ()
  extends typings.winrtUwp.Windows.Media.Core.TimedTextLine {
  /** Gets a list of TimedTextSubformat objects that provide formatting for substrings within the TimedTextLine . */
  /* CompleteClass */
  override var subformats: IVector[typings.winrtUwp.Windows.Media.Core.TimedTextSubformat] = js.native
  /** Gets or sets the text content of the TimedTextLine . */
  /* CompleteClass */
  override var text: String = js.native
}

