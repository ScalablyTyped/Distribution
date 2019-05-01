package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Switch
trait _SwitchProperties extends _WidgetProperties {
  /**
    * The checked state of the switch.
    */
  var checked: scala.Boolean
  /**
    * The color of the movable thumb, when switched *off*.
    */
  var thumbOffColor: tabrisLib.Color
  /**
    * The color of the movable thumb, when switched *on*.
    */
  var thumbOnColor: tabrisLib.Color
  /**
    * The color of the track that holds the thumb, when switched *off*.
    */
  var trackOffColor: tabrisLib.Color
  /**
    * The color of the track that holds the thumb, when switched *on*.
    */
  var trackOnColor: tabrisLib.Color
}

object _SwitchProperties {
  @scala.inline
  def apply(
    background: tabrisLib.Color,
    backgroundImage: Image,
    baseline: Widget | Selector,
    bottom: tabrisLib.margin,
    centerX: tabrisLib.offset,
    centerY: tabrisLib.offset,
    checked: scala.Boolean,
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
    thumbOffColor: tabrisLib.Color,
    thumbOnColor: tabrisLib.Color,
    top: tabrisLib.margin,
    trackOffColor: tabrisLib.Color,
    trackOnColor: tabrisLib.Color,
    transform: Transformation,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null
  ): _SwitchProperties = {
    val __obj = js.Dynamic.literal(background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, centerX = centerX, centerY = centerY, checked = checked, classList = classList, cornerRadius = cornerRadius, elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, opacity = opacity, right = right, thumbOffColor = thumbOffColor, thumbOnColor = thumbOnColor, top = top, trackOffColor = trackOffColor, trackOnColor = trackOnColor, transform = transform, visible = visible, width = width, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[_SwitchProperties]
  }
}

