package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NavigationBar
trait _NavigationBarProperties extends _WidgetProperties {
  /**
    * Controls how the navigation bar is positioned relative to the `ui.contentView`. The value `default`
    * places the content above the navigation bar. The `hide` option lets the navigation bar disappear,
    * making room for the content. The `float` option lets the content flow underneath the navigation bar.
    */
  var displayMode: tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.float | tabrisLib.tabrisLibStrings.hide
  /**
    * Defines the appearance used on the navigation bar. A `dark` theme sets the foreground navigation
    * icons to be of a light color, whereas `light` sets the icons to a dark color. The theme should be set
    * in conjunction with the `background` property for contrast. The value `default` selects the default
    * theme that depends on the device and on the app. Available on Android 8+.
    */
  var theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light
}

object _NavigationBarProperties {
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
    displayMode: tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.float | tabrisLib.tabrisLibStrings.hide,
    elevation: scala.Double,
    enabled: scala.Boolean,
    height: tabrisLib.dimension,
    highlightOnTouch: scala.Boolean,
    id: java.lang.String,
    layoutData: LayoutData,
    left: tabrisLib.margin,
    opacity: scala.Double,
    right: tabrisLib.margin,
    theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    top: tabrisLib.margin,
    transform: Transformation,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null
  ): _NavigationBarProperties = {
    val __obj = js.Dynamic.literal(background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, centerX = centerX, centerY = centerY, classList = classList, cornerRadius = cornerRadius, displayMode = displayMode.asInstanceOf[js.Any], elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, opacity = opacity, right = right, theme = theme.asInstanceOf[js.Any], top = top, transform = transform, visible = visible, width = width, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[_NavigationBarProperties]
  }
}

