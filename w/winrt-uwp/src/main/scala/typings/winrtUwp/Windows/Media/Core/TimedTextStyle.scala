package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the style of the rendered text in a TimedTextCue . You can set the style of a substring within a TimedTextLine by using the Subformats property. */
@js.native
trait TimedTextStyle extends js.Object {
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
  @scala.inline
  implicit class TimedTextStyleOps[Self <: TimedTextStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackground(value: Color): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlowDirection(value: TimedTextFlowDirection): Self = this.set("flowDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: TimedTextDouble): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontWeight(value: TimedTextWeight): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setForeground(value: Color): Self = this.set("foreground", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBackgroundAlwaysShown(value: Boolean): Self = this.set("isBackgroundAlwaysShown", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineAlignment(value: TimedTextLineAlignment): Self = this.set("lineAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlineColor(value: Color): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlineRadius(value: TimedTextDouble): Self = this.set("outlineRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlineThickness(value: TimedTextDouble): Self = this.set("outlineThickness", value.asInstanceOf[js.Any])
  }
  
}

