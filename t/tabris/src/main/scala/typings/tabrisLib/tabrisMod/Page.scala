package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A container representing a single page of a NavigationView widget.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._PageProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, padding, right, top, transform, visible, width, win_theme. Inlined autoDispose, image, title */ @JSImport("tabris", "Page")
@js.native
class Page () extends Composite {
  def this(properties: tabrisLib.Properties[Page, tabrisLib.TypeScriptPropertiesKey]) = this()
  /**
    * Defines whether this page will be automatically disposed when popped from the NavigationView, e.g.
    * using native back navigation.
    */
  var autoDispose: scala.Boolean = js.native
  /**
    * An image to be displayed in the navigation bar. Not supported on Windows.
    */
  var image: tabrisLib.Image | scala.Null = js.native
  /**
    * The page title to be displayed in the navigation bar.
    */
  var title: java.lang.String = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_Page: tabrisLib.PageProperties = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: PageEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: PageEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: PageEvents): this.type = js.native
}

