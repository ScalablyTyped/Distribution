package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TextView
trait _TextViewProperties extends _WidgetProperties {
  /**
    * The horizontal alignment of the text.
    */
  var alignment: tabrisLib.tabrisLibStrings.center | tabrisLib.tabrisLibStrings.left | tabrisLib.tabrisLibStrings.right
  /**
    * The amount of space between each line of text. The `lineSpacing` property is a factor with a default
    * value of `1.0`.
    */
  var lineSpacing: scala.Double
  /**
    * Allows for a subset of HTML tags in the text. Supported tags are: `a`, `del`, `ins`, `b`, `i`,
    * `strong`, `em`, `big`, `small`, `br`. All tags must be closed (e.g. use `<br/>` instead of `<br>`).
    * Nesting tags is currently not supported.
    * @static
    */
  var markupEnabled: scala.Boolean
  /**
    * Limit the number of lines to be displayed to the given maximum. `null` disables this limit.
    */
  var maxLines: scala.Double | scala.Null
  /**
    * Whether the text can be selected or not. Currently only support on Android.
    */
  var selectable: scala.Boolean
  /**
    * The text to display.
    */
  var text: java.lang.String
  /**
    * The color of the text.
    */
  var textColor: tabrisLib.Color
}

object _TextViewProperties {
  @scala.inline
  def apply(
    alignment: tabrisLib.tabrisLibStrings.center | tabrisLib.tabrisLibStrings.left | tabrisLib.tabrisLibStrings.right,
    background: tabrisLib.Color,
    backgroundImage: Image,
    baseline: Widget | Selector,
    bottom: tabrisLib.margin,
    centerX: tabrisLib.offset,
    centerY: tabrisLib.offset,
    `class`: java.lang.String,
    classList: js.Array[java.lang.String],
    cornerRadius: scala.Double,
    elevation: scala.Double,
    enabled: scala.Boolean,
    height: tabrisLib.dimension,
    highlightOnTouch: scala.Boolean,
    id: java.lang.String,
    layoutData: LayoutData,
    left: tabrisLib.margin,
    lineSpacing: scala.Double,
    markupEnabled: scala.Boolean,
    opacity: scala.Double,
    right: tabrisLib.margin,
    selectable: scala.Boolean,
    text: java.lang.String,
    textColor: tabrisLib.Color,
    top: tabrisLib.margin,
    transform: Transformation,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null,
    maxLines: scala.Int | scala.Double = null
  ): _TextViewProperties = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, centerX = centerX, centerY = centerY, classList = classList, cornerRadius = cornerRadius, elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, lineSpacing = lineSpacing, markupEnabled = markupEnabled, opacity = opacity, right = right, selectable = selectable, text = text, textColor = textColor, top = top, transform = transform, visible = visible, width = width, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    if (maxLines != null) __obj.updateDynamic("maxLines")(maxLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TextViewProperties]
  }
}

