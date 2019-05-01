package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Picker
trait _PickerProperties extends _WidgetProperties {
  /**
    * The color of the border of the Picker. On iOS this is a rectangular border around the Picker, on
    * Android it is a single line below the Picker.
    */
  var borderColor: tabrisLib.Color
  /**
    * The color of the background of the Picker - applies only to iOS.
    */
  var fillColor: tabrisLib.Color
  /**
    * The number of items to display.
    */
  var itemCount: scala.Double
  /**
    * The index of the currently selected item.
    */
  var selectionIndex: scala.Double
  /**
    * The color of the text.
    */
  var textColor: tabrisLib.Color
  /**
    * A function that returns the string to display for a given index.
    */
  def itemText(index: scala.Double): java.lang.String
}

object _PickerProperties {
  @scala.inline
  def apply(
    background: tabrisLib.Color,
    backgroundImage: Image,
    baseline: Widget | Selector,
    borderColor: tabrisLib.Color,
    bottom: tabrisLib.margin,
    centerX: tabrisLib.offset,
    centerY: tabrisLib.offset,
    `class`: java.lang.String,
    classList: js.Array[java.lang.String],
    cornerRadius: scala.Double,
    elevation: scala.Double,
    enabled: scala.Boolean,
    fillColor: tabrisLib.Color,
    height: tabrisLib.dimension,
    highlightOnTouch: scala.Boolean,
    id: java.lang.String,
    itemCount: scala.Double,
    itemText: scala.Double => java.lang.String,
    layoutData: LayoutData,
    left: tabrisLib.margin,
    opacity: scala.Double,
    right: tabrisLib.margin,
    selectionIndex: scala.Double,
    textColor: tabrisLib.Color,
    top: tabrisLib.margin,
    transform: Transformation,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null
  ): _PickerProperties = {
    val __obj = js.Dynamic.literal(background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], borderColor = borderColor, bottom = bottom, centerX = centerX, centerY = centerY, classList = classList, cornerRadius = cornerRadius, elevation = elevation, enabled = enabled, fillColor = fillColor, height = height, highlightOnTouch = highlightOnTouch, id = id, itemCount = itemCount, itemText = js.Any.fromFunction1(itemText), layoutData = layoutData, left = left, opacity = opacity, right = right, selectionIndex = selectionIndex, textColor = textColor, top = top, transform = transform, visible = visible, width = width, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[_PickerProperties]
  }
}

