package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// RadioButton
trait _RadioButtonProperties extends _WidgetProperties {
  /**
    * The checked state of the radio button.
    */
  var checked: scala.Boolean
  /**
    * The color of the selectable area in checked state. Will fall back to `tintColor` if not set.
    */
  var checkedTintColor: tabrisLib.Color
  /**
    * The label text of the radio button.
    */
  var text: java.lang.String
  /**
    * The color of the text.
    */
  var textColor: tabrisLib.Color
  /**
    * The color of the selectable area.
    */
  var tintColor: tabrisLib.Color
}

object _RadioButtonProperties {
  @scala.inline
  def apply(
    background: tabrisLib.Color,
    backgroundImage: Image,
    baseline: Widget | Selector,
    bottom: tabrisLib.margin,
    centerX: tabrisLib.offset,
    centerY: tabrisLib.offset,
    checked: scala.Boolean,
    checkedTintColor: tabrisLib.Color,
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
    tintColor: tabrisLib.Color,
    top: tabrisLib.margin,
    transform: Transformation,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null
  ): _RadioButtonProperties = {
    val __obj = js.Dynamic.literal(background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, centerX = centerX, centerY = centerY, checked = checked, checkedTintColor = checkedTintColor, classList = classList, cornerRadius = cornerRadius, elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, opacity = opacity, right = right, text = text, textColor = textColor, tintColor = tintColor, top = top, transform = transform, visible = visible, width = width, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[_RadioButtonProperties]
  }
}

