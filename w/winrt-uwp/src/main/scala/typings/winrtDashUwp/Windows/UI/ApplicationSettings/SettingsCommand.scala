package typings.winrtDashUwp.Windows.UI.ApplicationSettings

import typings.winrtDashUwp.Windows.UI.Popups.IUICommand
import typings.winrtDashUwp.Windows.UI.Popups.UICommandInvokedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates a settings command object that represents a settings entry. This settings command can be appended to the ApplicationCommands vector. */
@JSGlobal("Windows.UI.ApplicationSettings.SettingsCommand")
@js.native
class SettingsCommand protected () extends js.Object {
  /**
    * Creates a new settings command.
    * @param settingsCommandId The ID of the command.
    * @param label The label for the command, which is displayed in the settings pane.
    * @param handler The event handler that is called when the user selects this command in the settings pane.
    */
  def this(settingsCommandId: js.Any, label: String, handler: UICommandInvokedHandler) = this()
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

/* static members */
@JSGlobal("Windows.UI.ApplicationSettings.SettingsCommand")
@js.native
object SettingsCommand extends js.Object {
  /** Gets the command for a web account in the account settings pane. */
  var accountsCommand: SettingsCommand = js.native
}

