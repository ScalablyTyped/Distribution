package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType
import typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds
import typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess
import typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountConfiguration {
      
      /** Gets or sets the name that identifies the device account. */
      /* CompleteClass */
      var accountName: String = js.native
      
      /** Gets or sets a Boolean value indicating if calendar syncing is enabled. */
      /* CompleteClass */
      var calendarSyncEnabled: Boolean = js.native
      
      /** Gets or sets a Boolean value indicating if contacts syncing is enabled. */
      /* CompleteClass */
      var contactsSyncEnabled: Boolean = js.native
      
      /** Gets or sets the value that identifies the device account type. */
      /* CompleteClass */
      var deviceAccountTypeId: String = js.native
      
      /** Gets or sets the network domain of the device. */
      /* CompleteClass */
      var domain: String = js.native
      
      /** Gets or sets the email address of the current user. */
      /* CompleteClass */
      var emailAddress: String = js.native
      
      /** Gets or sets a Boolean value indicating if email syncing is enabled. */
      /* CompleteClass */
      var emailSyncEnabled: Boolean = js.native
      
      /** Gets or sets the incoming email server address. */
      /* CompleteClass */
      var incomingServerAddress: String = js.native
      
      /** Gets or sets the port number to use to connect to the incoming email server. */
      /* CompleteClass */
      var incomingServerPort: Double = js.native
      
      /** Gets or sets a Boolean value indicating if Secure Sockets Layer (SSL) should be used when connecting to the incoming email server. */
      /* CompleteClass */
      var incomingServerRequiresSsl: Boolean = js.native
      
      /** Gets or sets the username to use when connecting to the incoming email server. */
      /* CompleteClass */
      var incomingServerUsername: String = js.native
      
      /** Gets or sets the outgoing email server address. */
      /* CompleteClass */
      var outgoingServerAddress: String = js.native
      
      /** Gets or sets the port number to use to connect to the outgoing email server. */
      /* CompleteClass */
      var outgoingServerPort: Double = js.native
      
      /** Gets or sets a Boolean value indicating if Secure Sockets Layer (SSL) should be used when connecting to the outgoing email server. */
      /* CompleteClass */
      var outgoingServerRequiresSsl: Boolean = js.native
      
      /** Gets or sets the username to use when connecting to the outgoing email server. */
      /* CompleteClass */
      var outgoingServerUsername: String = js.native
      
      /** Gets or sets a value indicating the type of the server. */
      /* CompleteClass */
      var serverType: DeviceAccountServerType = js.native
    }
    
    /** Defines the server types for syncing. */
    @JSGlobal("Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType")
    @js.native
    object DeviceAccountServerType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType & Double
          ] = js.native
      
      /* 0 */ val exchange: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType.exchange & Double = js.native
      
      /* 2 */ val imap: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType.imap & Double = js.native
      
      /* 1 */ val pop: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType.pop & Double = js.native
    }
    
    /** Provides the ability to display the system UI for managing sync relationships. */
    @JSGlobal("Windows.ApplicationModel.UserDataAccounts.SystemAccess.UserDataAccountSystemAccessManager")
    @js.native
    abstract class UserDataAccountSystemAccessManager ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.UserDataAccountSystemAccessManager
    object UserDataAccountSystemAccessManager {
      
      @JSGlobal("Windows.ApplicationModel.UserDataAccounts.SystemAccess.UserDataAccountSystemAccessManager")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Asynchronously displays the system UI to manage the sync relationships for the specified accounts.
        * @param accounts The list of accounts to manage in the system UI.
        * @return Returns an updated list of accounts.
        */
      /* static member */
      inline def addAndShowDeviceAccountsAsync(
        accounts: IIterable[
              typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountConfiguration
            ]
      ): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("addAndShowDeviceAccountsAsync")(accounts.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[js.Any]]]
    }
  }
  
  /** Represents a user data account used to access email, contacts, calendars, and so on. */
  @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccount")
  @js.native
  abstract class UserDataAccount ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccount {
    
    /**
      * Asynchronously deletes all the contact, calendar and email data associated with the account.
      * @return An async action indicating success or failure.
      */
    /* CompleteClass */
    override def deleteAsync(): IPromiseWithIAsyncAction = js.native
    
    /** Gets the unique identifier for the type of the account. */
    /* CompleteClass */
    var deviceAccountTypeId: String = js.native
    
    /** Gets the enterprise identity associated with the user account. */
    /* CompleteClass */
    var enterpriseId: String = js.native
    
    /**
      * Returns a collection of AppointmentCalendar instances associated with the UserDataAccount .
      * @return A collection of AppointmentCalendar instances associated with the UserDataAccount .
      */
    /* CompleteClass */
    override def findAppointmentCalendarsAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    
    /**
      * Returns a collection of ContactAnnotationList instances associated with the UserDataAccount .
      * @return A collection of ContactAnnotationList instances associated with the UserDataAccount .
      */
    /* CompleteClass */
    override def findContactAnnotationListsAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    
    /**
      * Returns a collection of ContactList instances associated with the UserDataAccount .
      * @return A collection of ContactList instances associated with the UserDataAccount .
      */
    /* CompleteClass */
    override def findContactListsAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    
    /**
      * Returns a collection of EmailMailbox instances associated with the UserDataAccount .
      * @return A collection of EmailMailbox instances associated with the UserDataAccount .
      */
    /* CompleteClass */
    override def findEmailMailboxesAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    
    /** Gets the icon associated with the UserDataAccount . */
    /* CompleteClass */
    var icon: IRandomAccessStreamReference = js.native
    
    /** Gets a string that uniquely identifies the UserDataAccount on the local device. */
    /* CompleteClass */
    var id: String = js.native
    
    /** Gets a Boolean value indicating if the user account data is encrypted when the device becomes locked. */
    /* CompleteClass */
    var isProtectedUnderLock: Boolean = js.native
    
    /** Gets or sets a value indicating whether other apps on the device have read access to the UserDataAccount . */
    /* CompleteClass */
    var otherAppReadAccess: UserDataAccountOtherAppReadAccess = js.native
    
    /** Gets the unique identifier for the app package that created the UserDataAccount . */
    /* CompleteClass */
    var packageFamilyName: String = js.native
    
    /**
      * Asynchronously persists the UserDataAccount to the database.
      * @return Async action that indicates completion of the save operation.
      */
    /* CompleteClass */
    override def saveAsync(): IPromiseWithIAsyncAction = js.native
    
    /** Gets or sets a user name associated with the UserDataAccount that is suitable for displaying. */
    /* CompleteClass */
    var userDisplayName: String = js.native
  }
  
  /** The type of user data content. */
  @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds")
  @js.native
  object UserDataAccountContentKinds extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds & Double
      ] = js.native
    
    /* 2 */ val appointment: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds.appointment & Double = js.native
    
    /* 1 */ val contact: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds.contact & Double = js.native
    
    /* 0 */ val email: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds.email & Double = js.native
  }
  
  /** Provides APIs to interact with the user’s data accounts including those implemented by the operating system. */
  @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountManager")
  @js.native
  abstract class UserDataAccountManager ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountManager
  object UserDataAccountManager {
    
    @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Asynchronously returns the UserDataAccountStore from the system.
      * @param storeAccessType Specifies the access type, such as read-only for all accounts or read/write for the calling app's accounts.
      * @return Returns the UserDataAccountStore .
      */
    /* static member */
    inline def requestStoreAsync(storeAccessType: UserDataAccountStoreAccessType): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStore] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestStoreAsync")(storeAccessType.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStore]]
    
    /**
      * This method shows the resolve message for an account error.
      * @param id The user data account ID.
      * @return An async action indicating success or failure.
      */
    /* static member */
    inline def showAccountErrorResolverAsync(id: String): IPromiseWithIAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("showAccountErrorResolverAsync")(id.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncAction]
    
    /**
      * This method shows the account settings.
      * @param id The user data account ID.
      * @return An async action indicating success or failure.
      */
    /* static member */
    inline def showAccountSettingsAsync(id: String): IPromiseWithIAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("showAccountSettingsAsync")(id.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncAction]
    
    /**
      * Shows the add account UI.
      * @param contentKinds The type of user data content.
      * @return Returns the newly added or already existing account.
      */
    /* static member */
    inline def showAddAccountAsync(contentKinds: UserDataAccountContentKinds): IPromiseWithIAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("showAddAccountAsync")(contentKinds.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[String]]
  }
  
  /** Specifies the rights granted to other apps for reading this UserDataAccount . */
  @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess")
  @js.native
  object UserDataAccountOtherAppReadAccess extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess & Double
      ] = js.native
    
    /* 1 */ val full: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess.full & Double = js.native
    
    /* 0 */ val systemOnly: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess.systemOnly & Double = js.native
  }
  
  /** Represents a data store that contains user accounts. */
  @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountStore")
  @js.native
  abstract class UserDataAccountStore ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStore {
    
    /**
      * Asynchronously creates a user data account.
      * @param userDisplayName A string containing the user name that is suitable for display.
      * @return Returns the newly created UserDataAccount .
      */
    /* CompleteClass */
    override def createAccountAsync(userDisplayName: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccount] = js.native
    
    /**
      * Returns a collection of UserDataAccount objects from the store based on the UserDataAccountStoreAccessType value passed into RequestStoreAsync .
      * @return Returns the collection of user data accounts, scoped by access request.
      */
    /* CompleteClass */
    override def findAccountsAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = js.native
    
    /**
      * Asynchronously gets the specified account.
      * @param id The Id string identifying the account.
      * @return Returns the UserDataAccount identified by the id parameter.
      */
    /* CompleteClass */
    override def getAccountAsync(id: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccount] = js.native
  }
  
  /** Specifies the requested access type in a call to RequestStoreAsync . */
  @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType")
  @js.native
  object UserDataAccountStoreAccessType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType & Double
      ] = js.native
    
    /* 0 */ val allAccountsReadOnly: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType.allAccountsReadOnly & Double = js.native
    
    /* 1 */ val appAccountsReadWrite: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType.appAccountsReadWrite & Double = js.native
  }
}
