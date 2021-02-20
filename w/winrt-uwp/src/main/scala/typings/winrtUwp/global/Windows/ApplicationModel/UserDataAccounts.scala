package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds
import typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains user data account information needed to access email, appointments, calendars, and so on. */
object UserDataAccounts {
  
  /** Provides functionality for apps to invoke system-level UI to manage sync partnerships on the device. */
  object SystemAccess {
    
    /** Represents device settings for app sync relationships. */
    @JSGlobal("Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountConfiguration")
    @js.native
    /** Initializes a new instance of the DeviceAccountConfiguration class. */
    class DeviceAccountConfiguration ()
      extends typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountConfiguration
    
    /** Defines the server types for syncing. */
    @JSGlobal("Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType")
    @js.native
    object DeviceAccountServerType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType with Double
          ] = js.native
      
      /* 0 */ val exchange: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType.exchange with Double = js.native
      
      /* 2 */ val imap: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType.imap with Double = js.native
      
      /* 1 */ val pop: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType.pop with Double = js.native
    }
    
    /** Provides the ability to display the system UI for managing sync relationships. */
    @JSGlobal("Windows.ApplicationModel.UserDataAccounts.SystemAccess.UserDataAccountSystemAccessManager")
    @js.native
    abstract class UserDataAccountSystemAccessManager ()
      extends typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.UserDataAccountSystemAccessManager
    object UserDataAccountSystemAccessManager {
      
      /**
        * Asynchronously displays the system UI to manage the sync relationships for the specified accounts.
        * @param accounts The list of accounts to manage in the system UI.
        * @return Returns an updated list of accounts.
        */
      /* static member */
      @JSGlobal("Windows.ApplicationModel.UserDataAccounts.SystemAccess.UserDataAccountSystemAccessManager.addAndShowDeviceAccountsAsync")
      @js.native
      def addAndShowDeviceAccountsAsync(
        accounts: IIterable[
              typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountConfiguration
            ]
      ): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    }
  }
  
  /** Represents a user data account used to access email, contacts, calendars, and so on. */
  @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccount")
  @js.native
  abstract class UserDataAccount ()
    extends typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccount
  
  /** The type of user data content. */
  @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds")
  @js.native
  object UserDataAccountContentKinds extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds with Double
      ] = js.native
    
    /* 2 */ val appointment: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds.appointment with Double = js.native
    
    /* 1 */ val contact: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds.contact with Double = js.native
    
    /* 0 */ val email: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds.email with Double = js.native
  }
  
  /** Provides APIs to interact with the user’s data accounts including those implemented by the operating system. */
  @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountManager")
  @js.native
  abstract class UserDataAccountManager ()
    extends typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountManager
  object UserDataAccountManager {
    
    /**
      * Asynchronously returns the UserDataAccountStore from the system.
      * @param storeAccessType Specifies the access type, such as read-only for all accounts or read/write for the calling app's accounts.
      * @return Returns the UserDataAccountStore .
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountManager.requestStoreAsync")
    @js.native
    def requestStoreAsync(storeAccessType: UserDataAccountStoreAccessType): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStore] = js.native
    
    /**
      * This method shows the resolve message for an account error.
      * @param id The user data account ID.
      * @return An async action indicating success or failure.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountManager.showAccountErrorResolverAsync")
    @js.native
    def showAccountErrorResolverAsync(id: String): IPromiseWithIAsyncAction = js.native
    
    /**
      * This method shows the account settings.
      * @param id The user data account ID.
      * @return An async action indicating success or failure.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountManager.showAccountSettingsAsync")
    @js.native
    def showAccountSettingsAsync(id: String): IPromiseWithIAsyncAction = js.native
    
    /**
      * Shows the add account UI.
      * @param contentKinds The type of user data content.
      * @return Returns the newly added or already existing account.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountManager.showAddAccountAsync")
    @js.native
    def showAddAccountAsync(contentKinds: UserDataAccountContentKinds): IPromiseWithIAsyncOperation[String] = js.native
  }
  
  /** Specifies the rights granted to other apps for reading this UserDataAccount . */
  @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess")
  @js.native
  object UserDataAccountOtherAppReadAccess extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess with Double
      ] = js.native
    
    /* 1 */ val full: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess.full with Double = js.native
    
    /* 0 */ val systemOnly: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess.systemOnly with Double = js.native
  }
  
  /** Represents a data store that contains user accounts. */
  @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountStore")
  @js.native
  abstract class UserDataAccountStore ()
    extends typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStore
  
  /** Specifies the requested access type in a call to RequestStoreAsync . */
  @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType")
  @js.native
  object UserDataAccountStoreAccessType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType with Double
      ] = js.native
    
    /* 0 */ val allAccountsReadOnly: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType.allAccountsReadOnly with Double = js.native
    
    /* 1 */ val appAccountsReadWrite: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType.appAccountsReadWrite with Double = js.native
  }
}
