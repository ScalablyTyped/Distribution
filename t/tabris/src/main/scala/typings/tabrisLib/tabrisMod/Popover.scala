package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `Popover` represents a modal ui container that is shown above the apps content. It provides the
  * root element of a new layout hierarchy in the form of its `contentView` property. User provided
  * widgets can be attached to the `contentView` similarly to the `tabris.ui.contentView`. In order to
  * close the `Popover` the `close()` method can be used.
  * The appearance of the `Popover` depends on the device size: On larger devices (like tablets) the
  * `Popover` is shown as a floating window whereas on smaller devices it is shown as a fullscreen sheet
  * covering the entire app. When used on larger devices, the size _has_ to be provided via the `width`
  * and `height` properties.
  */
@JSImport("tabris", "Popover")
@js.native
class Popover ()
  extends Popup
     with _PopoverProperties {
  def this(properties: Properties[Popover, TypeScriptPropertiesKey]) = this()
  /**
    * An anchor `Widget` the `Popover` should attach to. When the anchor is given the `Popover` is
    * positioned next to the anchor `Widget` and provides a visual indication of its relation. When omitted
    * the `Popover` is positioned centered on the screen.
    */
  /* CompleteClass */
  override var anchor: Widget = js.native
  /**
    * The height of the `Popover` when shown in windowed mode on large screen devices
    */
  /* CompleteClass */
  override var height: tabrisLib.dimension = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_Popover: PopoverProperties = js.native
  /**
    * The width of the `Popover` when shown in windowed mode on large screen devices.
    */
  /* CompleteClass */
  override var width: tabrisLib.dimension = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: PopoverEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: PopoverEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: PopoverEvents): this.type = js.native
}

