package typings.winrtUwp.Windows.UI.Popups

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a command separator in a context menu. */
@js.native
trait UICommandSeparator extends js.Object {
  /** Gets or sets the identifier of the command separator. */
  var id: js.Any = js.native
  /** Gets or sets the handler for the event that is fired for the command separator. */
  @JSName("invoked")
  var invoked_Original: UICommandInvokedHandler = js.native
  /** Gets or sets the label for the command separator. */
  var label: String = js.native
  /** Gets or sets the handler for the event that is fired for the command separator. */
  def invoked(command: IUICommand): Unit = js.native
}

