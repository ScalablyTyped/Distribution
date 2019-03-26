package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ScrollView
trait _ScrollViewProperties extends _CompositeProperties {
  /**
    * Specifies the scrolling direction of the scroll composite.
    * @static
    */
  var direction: tabrisLib.tabrisLibStrings.horizontal | tabrisLib.tabrisLibStrings.vertical
}

object _ScrollViewProperties {
  @scala.inline
  def apply(
    background: tabrisLib.Color,
    backgroundImage: tabrisLib.Image,
    baseline: Widget | tabrisLib.Selector,
    bottom: tabrisLib.margin,
    centerX: tabrisLib.offset,
    centerY: tabrisLib.offset,
    `class`: java.lang.String,
    classList: js.Array[java.lang.String],
    cornerRadius: scala.Double,
    direction: tabrisLib.tabrisLibStrings.horizontal | tabrisLib.tabrisLibStrings.vertical,
    elevation: scala.Double,
    enabled: scala.Boolean,
    height: tabrisLib.dimension,
    highlightOnTouch: scala.Boolean,
    id: java.lang.String,
    layoutData: LayoutData,
    left: tabrisLib.margin,
    opacity: scala.Double,
    padding: BoxDimensions | scala.Double,
    right: tabrisLib.margin,
    top: tabrisLib.margin,
    transform: Transformation,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null
  ): _ScrollViewProperties = {
    val __obj = js.Dynamic.literal(background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, centerX = centerX, centerY = centerY, classList = classList, cornerRadius = cornerRadius, direction = direction.asInstanceOf[js.Any], elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, opacity = opacity, padding = padding.asInstanceOf[js.Any], right = right, top = top, transform = transform, visible = visible, width = width, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[_ScrollViewProperties]
  }
}

