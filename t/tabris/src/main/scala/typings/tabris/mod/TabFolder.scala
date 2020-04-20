package typings.tabris.mod

import typings.tabris.OmitTabFolderTabset
import typings.tabris.tabrisStrings.auto
import typings.tabris.tabrisStrings.bottom
import typings.tabris.tabrisStrings.fixed
import typings.tabris.tabrisStrings.hidden
import typings.tabris.tabrisStrings.paging
import typings.tabris.tabrisStrings.scrollable
import typings.tabris.tabrisStrings.selectedTabIndicatorTintColor
import typings.tabris.tabrisStrings.selectedTabTintColor
import typings.tabris.tabrisStrings.selection
import typings.tabris.tabrisStrings.selectionIndex
import typings.tabris.tabrisStrings.tabBarBackground
import typings.tabris.tabrisStrings.tabBarElevation
import typings.tabris.tabrisStrings.tabTintColor
import typings.tabris.tabrisStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "TabFolder")
@js.native
class TabFolder[TabType /* <: Tab */] () extends Composite[TabType] {
  def this(properties: Properties[TabFolder[Tab], OmitTabFolderTabset[TabType]]) = this()
  /**
    * Fired when the [*paging*](#paging) property has changed.
    */
  var onPagingChanged: ChangeListeners[this.type, paging] = js.native
  /**
    * Fired when `paging` is enabled and a tab is scrolled. The `event` parameter contains position
    * information relative to the currently selected `Tab`. Eg.: scrolling a 500px wide tab 10% to the left
    * sets `offset` to `50`. Scrolling 10% to the right sets `offset` to `-50`.
    */
  var onScroll: Listeners[TabFolderScrollEvent[this.type]] = js.native
  /**
    * Fired when the user taps on a tab. The event also fires when the same tab is tapped multiple times.
    */
  var onSelect: Listeners[TabFolderSelectEvent[this.type]] = js.native
  /**
    * Fired when the [*selectedTabIndicatorTintColor*](#selectedTabIndicatorTintColor) property has
    * changed.
    */
  var onSelectedTabIndicatorTintColorChanged: ChangeListeners[this.type, selectedTabIndicatorTintColor] = js.native
  /**
    * Fired when the [*selectedTabTintColor*](#selectedTabTintColor) property has changed.
    */
  var onSelectedTabTintColorChanged: ChangeListeners[this.type, selectedTabTintColor] = js.native
  /**
    * Fired when the [*selection*](#selection) property has changed.
    */
  var onSelectionChanged: ChangeListeners[this.type, selection] = js.native
  /**
    * Fired when the [*selectionIndex*](#selectionIndex) property has changed.
    */
  var onSelectionIndexChanged: ChangeListeners[this.type, selectionIndex] = js.native
  /**
    * Fired when the [*tabBarBackground*](#tabBarBackground) property has changed.
    */
  var onTabBarBackgroundChanged: ChangeListeners[this.type, tabBarBackground] = js.native
  /**
    * Fired when the [*tabBarElevation*](#tabBarElevation) property has changed.
    */
  var onTabBarElevationChanged: ChangeListeners[this.type, tabBarElevation] = js.native
  /**
    * Fired when the [*tabTintColor*](#tabTintColor) property has changed.
    */
  var onTabTintColorChanged: ChangeListeners[this.type, tabTintColor] = js.native
  /**
    * Enables swiping through tabs.
    */
  var paging: Boolean = js.native
  /**
    * The color used for the underline strip of the selected tab. Only applies on Android when the
    * `tabBarLocation` is `top`.
    */
  var selectedTabIndicatorTintColor: ColorValue = js.native
  /**
    * The color used for the text and icon of a selected tab.
    */
  var selectedTabTintColor: ColorValue = js.native
  /**
    * The currently selected tab.
    */
  var selection: TabType = js.native
  /**
    * The index of the currently selected tab.
    */
  var selectionIndex: Double = js.native
  /**
    * The color used for the background of the bar containing the tabs.
    */
  var tabBarBackground: ColorValue = js.native
  /**
    * The elevation of the tab bar. Depending on the `tabBarLocation` different defaults are applied.
    */
  var tabBarElevation: Double = js.native
  /**
    * The placement of the tab titles. When set to `"hidden"`, the tab bar will not be visible. When set to
    * `"auto"`, the position is platform dependent.
    * @constant
    */
  var tabBarLocation: auto | bottom | hidden | top = js.native
  /**
    * Controls how the tabs make use of the available horizontal space. Setting the `tabMode` to `"fixed"`
    * makes the tabs span the entire available space. In case of a very wide `TabFolder` the `"fixed"` mode
    * centers the tabs. The mode `"scrollable"` left aligns the tabs and allows to scroll the tabs if there
    * are more tabs than would fit in the available space. Available on Android only.
    * @constant
    */
  var tabMode: fixed | scrollable = js.native
  /**
    * The color used for the text and icon of a tab.
    * When the `tabBarLocation` is `top` on iOS, this property affects the entire appearance of the bar. No
    * other color properties have an effect in that configuration.
    */
  var tabTintColor: ColorValue = js.native
}

