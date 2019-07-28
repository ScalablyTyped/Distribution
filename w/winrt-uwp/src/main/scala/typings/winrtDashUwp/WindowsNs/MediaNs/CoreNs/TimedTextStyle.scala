package typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs

import typings.winrtDashUwp.WindowsNs.UINs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the style of the rendered text in a TimedTextCue . You can set the style of a substring within a TimedTextLine by using the Subformats property. */
@JSGlobal("Windows.Media.Core.TimedTextStyle")
@js.native
/** Initializes a new instance of the TimedTextStyle class. */
class TimedTextStyle () extends js.Object {
  /** Gets or sets the background color of timed text. */
  var background: Color = js.native
  /** Gets or sets a value indicating the direction that timed text is flowed. */
  var flowDirection: TimedTextFlowDirection = js.native
  /** Gets or sets the font family of timed text. */
  var fontFamily: String = js.native
  /** Gets or sets the font size of timed text. */
  var fontSize: TimedTextDouble = js.native
  /** Gets or sets the weight of timed text. */
  var fontWeight: TimedTextWeight = js.native
  /** Gets or sets the color of the timed text glyphs. */
  var foreground: Color = js.native
  /** Gets or sets a value indicating if the background color stays visible when no text is being displayed. */
  var isBackgroundAlwaysShown: Boolean = js.native
  /** Gets or sets the alignment of timed text lines. */
  var lineAlignment: TimedTextLineAlignment = js.native
  /** Gets or sets the name of the timed text style. */
  var name: String = js.native
  /** Gets or sets the outline color of timed text. */
  var outlineColor: Color = js.native
  /** Gets or sets the radius of the blur applied to outline of the timed text. */
  var outlineRadius: TimedTextDouble = js.native
  /** Gets or sets the thickness of the outline of the timed text. */
  var outlineThickness: TimedTextDouble = js.native
}

