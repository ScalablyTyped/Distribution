package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `TimeDialog` represents a native dialog pop-up allowing the user to pick a time of day. Properties
  * can only be set before open() is called. The dialog is automatically disposed when closed.
  */
@JSImport("tabris", "TimeDialog")
@js.native
class TimeDialog ()
  extends Popup
     with _TimeDialogProperties {
  def this(properties: TimeDialogProperties) = this()
  /**
    * The time to be displayed in the dialog. The current date is used when no date is provided.
    */
  /* CompleteClass */
  override var date: stdLib.Date = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_TimeDialog: TimeDialogProperties = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: TimeDialogEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: TimeDialogEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: TimeDialogEvents): this.type = js.native
}

