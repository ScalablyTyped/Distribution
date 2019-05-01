package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An empty widget that can contain other widgets.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._CompositeProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, right, top, transform, visible, width, win_theme. Inlined padding */ @JSImport("tabris", "Composite")
@js.native
class Composite () extends Widget {
  def this(properties: Properties[Composite, TypeScriptPropertiesKey]) = this()
  /**
    * Additional space to add inside the widget's bounds. If set to a number, this padding will be applied
    * on all four sides.
    */
  var padding: BoxDimensions | scala.Double = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_Composite: CompositeProperties = js.native
  /**
    * Adds the given widgets to the composite.
    * @param widgets 
    */
  def append(widgets: Widget*): this.type = js.native
  /**
    * Adds all widgets in the given array to the composite.
    * @param widgets 
    */
  def append(widgets: js.Array[Widget]): this.type = js.native
  /**
    * Adds all widgets in the given collection to the composite.
    * @param widgets 
    */
  def append(widgets: WidgetCollection[Widget]): this.type = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: CompositeEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: CompositeEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: CompositeEvents): this.type = js.native
}

