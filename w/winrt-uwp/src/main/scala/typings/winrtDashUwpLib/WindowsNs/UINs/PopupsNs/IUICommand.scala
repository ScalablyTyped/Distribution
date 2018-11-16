package typings
package winrtDashUwpLib.WindowsNs.UINs.PopupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a command in a context menu or message dialog box. */
@js.native
trait IUICommand extends js.Object {
  /** Gets or sets the identifier of the command. */
  var id: js.Any = js.native
  /** Gets or sets the handler for the event that is fired when the user invokes the command. */
  @JSName("invoked")
  var invoked_Original: UICommandInvokedHandler = js.native
  /** Gets or sets the label for the command. */
  var label: java.lang.String = js.native
  /** Gets or sets the handler for the event that is fired when the user invokes the command. */
  def invoked(command: IUICommand): scala.Unit = js.native
}

