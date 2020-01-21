package typings.winrtUwp.Windows.UI.ApplicationSettings

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AccountCommandsRequested event. */
@JSGlobal("Windows.UI.ApplicationSettings.AccountsSettingsPaneCommandsRequestedEventArgs")
@js.native
abstract class AccountsSettingsPaneCommandsRequestedEventArgs () extends js.Object {
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

