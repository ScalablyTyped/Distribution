package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Button
trait _ButtonProperties extends _WidgetProperties {
  /**
    * The horizontal alignment of the button text.
    */
  var alignment: tabrisLib.tabrisLibStrings.center | tabrisLib.tabrisLibStrings.left | tabrisLib.tabrisLibStrings.right
  /**
    * An image to be displayed on the button.
    */
  var image: tabrisLib.Image | scala.Null
  /**
    * The button's label text.
    */
  var text: java.lang.String
  /**
    * The color of the text.
    */
  var textColor: tabrisLib.Color
}

object _ButtonProperties {
  @scala.inline
  def apply(
    alignment: tabrisLib.tabrisLibStrings.center | tabrisLib.tabrisLibStrings.left | tabrisLib.tabrisLibStrings.right,
    background: tabrisLib.Color,
    backgroundImage: tabrisLib.Image,
    baseline: Widget | tabrisLib.Selector,
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
    opacity: scala.Double,
    right: tabrisLib.margin,
    text: java.lang.String,
    textColor: tabrisLib.Color,
    top: tabrisLib.margin,
    transform: Transformation,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null,
    image: tabrisLib.Image = null
  ): _ButtonProperties = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, centerX = centerX, centerY = centerY, classList = classList, cornerRadius = cornerRadius, elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, opacity = opacity, right = right, text = text, textColor = textColor, top = top, transform = transform, visible = visible, width = width, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ButtonProperties]
  }
}

