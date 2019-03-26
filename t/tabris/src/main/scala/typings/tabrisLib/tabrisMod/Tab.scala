package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A container representing a single tab of a TabFolder widget.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._TabProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, padding, right, top, transform, visible, width, win_theme. Inlined badge, image, selectedImage, title */ @JSImport("tabris", "Tab")
@js.native
class Tab () extends Composite {
  def this(properties: tabrisLib.Properties[Tab, tabrisLib.TypeScriptPropertiesKey]) = this()
  /**
    * A badge to attach to the tab.
    */
  var badge: java.lang.String = js.native
  /**
    * An image to be displayed on the tab.  Will not be shown on iOS if the `TabFolder`'s `tabBarLocation`
    * is set to `top`
    */
  var image: tabrisLib.Image | scala.Null = js.native
  /**
    * An image to be displayed on the currently active tab.
    */
  var selectedImage: tabrisLib.Image | scala.Null = js.native
  /**
    * The title to be displayed on the tab.
    */
  var title: java.lang.String = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_Tab: tabrisLib.TabProperties = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: TabEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: TabEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: TabEvents): this.type = js.native
}

