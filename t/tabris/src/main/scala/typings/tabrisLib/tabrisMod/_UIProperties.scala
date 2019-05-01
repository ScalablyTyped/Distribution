package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// UI
trait _UIProperties extends _CompositeProperties {
  /**
    * The content view is the container for the widgets that constitute the app's main UI. It covers the
    * entire app area. Widgets can be appended directly to the content view.
    * @static
    */
  var contentView: Composite
  /**
    * A drawer that can be swiped in from the left edge of the screen. The drawer is locked by default. To
    * use it in an application, set the property `locked` to `false`. The drawer can contain any kind of
    * widgets.
    * @static
    */
  var drawer: Drawer
  /**
    * Represents the system navigation bar is the onscreen area where *Back*, *Home* and similar buttons
    * are displayed. It is only supported on Android.
    * @static
    */
  var navigationBar: NavigationBar
  /**
    * Represents the system status bar. This is the area where notifications, status icons and device time
    * are displayed.
    * @static
    */
  var statusBar: StatusBar
}

object _UIProperties {
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
    contentView: Composite,
    cornerRadius: scala.Double,
    drawer: Drawer,
    elevation: scala.Double,
    enabled: scala.Boolean,
    height: tabrisLib.dimension,
    highlightOnTouch: scala.Boolean,
    id: java.lang.String,
    layoutData: LayoutData,
    left: tabrisLib.margin,
    navigationBar: NavigationBar,
    opacity: scala.Double,
    padding: BoxDimensions | scala.Double,
    right: tabrisLib.margin,
    statusBar: StatusBar,
    top: tabrisLib.margin,
    transform: Transformation,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null
  ): _UIProperties = {
    val __obj = js.Dynamic.literal(background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, centerX = centerX, centerY = centerY, classList = classList, contentView = contentView, cornerRadius = cornerRadius, drawer = drawer, elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, navigationBar = navigationBar, opacity = opacity, padding = padding.asInstanceOf[js.Any], right = right, statusBar = statusBar, top = top, transform = transform, visible = visible, width = width, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[_UIProperties]
  }
}

