package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `AlertDialog` represents a native dialog pop-up showing a message and up to three buttons.  Is
  * automatically disposed when closed.
  */
@JSImport("tabris", "AlertDialog")
@js.native
class AlertDialog ()
  extends Popup
     with _AlertDialogProperties {
  def this(properties: tabrisLib.Properties[AlertDialog, tabrisLib.TypeScriptPropertiesKey]) = this()
  /**
    * An object with the texts of the buttons to display. There are up to three buttons: `ok`, `cancel` and
    * `neutral`. If no text is given for a button it will not be displayed. Example: `{ok: 'Yes', cancel:
    * 'No'}` shows 'Yes' and 'No', but no 'neutral' button.
    */
  /* CompleteClass */
  override var buttons: tabrisLib.Anon_CancelNeutral = js.native
  /**
    * The message to display inside the dialog.
    */
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /**
    * A list of `TextInput` widgets to be displayed alongside the `title` and `message`. The text values
    * inserted by the user can be read in the dialogs `close` event from the respective `TextInputs`. Eg.:
    * `dialog.on('close', (e) => e.target.textInputs[0].text)`
    */
  /* CompleteClass */
  override var textInputs: js.Array[TextInput] = js.native
  /**
    * The title of the dialog.
    */
  /* CompleteClass */
  override var title: java.lang.String = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_AlertDialog: tabrisLib.AlertDialogProperties = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: AlertDialogEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: AlertDialogEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: AlertDialogEvents): this.type = js.native
}

