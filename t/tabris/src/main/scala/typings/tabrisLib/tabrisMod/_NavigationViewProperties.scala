package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NavigationView
trait _NavigationViewProperties extends _CompositeProperties {
  /**
    * The color used for action icons.
    */
  var actionColor: tabrisLib.Color
  /**
    * The color used for action texts. Only applied on Android and Windows. IOS uses the `actionColor` to
    * colorize the action text.
    */
  var actionTextColor: tabrisLib.Color
  /**
    * The height of the bottom toolbar. Is 0 if not visible or unsupported by the platform.
    */
  var bottomToolbarHeight: scala.Double
  /**
    * Whether to display the so-called "Burger menu" to open the drawer.
    */
  var drawerActionVisible: scala.Boolean
  /**
    * Action that replaces back button and arrow. When it is replaced the developer is responsible for
    * prividing a way to go back on the page stack. Setting the action to null restores back button and
    * arrow.
    */
  var navigationAction: Action
  /**
    * Controls what animation to use when animating a page transition.
    */
  var pageAnimation: tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.none
  /**
    * The text color used for page titles.
    */
  var titleTextColor: tabrisLib.Color
  /**
    * The background color of the toolbar.
    */
  var toolbarColor: tabrisLib.Color
  /**
    * Whether the toolbar is visible.
    */
  var toolbarVisible: scala.Boolean
  /**
    * The height of the top toolbar. Is 0 if not visible.
    */
  var topToolbarHeight: scala.Double
  /**
    * The background color used for the drawer action. It is common to the make this the same color as the
    * splash screen. Available only on Windows.
    */
  var win_drawerActionBackground: tabrisLib.Color
  /**
    * Controls the color scheme used for the drawer action. When set to `"default"` the theme is inherited
    * from the NavigationView. Available only on Windows.
    */
  var win_drawerActionTheme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light
  /**
    * Controls the color scheme used for the toolbar's overflow menu. When set to `"default"` the theme is
    * inherited from the toolbar. Available only on Windows.
    */
  var win_toolbarOverflowTheme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light
  /**
    * Controls the color scheme used for the toolbar. When set to `"default"` the theme is inherited from
    * the NavigationView. Available only on Windows.
    */
  var win_toolbarTheme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light
}

object _NavigationViewProperties {
  @scala.inline
  def apply(
    actionColor: tabrisLib.Color,
    actionTextColor: tabrisLib.Color,
    background: tabrisLib.Color,
    backgroundImage: tabrisLib.Image,
    baseline: Widget | tabrisLib.Selector,
    bottom: tabrisLib.margin,
    bottomToolbarHeight: scala.Double,
    centerX: tabrisLib.offset,
    centerY: tabrisLib.offset,
    `class`: java.lang.String,
    classList: js.Array[java.lang.String],
    cornerRadius: scala.Double,
    drawerActionVisible: scala.Boolean,
    elevation: scala.Double,
    enabled: scala.Boolean,
    height: tabrisLib.dimension,
    highlightOnTouch: scala.Boolean,
    id: java.lang.String,
    layoutData: LayoutData,
    left: tabrisLib.margin,
    navigationAction: Action,
    opacity: scala.Double,
    padding: BoxDimensions | scala.Double,
    pageAnimation: tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.none,
    right: tabrisLib.margin,
    titleTextColor: tabrisLib.Color,
    toolbarColor: tabrisLib.Color,
    toolbarVisible: scala.Boolean,
    top: tabrisLib.margin,
    topToolbarHeight: scala.Double,
    transform: Transformation,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_drawerActionBackground: tabrisLib.Color,
    win_drawerActionTheme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    win_toolbarOverflowTheme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    win_toolbarTheme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null
  ): _NavigationViewProperties = {
    val __obj = js.Dynamic.literal(actionColor = actionColor, actionTextColor = actionTextColor, background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, bottomToolbarHeight = bottomToolbarHeight, centerX = centerX, centerY = centerY, classList = classList, cornerRadius = cornerRadius, drawerActionVisible = drawerActionVisible, elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, navigationAction = navigationAction, opacity = opacity, padding = padding.asInstanceOf[js.Any], pageAnimation = pageAnimation.asInstanceOf[js.Any], right = right, titleTextColor = titleTextColor, toolbarColor = toolbarColor, toolbarVisible = toolbarVisible, top = top, topToolbarHeight = topToolbarHeight, transform = transform, visible = visible, width = width, win_drawerActionBackground = win_drawerActionBackground, win_drawerActionTheme = win_drawerActionTheme.asInstanceOf[js.Any], win_theme = win_theme.asInstanceOf[js.Any], win_toolbarOverflowTheme = win_toolbarOverflowTheme.asInstanceOf[js.Any], win_toolbarTheme = win_toolbarTheme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[_NavigationViewProperties]
  }
}

