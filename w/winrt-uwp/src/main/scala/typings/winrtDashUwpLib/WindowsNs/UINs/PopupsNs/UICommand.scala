package typings
package winrtDashUwpLib.WindowsNs.UINs.PopupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a command in a context menu. */
@JSGlobal("Windows.UI.Popups.UICommand")
@js.native
/** Creates a new instance of the UICommand class. */
class UICommand () extends js.Object {
  /**
    * Creates a new instance of the UICommand class using the specified label.
    * @param label The label for the UICommand .
    */
  def this(label: java.lang.String) = this()
  /**
    * Creates a new instance of the UICommand class using the specified label and event handler.
    * @param label The label for the new command.
    * @param action The event handler for the new command.
    */
  def this(label: java.lang.String, action: UICommandInvokedHandler) = this()
  /**
    * Creates a new instance of the UICommand class using the specified label, event handler, and command identifier.
    * @param label The label for the new command.
    * @param action The event handler for the new command.
    * @param commandId The command identifier for the new command.
    */
  def this(label: java.lang.String, action: UICommandInvokedHandler, commandId: js.Any) = this()
  /** Gets or sets the identifier of the command. */
  var id: js.Any = js.native
  /** Gets or sets the handler for the event that is fired when the user selects the UICommand . */
  @JSName("invoked")
  var invoked_Original: UICommandInvokedHandler = js.native
  /** Gets or sets the label for the command. */
  var label: java.lang.String = js.native
  /** Gets or sets the handler for the event that is fired when the user selects the UICommand . */
  def invoked(command: IUICommand): scala.Unit = js.native
}

