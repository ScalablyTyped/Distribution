package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `DateDialog` represents a native dialog pop-up allowing the user to pick a date. Properties can
  * only be set before open() is called. The dialog is automatically disposed when closed.
  */
@JSImport("tabris", "DateDialog")
@js.native
class DateDialog ()
  extends Popup
     with _DateDialogProperties {
  def this(properties: tabrisLib.Properties[DateDialog, tabrisLib.TypeScriptPropertiesKey]) = this()
  /**
    * The date to be displayed in the dialog. The current date is used when no date is provided.
    */
  /* CompleteClass */
  override var date: stdLib.Date = js.native
  /**
    * Limits the selectable date range to the given future date. No limit is applied when not set.
    */
  /* CompleteClass */
  override var maxDate: stdLib.Date = js.native
  /**
    * Limits the selectable date range to the given past date. No limit is applied when not set.
    */
  /* CompleteClass */
  override var minDate: stdLib.Date = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_DateDialog: tabrisLib.DateDialogProperties = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: DateDialogEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: DateDialogEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: DateDialogEvents): this.type = js.native
}

