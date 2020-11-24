package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds
import typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains user data account information needed to access email, appointments, calendars, and so on. */
@JSGlobal("Windows.ApplicationModel.UserDataAccounts")
@js.native
object UserDataAccounts extends js.Object {
  
  /** Provides functionality for apps to invoke system-level UI to manage sync partnerships on the device. */
  @js.native
  object SystemAccess extends js.Object {
    
    /** Represents device settings for app sync relationships. */
    @js.native
    /** Initializes a new instance of the DeviceAccountConfiguration class. */
    class DeviceAccountConfiguration ()
      extends typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountConfiguration
    
    /** Defines the server types for syncing. */
    @js.native
    object DeviceAccountServerType extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType with Double
          ] = js.native
      
      /* 0 */ val exchange: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType.exchange with Double = js.native
      
      /* 2 */ val imap: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType.imap with Double = js.native
      
      /* 1 */ val pop: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType.pop with Double = js.native
    }
    
    /** Provides the ability to display the system UI for managing sync relationships. */
    @js.native
    abstract class UserDataAccountSystemAccessManager ()
      extends typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.UserDataAccountSystemAccessManager
    /* static members */
    @js.native
    object UserDataAccountSystemAccessManager extends js.Object {
      
      /**
        * Asynchronously displays the system UI to manage the sync relationships for the specified accounts.
        * @param accounts The list of accounts to manage in the system UI.
        * @return Returns an updated list of accounts.
        */
      def addAndShowDeviceAccountsAsync(
        accounts: IIterable[
              typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountConfiguration
            ]
      ): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    }
  }
  
  /** Represents a user data account used to access email, contacts, calendars, and so on. */
  @js.native
  abstract class UserDataAccount ()
    extends typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccount
  
  /** The type of user data content. */
  @js.native
  object UserDataAccountContentKinds extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds with Double
      ] = js.native
    
    /* 2 */ val appointment: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds.appointment with Double = js.native
    
    /* 1 */ val contact: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds.contact with Double = js.native
    
    /* 0 */ val email: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds.email with Double = js.native
  }
  
  /** Provides APIs to interact with the user’s data accounts including those implemented by the operating system. */
  @js.native
  abstract class UserDataAccountManager ()
    extends typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountManager
  /* static members */
  @js.native
  object UserDataAccountManager extends js.Object {
    
    /**
      * Asynchronously returns the UserDataAccountStore from the system.
      * @param storeAccessType Specifies the access type, such as read-only for all accounts or read/write for the calling app's accounts.
      * @return Returns the UserDataAccountStore .
      */
    def requestStoreAsync(storeAccessType: UserDataAccountStoreAccessType): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStore] = js.native
    
    /**
      * This method shows the resolve message for an account error.
      * @param id The user data account ID.
      * @return An async action indicating success or failure.
      */
    def showAccountErrorResolverAsync(id: String): IPromiseWithIAsyncAction = js.native
    
    /**
      * This method shows the account settings.
      * @param id The user data account ID.
      * @return An async action indicating success or failure.
      */
    def showAccountSettingsAsync(id: String): IPromiseWithIAsyncAction = js.native
    
    /**
      * Shows the add account UI.
      * @param contentKinds The type of user data content.
      * @return Returns the newly added or already existing account.
      */
    def showAddAccountAsync(contentKinds: UserDataAccountContentKinds): IPromiseWithIAsyncOperation[String] = js.native
  }
  
  /** Specifies the rights granted to other apps for reading this UserDataAccount . */
  @js.native
  object UserDataAccountOtherAppReadAccess extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess with Double
      ] = js.native
    
    /* 1 */ val full: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess.full with Double = js.native
    
    /* 0 */ val systemOnly: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess.systemOnly with Double = js.native
  }
  
  /** Represents a data store that contains user accounts. */
  @js.native
  abstract class UserDataAccountStore ()
    extends typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStore
  
  /** Specifies the requested access type in a call to RequestStoreAsync . */
  @js.native
  object UserDataAccountStoreAccessType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType with Double
      ] = js.native
    
    /* 0 */ val allAccountsReadOnly: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType.allAccountsReadOnly with Double = js.native
    
    /* 1 */ val appAccountsReadWrite: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType.appAccountsReadWrite with Double = js.native
  }
}
