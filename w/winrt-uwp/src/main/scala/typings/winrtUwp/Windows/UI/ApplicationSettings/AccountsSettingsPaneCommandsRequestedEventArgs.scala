package typings.winrtUwp.Windows.UI.ApplicationSettings

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AccountCommandsRequested event. */
trait AccountsSettingsPaneCommandsRequestedEventArgs extends js.Object {
  /** Gets the SettingsCommand collection for the account settings pane. */
  var commands: IVector[SettingsCommand]
  /** Gets the CredentialCommand collection for the account settings pane. */
  var credentialCommands: IVector[CredentialCommand]
  /** Gets or sets the header text for the account settings pane. */
  var headerText: String
  /** Gets the WebAccountCommand collection for the account settings pane. */
  var webAccountCommands: IVector[WebAccountCommand]
  /** Gets the WebAccountProviderCommand collection for the account settings pane. */
  var webAccountProviderCommands: IVector[WebAccountProviderCommand]
  /**
    * Gets the deferral object for the AccountCommandsRequested event.
    * @return The deferral object.
    */
  def getDeferral(): AccountsSettingsPaneEventDeferral
}

object AccountsSettingsPaneCommandsRequestedEventArgs {
  @scala.inline
  def apply(
    commands: IVector[SettingsCommand],
    credentialCommands: IVector[CredentialCommand],
    getDeferral: () => AccountsSettingsPaneEventDeferral,
    headerText: String,
    webAccountCommands: IVector[WebAccountCommand],
    webAccountProviderCommands: IVector[WebAccountProviderCommand]
  ): AccountsSettingsPaneCommandsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], credentialCommands = credentialCommands.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), headerText = headerText.asInstanceOf[js.Any], webAccountCommands = webAccountCommands.asInstanceOf[js.Any], webAccountProviderCommands = webAccountProviderCommands.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsSettingsPaneCommandsRequestedEventArgs]
  }
}

