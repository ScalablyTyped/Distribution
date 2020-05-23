package typings.winrtUwp.Windows.UI.ApplicationSettings

import typings.winrtUwp.Windows.UI.Popups.IUICommand
import typings.winrtUwp.Windows.UI.Popups.UICommandInvokedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates a settings command object that represents a settings entry. This settings command can be appended to the ApplicationCommands vector. */
@js.native
trait SettingsCommand extends js.Object {
  /** Gets or sets the command ID. */
  var id: js.Any = js.native
  /** Gets or sets the handler for the event that is raised when the user selects the command. */
  @JSName("invoked")
  var invoked_Original: UICommandInvokedHandler = js.native
  /** Gets or sets the label for the command. */
  var label: String = js.native
  /** Gets or sets the handler for the event that is raised when the user selects the command. */
  def invoked(command: IUICommand): Unit = js.native
}

