package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// SearchAction
trait _SearchActionProperties extends _ActionProperties {
  /**
    * A hint text that is displayed when the search input is empty.
    */
  var message: java.lang.String
  /**
    * The list of proposals to display.
    */
  var proposals: js.Array[java.lang.String]
  /**
    * The text in the search input field.
    */
  var text: java.lang.String
}

object _SearchActionProperties {
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
    elevation: scala.Double,
    enabled: scala.Boolean,
    height: tabrisLib.dimension,
    highlightOnTouch: scala.Boolean,
    id: java.lang.String,
    layoutData: LayoutData,
    left: tabrisLib.margin,
    message: java.lang.String,
    opacity: scala.Double,
    placementPriority: tabrisLib.tabrisLibStrings.high | tabrisLib.tabrisLibStrings.low | tabrisLib.tabrisLibStrings.normal,
    proposals: js.Array[java.lang.String],
    right: tabrisLib.margin,
    text: java.lang.String,
    title: java.lang.String,
    top: tabrisLib.margin,
    transform: Transformation,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_symbol: java.lang.String,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null,
    image: tabrisLib.Image = null
  ): _SearchActionProperties = {
    val __obj = js.Dynamic.literal(background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, centerX = centerX, centerY = centerY, classList = classList, cornerRadius = cornerRadius, elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, message = message, opacity = opacity, placementPriority = placementPriority.asInstanceOf[js.Any], proposals = proposals, right = right, text = text, title = title, top = top, transform = transform, visible = visible, width = width, win_symbol = win_symbol, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SearchActionProperties]
  }
}

