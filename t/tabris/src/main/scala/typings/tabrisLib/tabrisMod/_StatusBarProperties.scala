package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// StatusBar
trait _StatusBarProperties extends _WidgetProperties {
  /**
    * Controls how the status bar is positioned relative to the `ui.contentView`. The value `default`
    * places the content below the status bar. The `hide` option lets the status bar disappear, making more
    * room for the content. The `float` option lets the content flow underneath the status bar. *On Windows
    * `float` is currently not supported and treated as `hide`.*
    */
  var displayMode: tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.float | tabrisLib.tabrisLibStrings.hide
  /**
    * Defines the shade used on the status bar. A `dark` theme sets the foreground icons to be of a light
    * color, whereas `light` sets the icons to a dark color. The theme should be set in conjunction with
    * the `background` property for contrast. The value `default` selects the default theme that depends on
    * the device and on the app. Available on iOS and Android 6+.
    */
  var theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light
}

object _StatusBarProperties {
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
  ): _StatusBarProperties = {
    val __obj = js.Dynamic.literal(background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, centerX = centerX, centerY = centerY, classList = classList, cornerRadius = cornerRadius, displayMode = displayMode.asInstanceOf[js.Any], elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, opacity = opacity, right = right, theme = theme.asInstanceOf[js.Any], top = top, transform = transform, visible = visible, width = width, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[_StatusBarProperties]
  }
}

