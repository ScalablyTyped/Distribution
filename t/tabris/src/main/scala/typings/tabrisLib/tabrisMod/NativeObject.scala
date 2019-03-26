package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class for all objects with a native implementation.
  */
@JSImport("tabris", "NativeObject")
@js.native
class NativeObject protected () extends _NativeObjectProperties {
  protected def this(properties: tabrisLib.Properties[NativeObject, tabrisLib.TypeScriptPropertiesKey]) = this()
  /**
    * An application-wide unique identifier automatically assigned to all native objects on creation.
    * @static
    */
  val cid: java.lang.String = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  val tsProperties: tabrisLib.NativeObjectProperties = js.native
  /**
    * Gets the current value of the given *property*.
    * @param property 
    */
  def get[T /* <: java.lang.String */](property: T): /* import warning: ImportType.apply Failed type conversion: tabris.Properties<this, tabris.TypeScriptPropertiesKey>[T] */ js.Any = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: NativeObjectEvents): this.type = js.native
  /**
    * Removes all occurrences of *listener* that are bound to *type* and *context* from this widget.
    * @param type The type of events to remove listeners for.
    * @param listener The listener function to remove.
    * @param context The context of the bound listener to remove.
    */
  def off(`type`: java.lang.String, listener: js.Function1[/* event */ js.Any, scala.Unit]): this.type = js.native
  def off(
    `type`: java.lang.String,
    listener: js.Function1[/* event */ js.Any, scala.Unit],
    context: js.Object
  ): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: NativeObjectEvents): this.type = js.native
  /**
    * Registers a *listener* function to be notified of events of the given *type*.
    * @param type The type of events to listen for.
    * @param listener The listener function to register. This function will be called with an event object.
    * @param context In the listener function, `this` will point to this object. If not present, the listener will be called in the context of this object.
    */
  def on(`type`: java.lang.String, listener: js.Function1[/* event */ js.Any, scala.Unit]): this.type = js.native
  def on(
    `type`: java.lang.String,
    listener: js.Function1[/* event */ js.Any, scala.Unit],
    context: js.Object
  ): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: NativeObjectEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param type The type of the event to listen for.
    * @param listener The listener function to register. This function will be called with an event object.
    * @param context In the listener function, `this` will point to this object. If not present, the listener will be called in the context of this object.
    */
  def once(`type`: java.lang.String, listener: js.Function1[/* event */ js.Any, scala.Unit]): this.type = js.native
  def once(
    `type`: java.lang.String,
    listener: js.Function1[/* event */ js.Any, scala.Unit],
    context: js.Object
  ): this.type = js.native
  /**
    * Sets all key-value pairs in the properties object as widget properties.
    * @param properties 
    */
  def set(properties: tabrisLib.Properties[this.type, tabrisLib.TypeScriptPropertiesKey]): this.type = js.native
  /**
    * Sets the given property.
    * @param property 
    * @param value 
    */
  def set[T /* <: java.lang.String */](
    property: T,
    value: /* import warning: ImportType.apply Failed type conversion: tabris.Properties<this, tabris.TypeScriptPropertiesKey>[T] */ js.Any
  ): this.type = js.native
  /**
    * Notifies all registered listeners for the given *type*.
    * @param type The type of event to trigger
    */
  def trigger(`type`: java.lang.String): this.type = js.native
  /**
    * Initializes the given *eventObject*  and passes it to all listeners registered for this event *type*.
    * @param type The type of event to trigger
    * @param eventObject An instance of `EventObject` (or a subclass) to pass to listener functions.
    */
  def trigger(`type`: java.lang.String, eventObject: EventObject[this.type]): this.type = js.native
  /**
    * Passes the given *object* it to all listeners registered for this event *type*.
    * @param type The type of event to trigger
    * @param object The object to pass to listener functions.
    */
  def trigger(`type`: java.lang.String, `object`: js.Object): this.type = js.native
}

