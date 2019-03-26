package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Drawer
trait _DrawerProperties extends _CompositeProperties {
  /**
    * Controls how the drawer integrates into its targetView. 
    * - `overlay` completely hides the drawer when closed and overlays other content when opened.
    * - `compactOverlay` makes the drawer partially visible when closed so a 48px wide bar remains
    * side-by-side with the targetViews other content. If a drawer-action controls the drawer it is placed
    * inside this bar. When the drawer is opened its remaining width overlays the targetViews other
    * content.
    * - `inline` completely hides the drawer when closed, but shows it side-by-side with the targetView
    * when opened. The drawer does not close automatically in this mode.
    * - `compactInline` makes the drawer partially visible when closed (like `compactOverlay`), but shows
    * it side-by-side with the targetView when opened (like `inline`).
    * Available only on windows.
    */
  var win_displayMode: tabrisLib.tabrisLibStrings.compactInline | tabrisLib.tabrisLibStrings.compactOverlay | tabrisLib.tabrisLibStrings.`inline` | tabrisLib.tabrisLibStrings.overlay
  /**
    * This property may be set to an instance of NavigationView to make its drawer-action open/close the
    * drawer. It also integrates the drawer into the NavigationView layout. When not set to NavigationView
    * instance the property defaults to `tabris.ui`. Other widgets are not supported. Available only on
    * Windows.
    */
  var win_targetView: Widget
}

object _DrawerProperties {
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
    opacity: scala.Double,
    padding: BoxDimensions | scala.Double,
    right: tabrisLib.margin,
    top: tabrisLib.margin,
    transform: Transformation,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_displayMode: tabrisLib.tabrisLibStrings.compactInline | tabrisLib.tabrisLibStrings.compactOverlay | tabrisLib.tabrisLibStrings.`inline` | tabrisLib.tabrisLibStrings.overlay,
    win_targetView: Widget,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null
  ): _DrawerProperties = {
    val __obj = js.Dynamic.literal(background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, centerX = centerX, centerY = centerY, classList = classList, cornerRadius = cornerRadius, elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, opacity = opacity, padding = padding.asInstanceOf[js.Any], right = right, top = top, transform = transform, visible = visible, width = width, win_displayMode = win_displayMode.asInstanceOf[js.Any], win_targetView = win_targetView, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[_DrawerProperties]
  }
}

