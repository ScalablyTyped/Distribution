package typings.winrtUwp.global.Windows.UI

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import typings.winrtUwp.Windows.Security.Credentials.WebAccountProvider
import typings.winrtUwp.Windows.UI.ApplicationSettings.CredentialCommandCredentialDeletedHandler
import typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsEdgeLocation
import typings.winrtUwp.Windows.UI.ApplicationSettings.SupportedWebAccountActions
import typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountAction
import typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountCommandInvokedHandler
import typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountProviderCommandInvokedHandler
import typings.winrtUwp.Windows.UI.Popups.IUICommand
import typings.winrtUwp.Windows.UI.Popups.UICommandInvokedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes that allow developers to define the app settings that appear in the settings pane of the Windows shell. The settings pane provides a consistent place for users to access app settings. */
object ApplicationSettings {
  
  /** Provides methods to show the accounts pane and also to enable the app to register callbacks when the accounts flyout is about to be displayed. */
  /* note: abstract class */ @JSGlobal("Windows.UI.ApplicationSettings.AccountsSettingsPane")
  @js.native
  open class AccountsSettingsPane ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ApplicationSettings.AccountsSettingsPane
  object AccountsSettingsPane {
    
    @JSGlobal("Windows.UI.ApplicationSettings.AccountsSettingsPane")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets an AccountsSettingsPane object that is associated with the current app view (that is, with CoreWindow ).
      * @return The account settings pane.
      */
    /* static member */
    inline def getForCurrentView(): typings.winrtUwp.Windows.UI.ApplicationSettings.AccountsSettingsPane = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.UI.ApplicationSettings.AccountsSettingsPane]
    
    /** Displays the account settings pane. */
    /* static member */
    inline def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]
  }
  
  /** Provides data for the AccountCommandsRequested event. */
  /* note: abstract class */ @JSGlobal("Windows.UI.ApplicationSettings.AccountsSettingsPaneCommandsRequestedEventArgs")
  @js.native
  open class AccountsSettingsPaneCommandsRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ApplicationSettings.AccountsSettingsPaneCommandsRequestedEventArgs {
    
    /** Gets the SettingsCommand collection for the account settings pane. */
    /* CompleteClass */
    var commands: IVector[typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsCommand] = js.native
    
    /** Gets the CredentialCommand collection for the account settings pane. */
    /* CompleteClass */
    var credentialCommands: IVector[typings.winrtUwp.Windows.UI.ApplicationSettings.CredentialCommand] = js.native
    
    /**
      * Gets the deferral object for the AccountCommandsRequested event.
      * @return The deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): typings.winrtUwp.Windows.UI.ApplicationSettings.AccountsSettingsPaneEventDeferral = js.native
    
    /** Gets or sets the header text for the account settings pane. */
    /* CompleteClass */
    var headerText: String = js.native
    
    /** Gets the WebAccountCommand collection for the account settings pane. */
    /* CompleteClass */
    var webAccountCommands: IVector[typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountCommand] = js.native
    
    /** Gets the WebAccountProviderCommand collection for the account settings pane. */
    /* CompleteClass */
    var webAccountProviderCommands: IVector[typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountProviderCommand] = js.native
  }
  
  /** Enables the app to signal when it has finished populating command collections while handling the AccountCommandsRequested event. */
  /* note: abstract class */ @JSGlobal("Windows.UI.ApplicationSettings.AccountsSettingsPaneEventDeferral")
  @js.native
  open class AccountsSettingsPaneEventDeferral ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ApplicationSettings.AccountsSettingsPaneEventDeferral {
    
    /** Signals that the app has finished populating command collections while handling the AccountCommandsRequested event. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** Deprecated. Represents a command for changing web account credentials in the account settings pane. */
  @JSGlobal("Windows.UI.ApplicationSettings.CredentialCommand")
  @js.native
  open class CredentialCommand protected ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ApplicationSettings.CredentialCommand {
    /**
      * Initializes a new instance of the CredentialCommand class with a PasswordCredential object.
      * @param passwordCredential The password credential.
      */
    def this(passwordCredential: PasswordCredential) = this()
    /**
      * Initializes a new instance of the CredentialCommand class with a PasswordCredential object and a CredentialCommandCredentialDeletedHandler delegate.
      * @param passwordCredential The password credential.
      * @param deleted The delegate that handles credential deletion.
      */
    def this(passwordCredential: PasswordCredential, deleted: CredentialCommandCredentialDeletedHandler) = this()
    
    /** Gets the delegate that's invoked by the account settings pane when the user deletes a credential. */
    /* CompleteClass */
    override def credentialDeleted(command: typings.winrtUwp.Windows.UI.ApplicationSettings.CredentialCommand): Unit = js.native
    /** Gets the delegate that's invoked by the account settings pane when the user deletes a credential. */
    /* CompleteClass */
    @JSName("credentialDeleted")
    var credentialDeleted_Original: CredentialCommandCredentialDeletedHandler = js.native
    
    /** Gets the password credential that the current command applies to. */
    /* CompleteClass */
    var passwordCredential: PasswordCredential = js.native
  }
  
  /** Creates a settings command object that represents a settings entry. This settings command can be appended to the ApplicationCommands vector. */
  @JSGlobal("Windows.UI.ApplicationSettings.SettingsCommand")
  @js.native
  open class SettingsCommand protected ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsCommand {
    /**
      * Creates a new settings command.
      * @param settingsCommandId The ID of the command.
      * @param label The label for the command, which is displayed in the settings pane.
      * @param handler The event handler that is called when the user selects this command in the settings pane.
      */
    def this(settingsCommandId: Any, label: String, handler: UICommandInvokedHandler) = this()
    
    /** Gets or sets the command ID. */
    /* CompleteClass */
    var id: Any = js.native
    
    /** Gets or sets the handler for the event that is raised when the user selects the command. */
    /* CompleteClass */
    override def invoked(command: IUICommand): Unit = js.native
    /** Gets or sets the handler for the event that is raised when the user selects the command. */
    /* CompleteClass */
    @JSName("invoked")
    var invoked_Original: UICommandInvokedHandler = js.native
    
    /** Gets or sets the label for the command. */
    /* CompleteClass */
    var label: String = js.native
  }
  object SettingsCommand {
    
    @JSGlobal("Windows.UI.ApplicationSettings.SettingsCommand")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the command for a web account in the account settings pane. */
    /* static member */
    @JSGlobal("Windows.UI.ApplicationSettings.SettingsCommand.accountsCommand")
    @js.native
    def accountsCommand: typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsCommand = js.native
    inline def accountsCommand_=(x: typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accountsCommand")(x.asInstanceOf[js.Any])
  }
  
  /** Specifies the edge of the screen where the Settings charms appear. */
  @JSGlobal("Windows.UI.ApplicationSettings.SettingsEdgeLocation")
  @js.native
  object SettingsEdgeLocation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsEdgeLocation & Double] = js.native
    
    /* 1 */ val left: typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsEdgeLocation.left & Double = js.native
    
    /* 0 */ val right: typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsEdgeLocation.right & Double = js.native
  }
  
  /** A static class that enables the app to control the Settings Charm pane. The app can add or remove commands, receive a notification when the user opens the pane, or open the pane programmatically. */
  /* note: abstract class */ @JSGlobal("Windows.UI.ApplicationSettings.SettingsPane")
  @js.native
  open class SettingsPane ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsPane
  object SettingsPane {
    
    @JSGlobal("Windows.UI.ApplicationSettings.SettingsPane")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets a value indicating whether the Settings charm appears on the left or right edge of the screen. */
    /* static member */
    @JSGlobal("Windows.UI.ApplicationSettings.SettingsPane.edge")
    @js.native
    def edge: SettingsEdgeLocation = js.native
    inline def edge_=(x: SettingsEdgeLocation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edge")(x.asInstanceOf[js.Any])
    
    /**
      * Gets a SettingsPane object that is associated with the current app view (that is, with CoreWindow ).
      * @return The settings pane.
      */
    /* static member */
    inline def getForCurrentView(): typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsPane = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsPane]
    
    /** Displays the Settings Charm pane to the user. */
    /* static member */
    inline def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]
  }
  
  /** Contains properties that are only available during the CommandsRequested event. */
  /* note: abstract class */ @JSGlobal("Windows.UI.ApplicationSettings.SettingsPaneCommandsRequest")
  @js.native
  open class SettingsPaneCommandsRequest ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsPaneCommandsRequest {
    
    /** A vector that is available during the CommandsRequested event. Append SettingsCommand objects to it to make them available to the SettingsPane UI. */
    /* CompleteClass */
    var applicationCommands: IVector[typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsCommand] = js.native
  }
  
  /** Contains arguments that are available from the event object during the CommandsRequested event. */
  /* note: abstract class */ @JSGlobal("Windows.UI.ApplicationSettings.SettingsPaneCommandsRequestedEventArgs")
  @js.native
  open class SettingsPaneCommandsRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsPaneCommandsRequestedEventArgs {
    
    /** An instance of SettingsPaneCommandsRequest that is made available during the CommandsRequested event. */
    /* CompleteClass */
    var request: typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsPaneCommandsRequest = js.native
  }
  
  /** Specifies actions that your app enables on an web account instance in the account settings pane. */
  @JSGlobal("Windows.UI.ApplicationSettings.SupportedWebAccountActions")
  @js.native
  object SupportedWebAccountActions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.UI.ApplicationSettings.SupportedWebAccountActions & Double
      ] = js.native
    
    /* 4 */ val manage: typings.winrtUwp.Windows.UI.ApplicationSettings.SupportedWebAccountActions.manage & Double = js.native
    
    /* 5 */ val more: typings.winrtUwp.Windows.UI.ApplicationSettings.SupportedWebAccountActions.more & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.UI.ApplicationSettings.SupportedWebAccountActions.none & Double = js.native
    
    /* 1 */ val reconnect: typings.winrtUwp.Windows.UI.ApplicationSettings.SupportedWebAccountActions.reconnect & Double = js.native
    
    /* 2 */ val remove: typings.winrtUwp.Windows.UI.ApplicationSettings.SupportedWebAccountActions.remove & Double = js.native
    
    /* 3 */ val viewDetails: typings.winrtUwp.Windows.UI.ApplicationSettings.SupportedWebAccountActions.viewDetails & Double = js.native
  }
  
  /** Specifies actions that your app does on an web account. */
  @JSGlobal("Windows.UI.ApplicationSettings.WebAccountAction")
  @js.native
  object WebAccountAction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountAction & Double] = js.native
    
    /* 3 */ val manage: typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountAction.manage & Double = js.native
    
    /* 4 */ val more: typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountAction.more & Double = js.native
    
    /* 0 */ val reconnect: typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountAction.reconnect & Double = js.native
    
    /* 1 */ val remove: typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountAction.remove & Double = js.native
    
    /* 2 */ val viewDetails: typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountAction.viewDetails & Double = js.native
  }
  
  /** Associates a command with a WebAccount in the account settings pane.. */
  @JSGlobal("Windows.UI.ApplicationSettings.WebAccountCommand")
  @js.native
  open class WebAccountCommand protected ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountCommand {
    /**
      * Initializes a new instance of the WebAccountCommand class.
      * @param webAccount The web account to associate with the current command.
      * @param invoked The delegate that handles the command.
      * @param actions A bitmask of web account actions.
      */
    def this(
      webAccount: WebAccount,
      invoked: WebAccountCommandInvokedHandler,
      actions: SupportedWebAccountActions
    ) = this()
    
    /** Gets the actions that the command performs on the web account in the accounts pane. */
    /* CompleteClass */
    var actions: SupportedWebAccountActions = js.native
    
    /** Gets the delegate that's invoked when the user selects an account and a specific action in the account settings pane. */
    /* CompleteClass */
    override def invoked(
      command: typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountCommand,
      args: typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountInvokedArgs
    ): Unit = js.native
    /** Gets the delegate that's invoked when the user selects an account and a specific action in the account settings pane. */
    /* CompleteClass */
    @JSName("invoked")
    var invoked_Original: WebAccountCommandInvokedHandler = js.native
    
    /** Gets the web account that's associated with the current command. */
    /* CompleteClass */
    var webAccount: WebAccount = js.native
  }
  
  /** Provides data for the WebAccountCommandInvokedHandler delegate. */
  /* note: abstract class */ @JSGlobal("Windows.UI.ApplicationSettings.WebAccountInvokedArgs")
  @js.native
  open class WebAccountInvokedArgs ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountInvokedArgs {
    
    /** Gets the action for the web account in the accounts pane. */
    /* CompleteClass */
    var action: WebAccountAction = js.native
  }
  
  /** Associates a provider command with a WebAccountProvider in the account settings pane. */
  @JSGlobal("Windows.UI.ApplicationSettings.WebAccountProviderCommand")
  @js.native
  open class WebAccountProviderCommand protected ()
    extends StObject
       with typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountProviderCommand {
    /**
      * Initializes a new instance of the WebAccountProviderCommand class.
      * @param webAccountProvider The web account provider.
      * @param invoked The delegate that handles the provider command.
      */
    def this(webAccountProvider: WebAccountProvider, invoked: WebAccountProviderCommandInvokedHandler) = this()
    
    /** Gets the delegate that's invoked when the user selects an account and a specific action in the accounts pane. */
    /* CompleteClass */
    override def invoked(command: typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountProviderCommand): Unit = js.native
    /** Gets the delegate that's invoked when the user selects an account and a specific action in the accounts pane. */
    /* CompleteClass */
    @JSName("invoked")
    var invoked_Original: WebAccountProviderCommandInvokedHandler = js.native
    
    /** Gets the web account provider that's associated with the current command. */
    /* CompleteClass */
    var webAccountProvider: WebAccountProvider = js.native
  }
}
