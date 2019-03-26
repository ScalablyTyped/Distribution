package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget that can switch between [tabs](Tab). Only children of type `Tab` are supported. Since the
  * TabFolder does not compute its own size, the width and height must be defined by the respective
  * layout properties (e.g. either `width` or `left` and `right` must be specified).
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._TabFolderProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, padding, right, top, transform, visible, width, win_theme. Inlined paging, selection, tabBarLocation, tabMode, textColor, win_tabBarTheme */ @JSImport("tabris", "TabFolder")
@js.native
class TabFolder () extends Composite {
  def this(properties: tabrisLib.Properties[TabFolder, tabrisLib.TypeScriptPropertiesKey]) = this()
  /**
    * Enables swiping through tabs. Always enabled on Windows.
    */
  var paging: scala.Boolean = js.native
  /**
    * The currently selected tab.
    */
  var selection: Tab = js.native
  /**
    * The placement of the tab titles. When set to `"hidden"`, the tab bar will not be visible. When set to
    * `"auto"`, the position is platform dependent.
    * @static
    */
  var tabBarLocation: tabrisLib.tabrisLibStrings.auto | tabrisLib.tabrisLibStrings.bottom | tabrisLib.tabrisLibStrings.hidden | tabrisLib.tabrisLibStrings.top = js.native
  /**
    * Controls how the tabs make use of the available horizontal space. Setting the `tabMode` to `"fixed"`
    * makes the tabs span the entire available space. In case of a very wide `TabFolder` the `"fixed"` mode
    * centers the tabs. The mode `"scrollable"` left aligns the tabs and allows to scroll the tabs if there
    * are more tabs than would fit in the available space. Available on Android only.
    * @static
    */
  var tabMode: tabrisLib.tabrisLibStrings.fixed | tabrisLib.tabrisLibStrings.scrollable = js.native
  /**
    * The color used for the text of the tab headers.
    */
  var textColor: tabrisLib.Color = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_TabFolder: tabrisLib.TabFolderProperties = js.native
  /**
    * Controls the color scheme used for the tabBar. When set to `"default"` the theme is inherited from
    * the TabFolder. Available only on Windows.
    */
  var win_tabBarTheme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: TabFolderEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: TabFolderEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: TabFolderEvents): this.type = js.native
}

