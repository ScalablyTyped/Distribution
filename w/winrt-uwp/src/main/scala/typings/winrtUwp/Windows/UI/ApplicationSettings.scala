package typings.winrtUwp.Windows.UI

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import typings.winrtUwp.Windows.Security.Credentials.WebAccountProvider
import typings.winrtUwp.Windows.UI.Popups.IUICommand
import typings.winrtUwp.Windows.UI.Popups.UICommandInvokedHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.accountcommandsrequested
import typings.winrtUwp.winrtUwpStrings.commandsrequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes that allow developers to define the app settings that appear in the settings pane of the Windows shell. The settings pane provides a consistent place for users to access app settings. */
object ApplicationSettings {
  
  @js.native
  sealed trait SettingsEdgeLocation extends StObject
  /** Specifies the edge of the screen where the Settings charms appear. */
  @JSGlobal("Windows.UI.ApplicationSettings.SettingsEdgeLocation")
  @js.native
  object SettingsEdgeLocation extends StObject {
    
    /** The Settings charm appears on the left edge of the screen. */
    @js.native
    sealed trait left extends SettingsEdgeLocation
    
    /** The Settings charm appears on the right edge of the screen. */
    @js.native
    sealed trait right extends SettingsEdgeLocation
  }
  
  @js.native
  sealed trait SupportedWebAccountActions extends StObject
  /** Specifies actions that your app enables on an web account instance in the account settings pane. */
  @JSGlobal("Windows.UI.ApplicationSettings.SupportedWebAccountActions")
  @js.native
  object SupportedWebAccountActions extends StObject {
    
    /** The app displays UI for managing the web account. */
    @js.native
    sealed trait manage extends SupportedWebAccountActions
    
    /** The app does a custom action with the web account. */
    @js.native
    sealed trait more extends SupportedWebAccountActions
    
    /** No action. */
    @js.native
    sealed trait none extends SupportedWebAccountActions
    
    /** The app attempts to connect to the web account. */
    @js.native
    sealed trait reconnect extends SupportedWebAccountActions
    
    /** The app removes the web account from the account settings pane. */
    @js.native
    sealed trait remove extends SupportedWebAccountActions
    
    /** The app displays details about the web account. */
    @js.native
    sealed trait viewDetails extends SupportedWebAccountActions
  }
  
  @js.native
  sealed trait WebAccountAction extends StObject
  /** Specifies actions that your app does on an web account. */
  @JSGlobal("Windows.UI.ApplicationSettings.WebAccountAction")
  @js.native
  object WebAccountAction extends StObject {
    
    /** The app displays UI for managing the web account. */
    @js.native
    sealed trait manage extends WebAccountAction
    
    /** The app does a custom action with the web account. */
    @js.native
    sealed trait more extends WebAccountAction
    
    /** The app attempts to connect to the web account. */
    @js.native
    sealed trait reconnect extends WebAccountAction
    
    /** The app removes the web account from the account settings pane. */
    @js.native
    sealed trait remove extends WebAccountAction
    
    /** The app displays details about the web account. */
    @js.native
    sealed trait viewDetails extends WebAccountAction
  }
  
  /** Provides methods to show the accounts pane and also to enable the app to register callbacks when the accounts flyout is about to be displayed. */
  @js.native
  trait AccountsSettingsPane extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_accountcommandsrequested(
      `type`: accountcommandsrequested,
      listener: TypedEventHandler[AccountsSettingsPane, AccountsSettingsPaneCommandsRequestedEventArgs]
    ): Unit = js.native
    
    /** Occurs when the user opens the accounts pane. Handling this event lets the app initialize the accounts commands and pause its UI until the user closes the pane. */
    def onaccountcommandsrequested(ev: AccountsSettingsPaneCommandsRequestedEventArgs with WinRTEvent[AccountsSettingsPane]): Unit = js.native
    /** Occurs when the user opens the accounts pane. Handling this event lets the app initialize the accounts commands and pause its UI until the user closes the pane. */
    @JSName("onaccountcommandsrequested")
    var onaccountcommandsrequested_Original: TypedEventHandler[AccountsSettingsPane, AccountsSettingsPaneCommandsRequestedEventArgs] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_accountcommandsrequested(
      `type`: accountcommandsrequested,
      listener: TypedEventHandler[AccountsSettingsPane, AccountsSettingsPaneCommandsRequestedEventArgs]
    ): Unit = js.native
  }
  
  /** Provides data for the AccountCommandsRequested event. */
  @js.native
  trait AccountsSettingsPaneCommandsRequestedEventArgs extends StObject {
    
    /** Gets the SettingsCommand collection for the account settings pane. */
    var commands: IVector[SettingsCommand] = js.native
    
    /** Gets the CredentialCommand collection for the account settings pane. */
    var credentialCommands: IVector[CredentialCommand] = js.native
    
    /**
      * Gets the deferral object for the AccountCommandsRequested event.
      * @return The deferral object.
      */
    def getDeferral(): AccountsSettingsPaneEventDeferral = js.native
    
    /** Gets or sets the header text for the account settings pane. */
    var headerText: String = js.native
    
    /** Gets the WebAccountCommand collection for the account settings pane. */
    var webAccountCommands: IVector[WebAccountCommand] = js.native
    
    /** Gets the WebAccountProviderCommand collection for the account settings pane. */
    var webAccountProviderCommands: IVector[WebAccountProviderCommand] = js.native
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
    implicit class AccountsSettingsPaneCommandsRequestedEventArgsMutableBuilder[Self <: AccountsSettingsPaneCommandsRequestedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommands(value: IVector[SettingsCommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialCommands(value: IVector[CredentialCommand]): Self = StObject.set(x, "credentialCommands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDeferral(value: () => AccountsSettingsPaneEventDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebAccountCommands(value: IVector[WebAccountCommand]): Self = StObject.set(x, "webAccountCommands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebAccountProviderCommands(value: IVector[WebAccountProviderCommand]): Self = StObject.set(x, "webAccountProviderCommands", value.asInstanceOf[js.Any])
    }
  }
  
  /** Enables the app to signal when it has finished populating command collections while handling the AccountCommandsRequested event. */
  @js.native
  trait AccountsSettingsPaneEventDeferral extends StObject {
    
    /** Signals that the app has finished populating command collections while handling the AccountCommandsRequested event. */
    def complete(): Unit = js.native
  }
  object AccountsSettingsPaneEventDeferral {
    
    @scala.inline
    def apply(complete: () => Unit): AccountsSettingsPaneEventDeferral = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
      __obj.asInstanceOf[AccountsSettingsPaneEventDeferral]
    }
    
    @scala.inline
    implicit class AccountsSettingsPaneEventDeferralMutableBuilder[Self <: AccountsSettingsPaneEventDeferral] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    }
  }
  
  /** Deprecated. Represents a command for changing web account credentials in the account settings pane. */
  @js.native
  trait CredentialCommand extends StObject {
    
    /** Gets the delegate that's invoked by the account settings pane when the user deletes a credential. */
    def credentialDeleted(command: CredentialCommand): Unit = js.native
    /** Gets the delegate that's invoked by the account settings pane when the user deletes a credential. */
    @JSName("credentialDeleted")
    var credentialDeleted_Original: CredentialCommandCredentialDeletedHandler = js.native
    
    /** Gets the password credential that the current command applies to. */
    var passwordCredential: PasswordCredential = js.native
  }
  
  /** Represents the method that's invoked by the account settings pane when the user deletes a credential. */
  type CredentialCommandCredentialDeletedHandler = js.Function1[/* command */ CredentialCommand, Unit]
  
  /** Creates a settings command object that represents a settings entry. This settings command can be appended to the ApplicationCommands vector. */
  @js.native
  trait SettingsCommand extends StObject {
    
    /** Gets or sets the command ID. */
    var id: js.Any = js.native
    
    /** Gets or sets the handler for the event that is raised when the user selects the command. */
    def invoked(command: IUICommand): Unit = js.native
    /** Gets or sets the handler for the event that is raised when the user selects the command. */
    @JSName("invoked")
    var invoked_Original: UICommandInvokedHandler = js.native
    
    /** Gets or sets the label for the command. */
    var label: String = js.native
  }
  
  /** A static class that enables the app to control the Settings Charm pane. The app can add or remove commands, receive a notification when the user opens the pane, or open the pane programmatically. */
  @js.native
  trait SettingsPane extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_commandsrequested(
      `type`: commandsrequested,
      listener: TypedEventHandler[SettingsPane, SettingsPaneCommandsRequestedEventArgs]
    ): Unit = js.native
    
    /** Occurs when the user opens the settings pane. Listening for this event lets the app initialize the setting commands and pause its UI until the user closes the pane. */
    def oncommandsrequested(ev: SettingsPaneCommandsRequestedEventArgs with WinRTEvent[SettingsPane]): Unit = js.native
    /** Occurs when the user opens the settings pane. Listening for this event lets the app initialize the setting commands and pause its UI until the user closes the pane. */
    @JSName("oncommandsrequested")
    var oncommandsrequested_Original: TypedEventHandler[SettingsPane, SettingsPaneCommandsRequestedEventArgs] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_commandsrequested(
      `type`: commandsrequested,
      listener: TypedEventHandler[SettingsPane, SettingsPaneCommandsRequestedEventArgs]
    ): Unit = js.native
  }
  
  /** Contains properties that are only available during the CommandsRequested event. */
  @js.native
  trait SettingsPaneCommandsRequest extends StObject {
    
    /** A vector that is available during the CommandsRequested event. Append SettingsCommand objects to it to make them available to the SettingsPane UI. */
    var applicationCommands: IVector[SettingsCommand] = js.native
  }
  object SettingsPaneCommandsRequest {
    
    @scala.inline
    def apply(applicationCommands: IVector[SettingsCommand]): SettingsPaneCommandsRequest = {
      val __obj = js.Dynamic.literal(applicationCommands = applicationCommands.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingsPaneCommandsRequest]
    }
    
    @scala.inline
    implicit class SettingsPaneCommandsRequestMutableBuilder[Self <: SettingsPaneCommandsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationCommands(value: IVector[SettingsCommand]): Self = StObject.set(x, "applicationCommands", value.asInstanceOf[js.Any])
    }
  }
  
  /** Contains arguments that are available from the event object during the CommandsRequested event. */
  @js.native
  trait SettingsPaneCommandsRequestedEventArgs extends StObject {
    
    /** An instance of SettingsPaneCommandsRequest that is made available during the CommandsRequested event. */
    var request: SettingsPaneCommandsRequest = js.native
  }
  object SettingsPaneCommandsRequestedEventArgs {
    
    @scala.inline
    def apply(request: SettingsPaneCommandsRequest): SettingsPaneCommandsRequestedEventArgs = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingsPaneCommandsRequestedEventArgs]
    }
    
    @scala.inline
    implicit class SettingsPaneCommandsRequestedEventArgsMutableBuilder[Self <: SettingsPaneCommandsRequestedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: SettingsPaneCommandsRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  /** Associates a command with a WebAccount in the account settings pane.. */
  @js.native
  trait WebAccountCommand extends StObject {
    
    /** Gets the actions that the command performs on the web account in the accounts pane. */
    var actions: SupportedWebAccountActions = js.native
    
    /** Gets the delegate that's invoked when the user selects an account and a specific action in the account settings pane. */
    def invoked(command: WebAccountCommand, args: WebAccountInvokedArgs): Unit = js.native
    /** Gets the delegate that's invoked when the user selects an account and a specific action in the account settings pane. */
    @JSName("invoked")
    var invoked_Original: WebAccountCommandInvokedHandler = js.native
    
    /** Gets the web account that's associated with the current command. */
    var webAccount: WebAccount = js.native
  }
  
  /** Represents the method that's invoked when the user selects an account and a specific action in the account settings pane. */
  type WebAccountCommandInvokedHandler = js.Function2[/* command */ WebAccountCommand, /* args */ WebAccountInvokedArgs, Unit]
  
  /** Provides data for the WebAccountCommandInvokedHandler delegate. */
  @js.native
  trait WebAccountInvokedArgs extends StObject {
    
    /** Gets the action for the web account in the accounts pane. */
    var action: WebAccountAction = js.native
  }
  object WebAccountInvokedArgs {
    
    @scala.inline
    def apply(action: WebAccountAction): WebAccountInvokedArgs = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAccountInvokedArgs]
    }
    
    @scala.inline
    implicit class WebAccountInvokedArgsMutableBuilder[Self <: WebAccountInvokedArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: WebAccountAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    }
  }
  
  /** Associates a provider command with a WebAccountProvider in the account settings pane. */
  @js.native
  trait WebAccountProviderCommand extends StObject {
    
    /** Gets the delegate that's invoked when the user selects an account and a specific action in the accounts pane. */
    def invoked(command: WebAccountProviderCommand): Unit = js.native
    /** Gets the delegate that's invoked when the user selects an account and a specific action in the accounts pane. */
    @JSName("invoked")
    var invoked_Original: WebAccountProviderCommandInvokedHandler = js.native
    
    /** Gets the web account provider that's associated with the current command. */
    var webAccountProvider: WebAccountProvider = js.native
  }
  
  /** Represents the method that's invoked when the user selects an account and a specific action in the account settings pane. */
  type WebAccountProviderCommandInvokedHandler = js.Function1[/* command */ WebAccountProviderCommand, Unit]
}
