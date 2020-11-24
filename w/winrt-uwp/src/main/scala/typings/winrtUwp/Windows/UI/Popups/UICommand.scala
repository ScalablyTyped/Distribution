package typings.winrtUwp.Windows.UI.Popups

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a command in a context menu. */
@js.native
trait UICommand extends js.Object {
  
  /** Gets or sets the identifier of the command. */
  var id: js.Any = js.native
  
  /** Gets or sets the handler for the event that is fired when the user selects the UICommand . */
  def invoked(command: IUICommand): Unit = js.native
  /** Gets or sets the handler for the event that is fired when the user selects the UICommand . */
  @JSName("invoked")
  var invoked_Original: UICommandInvokedHandler = js.native
  
  /** Gets or sets the label for the command. */
  var label: String = js.native
}
