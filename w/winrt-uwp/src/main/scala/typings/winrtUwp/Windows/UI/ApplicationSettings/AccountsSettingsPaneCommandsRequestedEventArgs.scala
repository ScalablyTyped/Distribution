package typings.winrtUwp.Windows.UI.ApplicationSettings

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AccountCommandsRequested event. */
@js.native
trait AccountsSettingsPaneCommandsRequestedEventArgs extends js.Object {
  /** Gets the SettingsCommand collection for the account settings pane. */
  var commands: IVector[SettingsCommand] = js.native
  /** Gets the CredentialCommand collection for the account settings pane. */
  var credentialCommands: IVector[CredentialCommand] = js.native
  /** Gets or sets the header text for the account settings pane. */
  var headerText: String = js.native
  /** Gets the WebAccountCommand collection for the account settings pane. */
  var webAccountCommands: IVector[WebAccountCommand] = js.native
  /** Gets the WebAccountProviderCommand collection for the account settings pane. */
  var webAccountProviderCommands: IVector[WebAccountProviderCommand] = js.native
  /**
    * Gets the deferral object for the AccountCommandsRequested event.
    * @return The deferral object.
    */
  def getDeferral(): AccountsSettingsPaneEventDeferral = js.native
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
  @scala.inline
  implicit class AccountsSettingsPaneCommandsRequestedEventArgsOps[Self <: AccountsSettingsPaneCommandsRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommands(value: IVector[SettingsCommand]): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentialCommands(value: IVector[CredentialCommand]): Self = this.set("credentialCommands", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDeferral(value: () => AccountsSettingsPaneEventDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    @scala.inline
    def setHeaderText(value: String): Self = this.set("headerText", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAccountCommands(value: IVector[WebAccountCommand]): Self = this.set("webAccountCommands", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAccountProviderCommands(value: IVector[WebAccountProviderCommand]): Self = this.set("webAccountProviderCommands", value.asInstanceOf[js.Any])
  }
  
}

