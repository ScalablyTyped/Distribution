package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget that displays a stack of [pages](Page) with a toolbar that allows to navigate back. The
  * toolbar also displays the current page's title and the highest priority [actions](Action) that are
  * added to the NavigationView. Only children of type `Page`, `Action` and `SearchAction` are supported.
  * Since the NavigationView does not compute its own size, the width and height must be defined by the
  * respective layout properties (e.g. either `width` or `left` and `right` must be specified).
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._NavigationViewProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, padding, right, top, transform, visible, width, win_theme. Inlined actionColor, actionTextColor, bottomToolbarHeight, drawerActionVisible, navigationAction, pageAnimation, titleTextColor, toolbarColor, toolbarVisible, topToolbarHeight, win_drawerActionBackground, win_drawerActionTheme, win_toolbarOverflowTheme, win_toolbarTheme */ @JSImport("tabris", "NavigationView")
@js.native
class NavigationView () extends Composite {
  def this(properties: tabrisLib.Properties[NavigationView, tabrisLib.TypeScriptPropertiesKey]) = this()
  /**
    * The color used for action icons.
    */
  var actionColor: tabrisLib.Color = js.native
  /**
    * The color used for action texts. Only applied on Android and Windows. IOS uses the `actionColor` to
    * colorize the action text.
    */
  var actionTextColor: tabrisLib.Color = js.native
  /**
    * The height of the bottom toolbar. Is 0 if not visible or unsupported by the platform.
    */
  var bottomToolbarHeight: scala.Double = js.native
  /**
    * Whether to display the so-called "Burger menu" to open the drawer.
    */
  var drawerActionVisible: scala.Boolean = js.native
  /**
    * Action that replaces back button and arrow. When it is replaced the developer is responsible for
    * prividing a way to go back on the page stack. Setting the action to null restores back button and
    * arrow.
    */
  var navigationAction: Action = js.native
  /**
    * Controls what animation to use when animating a page transition.
    */
  var pageAnimation: tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.none = js.native
  /**
    * The text color used for page titles.
    */
  var titleTextColor: tabrisLib.Color = js.native
  /**
    * The background color of the toolbar.
    */
  var toolbarColor: tabrisLib.Color = js.native
  /**
    * Whether the toolbar is visible.
    */
  var toolbarVisible: scala.Boolean = js.native
  /**
    * The height of the top toolbar. Is 0 if not visible.
    */
  var topToolbarHeight: scala.Double = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_NavigationView: tabrisLib.NavigationViewProperties = js.native
  /**
    * The background color used for the drawer action. It is common to the make this the same color as the
    * splash screen. Available only on Windows.
    */
  var win_drawerActionBackground: tabrisLib.Color = js.native
  /**
    * Controls the color scheme used for the drawer action. When set to `"default"` the theme is inherited
    * from the NavigationView. Available only on Windows.
    */
  var win_drawerActionTheme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light = js.native
  /**
    * Controls the color scheme used for the toolbar's overflow menu. When set to `"default"` the theme is
    * inherited from the toolbar. Available only on Windows.
    */
  var win_toolbarOverflowTheme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light = js.native
  /**
    * Controls the color scheme used for the toolbar. When set to `"default"` the theme is inherited from
    * the NavigationView. Available only on Windows.
    */
  var win_toolbarTheme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: NavigationViewEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: NavigationViewEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: NavigationViewEvents): this.type = js.native
  /**
    * Returns the ordered list of pages on the page stack, with the bottommost page as the first and the
    * topmost page as the last element. Same as children(), but only returns children that are of type
    * `Page`.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def pages(): WidgetCollection[Page] = js.native
  def pages(selector: tabrisLib.Selector): WidgetCollection[Page] = js.native
  /**
    * Returns the ordered list of pages on the page stack, with the bottommost page as the first and the
    * topmost page as the last element. Same as children(), but only accepts subclasses of `Page`.
    * @param constructor A class to filter the results.
    */
  def pages[U /* <: Page */](constructor: tabrisLib.Anon_ArgsAny[U]): WidgetCollection[U] = js.native
}

