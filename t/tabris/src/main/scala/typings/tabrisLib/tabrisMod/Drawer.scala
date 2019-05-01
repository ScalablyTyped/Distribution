package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A drawer that can be swiped in from the left edge of the screen. There's only a single instance that
  * can be accessed via `tabris.ui.drawer`. The drawer is locked by default. To use it in an application,
  * set the property `locked` to `false`. The drawer can contain any kind of widgets.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._DrawerProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, padding, right, top, transform, visible, width, win_theme. Inlined win_displayMode, win_targetView */ @JSImport("tabris", "Drawer")
@js.native
class Drawer protected () extends Composite {
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_Drawer: DrawerProperties = js.native
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
  var win_displayMode: tabrisLib.tabrisLibStrings.compactInline | tabrisLib.tabrisLibStrings.compactOverlay | tabrisLib.tabrisLibStrings.`inline` | tabrisLib.tabrisLibStrings.overlay = js.native
  /**
    * This property may be set to an instance of NavigationView to make its drawer-action open/close the
    * drawer. It also integrates the drawer into the NavigationView layout. When not set to NavigationView
    * instance the property defaults to `tabris.ui`. Other widgets are not supported. Available only on
    * Windows.
    */
  var win_targetView: Widget = js.native
  /**
    * Closes the drawer.
    */
  def close(): this.type = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: DrawerEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: DrawerEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: DrawerEvents): this.type = js.native
  /**
    * Opens the drawer. It may be useful to call this method on first startup, so that users notice the
    * drawer and its contents.
    */
  def open(): this.type = js.native
}

