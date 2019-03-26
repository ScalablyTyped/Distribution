package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TabFolder
trait _TabFolderProperties extends _CompositeProperties {
  /**
    * Enables swiping through tabs. Always enabled on Windows.
    */
  var paging: scala.Boolean
  /**
    * The currently selected tab.
    */
  var selection: Tab
  /**
    * The placement of the tab titles. When set to `"hidden"`, the tab bar will not be visible. When set to
    * `"auto"`, the position is platform dependent.
    * @static
    */
  var tabBarLocation: tabrisLib.tabrisLibStrings.auto | tabrisLib.tabrisLibStrings.bottom | tabrisLib.tabrisLibStrings.hidden | tabrisLib.tabrisLibStrings.top
  /**
    * Controls how the tabs make use of the available horizontal space. Setting the `tabMode` to `"fixed"`
    * makes the tabs span the entire available space. In case of a very wide `TabFolder` the `"fixed"` mode
    * centers the tabs. The mode `"scrollable"` left aligns the tabs and allows to scroll the tabs if there
    * are more tabs than would fit in the available space. Available on Android only.
    * @static
    */
  var tabMode: tabrisLib.tabrisLibStrings.fixed | tabrisLib.tabrisLibStrings.scrollable
  /**
    * The color used for the text of the tab headers.
    */
  var textColor: tabrisLib.Color
  /**
    * Controls the color scheme used for the tabBar. When set to `"default"` the theme is inherited from
    * the TabFolder. Available only on Windows.
    */
  var win_tabBarTheme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light
}

object _TabFolderProperties {
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
    paging: scala.Boolean,
    right: tabrisLib.margin,
    selection: Tab,
    tabBarLocation: tabrisLib.tabrisLibStrings.auto | tabrisLib.tabrisLibStrings.bottom | tabrisLib.tabrisLibStrings.hidden | tabrisLib.tabrisLibStrings.top,
    tabMode: tabrisLib.tabrisLibStrings.fixed | tabrisLib.tabrisLibStrings.scrollable,
    textColor: tabrisLib.Color,
    top: tabrisLib.margin,
    transform: Transformation,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_tabBarTheme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null
  ): _TabFolderProperties = {
    val __obj = js.Dynamic.literal(background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom, centerX = centerX, centerY = centerY, classList = classList, cornerRadius = cornerRadius, elevation = elevation, enabled = enabled, height = height, highlightOnTouch = highlightOnTouch, id = id, layoutData = layoutData, left = left, opacity = opacity, padding = padding.asInstanceOf[js.Any], paging = paging, right = right, selection = selection, tabBarLocation = tabBarLocation.asInstanceOf[js.Any], tabMode = tabMode.asInstanceOf[js.Any], textColor = textColor, top = top, transform = transform, visible = visible, width = width, win_tabBarTheme = win_tabBarTheme.asInstanceOf[js.Any], win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[_TabFolderProperties]
  }
}

