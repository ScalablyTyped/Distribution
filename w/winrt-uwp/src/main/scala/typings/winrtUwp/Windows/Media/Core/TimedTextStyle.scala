package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the style of the rendered text in a TimedTextCue . You can set the style of a substring within a TimedTextLine by using the Subformats property. */
trait TimedTextStyle extends js.Object {
  /** Gets or sets the background color of timed text. */
  var background: Color
  /** Gets or sets a value indicating the direction that timed text is flowed. */
  var flowDirection: TimedTextFlowDirection
  /** Gets or sets the font family of timed text. */
  var fontFamily: String
  /** Gets or sets the font size of timed text. */
  var fontSize: TimedTextDouble
  /** Gets or sets the weight of timed text. */
  var fontWeight: TimedTextWeight
  /** Gets or sets the color of the timed text glyphs. */
  var foreground: Color
  /** Gets or sets a value indicating if the background color stays visible when no text is being displayed. */
  var isBackgroundAlwaysShown: Boolean
  /** Gets or sets the alignment of timed text lines. */
  var lineAlignment: TimedTextLineAlignment
  /** Gets or sets the name of the timed text style. */
  var name: String
  /** Gets or sets the outline color of timed text. */
  var outlineColor: Color
  /** Gets or sets the radius of the blur applied to outline of the timed text. */
  var outlineRadius: TimedTextDouble
  /** Gets or sets the thickness of the outline of the timed text. */
  var outlineThickness: TimedTextDouble
}

object TimedTextStyle {
  @scala.inline
  def apply(
    background: Color,
    flowDirection: TimedTextFlowDirection,
    fontFamily: String,
    fontSize: TimedTextDouble,
    fontWeight: TimedTextWeight,
    foreground: Color,
    isBackgroundAlwaysShown: Boolean,
    lineAlignment: TimedTextLineAlignment,
    name: String,
    outlineColor: Color,
    outlineRadius: TimedTextDouble,
    outlineThickness: TimedTextDouble
  ): TimedTextStyle = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], flowDirection = flowDirection.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], foreground = foreground.asInstanceOf[js.Any], isBackgroundAlwaysShown = isBackgroundAlwaysShown.asInstanceOf[js.Any], lineAlignment = lineAlignment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outlineColor = outlineColor.asInstanceOf[js.Any], outlineRadius = outlineRadius.asInstanceOf[js.Any], outlineThickness = outlineThickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextStyle]
  }
}

