package typings.winrtUwp.Windows.UI.ApplicationSettings

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the AccountCommandsRequested event. */
trait AccountsSettingsPaneCommandsRequestedEventArgs extends StObject {
  
  /** Gets the SettingsCommand collection for the account settings pane. */
  var commands: IVector[SettingsCommand]
  
  /** Gets the CredentialCommand collection for the account settings pane. */
  var credentialCommands: IVector[CredentialCommand]
  
  /**
    * Gets the deferral object for the AccountCommandsRequested event.
    * @return The deferral object.
    */
  def getDeferral(): AccountsSettingsPaneEventDeferral
  
  /** Gets or sets the header text for the account settings pane. */
  var headerText: String
  
  /** Gets the WebAccountCommand collection for the account settings pane. */
  var webAccountCommands: IVector[WebAccountCommand]
  
  /** Gets the WebAccountProviderCommand collection for the account settings pane. */
  var webAccountProviderCommands: IVector[WebAccountProviderCommand]
}
object AccountsSettingsPaneCommandsRequestedEventArgs {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: AccountsSettingsPaneCommandsRequestedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCommands(value: IVector[SettingsCommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCredentialCommands(value: IVector[CredentialCommand]): Self = StObject.set(x, "credentialCommands", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: () => AccountsSettingsPaneEventDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    inline def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
    
    inline def setWebAccountCommands(value: IVector[WebAccountCommand]): Self = StObject.set(x, "webAccountCommands", value.asInstanceOf[js.Any])
    
    inline def setWebAccountProviderCommands(value: IVector[WebAccountProviderCommand]): Self = StObject.set(x, "webAccountProviderCommands", value.asInstanceOf[js.Any])
  }
}
