package typings
package tabrisDashPluginDashFirebaseLib.tabrisDashPluginDashFirebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Base class for all objects with a native implementation.
 */
@js.native
trait NativeObject extends js.Object {
  /**
       * Gets the current value of the given *property*.
       */
  def get(property: java.lang.String): js.Any = js.native
  /**
       * Removes all listeners in the given object from the event type indicated by their key.
       * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
       */
  def off(listeners: js.Object): this.type = js.native
  /**
       * Removes all occurrences of *listener* that are bound to *type* and *context* from this widget.
       * @param type The type of events to remove listeners for.
       * @param listener The listener function to remove.
       * @param context The context of the bound listener to remove.
       */
  def off(`type`: java.lang.String, listener: js.Function1[/* event */ js.Any, scala.Unit]): this.type = js.native
  /**
       * Removes all occurrences of *listener* that are bound to *type* and *context* from this widget.
       * @param type The type of events to remove listeners for.
       * @param listener The listener function to remove.
       * @param context The context of the bound listener to remove.
       */
  def off(
    `type`: java.lang.String,
    listener: js.Function1[/* event */ js.Any, scala.Unit],
    context: js.Object
  ): this.type = js.native
  /**
       * Registers all listeners in the given object for the event type indicated by their key.
       * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
       */
  def on(listeners: js.Object): this.type = js.native
  /**
       * Registers a *listener* function to be notified of events of the given *type*.
       * @param type The type of events to listen for.
       * @param listener The listener function to register. This function will be called with an event object.
       * @param context In the listener function, `this` will point to this object. If not present, the listener will be called in the context of this object.
       */
  def on(`type`: java.lang.String, listener: js.Function1[/* event */ js.Any, scala.Unit]): this.type = js.native
  /**
       * Registers a *listener* function to be notified of events of the given *type*.
       * @param type The type of events to listen for.
       * @param listener The listener function to register. This function will be called with an event object.
       * @param context In the listener function, `this` will point to this object. If not present, the listener will be called in the context of this object.
       */
  def on(
    `type`: java.lang.String,
    listener: js.Function1[/* event */ js.Any, scala.Unit],
    context: js.Object
  ): this.type = js.native
  /**
       * Same as `on`, but removes the listener after it has been invoked by an event.
       * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
       */
  def once(listeners: js.Object): this.type = js.native
  /**
       * Same as `on`, but removes the listener after it has been invoked by an event.
       * @param type The type of the event to listen for.
       * @param listener The listener function to register. This function will be called with an event object.
       * @param context In the listener function, `this` will point to this object. If not present, the listener will be called in the context of this object.
       */
  def once(`type`: java.lang.String, listener: js.Function1[/* event */ js.Any, scala.Unit]): this.type = js.native
  /**
       * Same as `on`, but removes the listener after it has been invoked by an event.
       * @param type The type of the event to listen for.
       * @param listener The listener function to register. This function will be called with an event object.
       * @param context In the listener function, `this` will point to this object. If not present, the listener will be called in the context of this object.
       */
  def once(
    `type`: java.lang.String,
    listener: js.Function1[/* event */ js.Any, scala.Unit],
    context: js.Object
  ): this.type = js.native
  /**
       * Sets all key-value pairs in the properties object as widget properties.
       */
  def set(properties: js.Object): this.type = js.native
  /**
       * Sets the given property.
       */
  def set(property: java.lang.String, value: js.Any): this.type = js.native
  /**
       * Notifies all registered listeners for the given *type* and passes the *event* object to the
       * listeners.
       * @param type The type of event to trigger
       * @param event The event object to pass to listener functions.
       */
  def trigger(`type`: java.lang.String, event: EventObject[this.type]): this.type = js.native
}

