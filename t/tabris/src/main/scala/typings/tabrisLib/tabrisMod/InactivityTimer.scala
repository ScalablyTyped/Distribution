package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A timer that triggers when the app has not been interacted with for a configurable interval.
  */
@JSImport("tabris", "InactivityTimer")
@js.native
class InactivityTimer ()
  extends NativeObject
     with _InactivityTimerProperties {
  def this(properties: Properties[InactivityTimer, TypeScriptPropertiesKey]) = this()
  /**
    * The interval of user inactivity that will trigger the timer. Given in milliseconds. Changes to this
    * property will not affect a running timer.
    */
  /* CompleteClass */
  override var delay: scala.Double = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_InactivityTimer: InactivityTimerProperties = js.native
  /**
    * Stops and resets the timer.
    */
  def cancel(): scala.Unit = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: InactivityTimerEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: InactivityTimerEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: InactivityTimerEvents): this.type = js.native
  /**
    * Starts the timer with the currently configured delay. After the first `timeout` event, the timer will
    * stop but it can be started again.
    */
  def start(): scala.Unit = js.native
}

