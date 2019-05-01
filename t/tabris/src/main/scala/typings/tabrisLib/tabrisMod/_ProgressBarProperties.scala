package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ProgressBar
trait _ProgressBarProperties extends _WidgetProperties {
  /**
    * The value that represents a progress of 100%.
    */
  var maximum: scala.Double
  /**
    * The value that represents a progress of 0%.
    */
  var minimum: scala.Double
  /**
    * The actual progress to be displayed.
    */
  var selection: scala.Double
  /**
    * This property affects the color of the progress indicator. Not supported on iOS.
    */
  var state: tabrisLib.tabrisLibStrings.error | tabrisLib.tabrisLibStrings.normal | tabrisLib.tabrisLibStrings.paused
  /**
    * The color used to display the current progress.
    */
  var tintColor: tabrisLib.Color
}

object _ProgressBarProperties {
  @scala.inline
  def apply(
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
    maximum: scala.Double,
    minimum: scala.Double,
    opacity: scala.Double,
    right: tabrisLib.margin,
    selection: scala.Double,
    state: tabrisLib.tabrisLibStrings.error | tabrisLib.tabrisLibStrings.normal | tabrisLib.tabrisLibStrings.paused,
    tintColor: tabrisLib.Color,
    top: tabrisLib.margin,
    transform: Transformation,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null
  ): _ProgressBarProperties = {
    val __obj = js.Dynamic.literal(background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, centerX = centerX, centerY = centerY, classList = classList, cornerRadius = cornerRadius, elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, maximum = maximum, minimum = minimum, opacity = opacity, right = right, selection = selection, state = state.asInstanceOf[js.Any], tintColor = tintColor, top = top, transform = transform, visible = visible, width = width, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[_ProgressBarProperties]
  }
}

