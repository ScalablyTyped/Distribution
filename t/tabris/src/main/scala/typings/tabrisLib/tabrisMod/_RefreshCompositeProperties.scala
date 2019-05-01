package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// RefreshComposite
trait _RefreshCompositeProperties extends _CompositeProperties {
  /**
    * Whether the pull-to-refresh gesture can be performed by the user. When disabled, the
    * `RefreshComposite` behaves like a regular `Composite`.
    */
  var refreshEnabled: scala.Boolean
  /**
    * Whether to visualize a long running operation. After the user has triggered a manual refresh, this
    * property is `true` and should be set to `false` when the operation ended.
    */
  var refreshIndicator: scala.Boolean
  /**
    * A message to show to the user during the refresh operation.
    */
  var refreshMessage: java.lang.String
}

object _RefreshCompositeProperties {
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
    opacity: scala.Double,
    padding: BoxDimensions | scala.Double,
    refreshEnabled: scala.Boolean,
    refreshIndicator: scala.Boolean,
    refreshMessage: java.lang.String,
    right: tabrisLib.margin,
    top: tabrisLib.margin,
    transform: Transformation,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null
  ): _RefreshCompositeProperties = {
    val __obj = js.Dynamic.literal(background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, centerX = centerX, centerY = centerY, classList = classList, cornerRadius = cornerRadius, elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, opacity = opacity, padding = padding.asInstanceOf[js.Any], refreshEnabled = refreshEnabled, refreshIndicator = refreshIndicator, refreshMessage = refreshMessage, right = right, top = top, transform = transform, visible = visible, width = width, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[_RefreshCompositeProperties]
  }
}

