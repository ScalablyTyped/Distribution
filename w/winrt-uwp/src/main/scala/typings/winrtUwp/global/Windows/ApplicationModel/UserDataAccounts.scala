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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains user data account information needed to access email, appointments, calendars, and so on. */
@JSGlobal("Windows.ApplicationModel.UserDataAccounts")
@js.native
object UserDataAccounts extends js.Object {
  /** Represents a user data account used to access email, contacts, calendars, and so on. */
  @js.native
  abstract class UserDataAccount ()
    extends typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccount {
    /** Gets the unique identifier for the type of the account. */
    /* CompleteClass */
    override var deviceAccountTypeId: String = js.native
    /** Gets the enterprise identity associated with the user account. */
    /* CompleteClass */
    override var enterpriseId: String = js.native
    /** Gets the icon associated with the UserDataAccount . */
    /* CompleteClass */
    override var icon: IRandomAccessStreamReference = js.native
    /** Gets a string that uniquely identifies the UserDataAccount on the local device. */
    /* CompleteClass */
    override var id: String = js.native
    /** Gets a Boolean value indicating if the user account data is encrypted when the device becomes locked. */
    /* CompleteClass */
    override var isProtectedUnderLock: Boolean = js.native
    /** Gets or sets a value indicating whether other apps on the device have read access to the UserDataAccount . */
    /* CompleteClass */
    override var otherAppReadAccess: UserDataAccountOtherAppReadAccess = js.native
    /** Gets the unique identifier for the app package that created the UserDataAccount . */
    /* CompleteClass */
    override var packageFamilyName: String = js.native
    /** Gets or sets a user name associated with the UserDataAccount that is suitable for displaying. */
    /* CompleteClass */
    override var userDisplayName: String = js.native
    /**
      * Asynchronously deletes all the contact, calendar and email data associated with the account.
      * @return An async action indicating success or failure.
      */
    /* CompleteClass */
    override def deleteAsync(): IPromiseWithIAsyncAction = js.native
    /**
      * Returns a collection of AppointmentCalendar instances associated with the UserDataAccount .
      * @return A collection of AppointmentCalendar instances associated with the UserDataAccount .
      */
    /* CompleteClass */
    override def findAppointmentCalendarsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Returns a collection of ContactAnnotationList instances associated with the UserDataAccount .
      * @return A collection of ContactAnnotationList instances associated with the UserDataAccount .
      */
    /* CompleteClass */
    override def findContactAnnotationListsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Returns a collection of ContactList instances associated with the UserDataAccount .
      * @return A collection of ContactList instances associated with the UserDataAccount .
      */
    /* CompleteClass */
    override def findContactListsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Returns a collection of EmailMailbox instances associated with the UserDataAccount .
      * @return A collection of EmailMailbox instances associated with the UserDataAccount .
      */
    /* CompleteClass */
    override def findEmailMailboxesAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Asynchronously persists the UserDataAccount to the database.
      * @return Async action that indicates completion of the save operation.
      */
    /* CompleteClass */
    override def saveAsync(): IPromiseWithIAsyncAction = js.native
  }
  
  /** Provides APIs to interact with the user’s data accounts including those implemented by the operating system. */
  @js.native
  abstract class UserDataAccountManager ()
    extends typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountManager
  
  /** Represents a data store that contains user accounts. */
  @js.native
  abstract class UserDataAccountStore ()
    extends typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStore {
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
    override def findAccountsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Asynchronously gets the specified account.
      * @param id The Id string identifying the account.
      * @return Returns the UserDataAccount identified by the id parameter.
      */
    /* CompleteClass */
    override def getAccountAsync(id: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccount] = js.native
  }
  
  /** Provides functionality for apps to invoke system-level UI to manage sync partnerships on the device. */
  @js.native
  object SystemAccess extends js.Object {
    /** Represents device settings for app sync relationships. */
    @js.native
    /** Initializes a new instance of the DeviceAccountConfiguration class. */
    class DeviceAccountConfiguration ()
      extends typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountConfiguration {
      /** Gets or sets the name that identifies the device account. */
      /* CompleteClass */
      override var accountName: String = js.native
      /** Gets or sets a Boolean value indicating if calendar syncing is enabled. */
      /* CompleteClass */
      override var calendarSyncEnabled: Boolean = js.native
      /** Gets or sets a Boolean value indicating if contacts syncing is enabled. */
      /* CompleteClass */
      override var contactsSyncEnabled: Boolean = js.native
      /** Gets or sets the value that identifies the device account type. */
      /* CompleteClass */
      override var deviceAccountTypeId: String = js.native
      /** Gets or sets the network domain of the device. */
      /* CompleteClass */
      override var domain: String = js.native
      /** Gets or sets the email address of the current user. */
      /* CompleteClass */
      override var emailAddress: String = js.native
      /** Gets or sets a Boolean value indicating if email syncing is enabled. */
      /* CompleteClass */
      override var emailSyncEnabled: Boolean = js.native
      /** Gets or sets the incoming email server address. */
      /* CompleteClass */
      override var incomingServerAddress: String = js.native
      /** Gets or sets the port number to use to connect to the incoming email server. */
      /* CompleteClass */
      override var incomingServerPort: Double = js.native
      /** Gets or sets a Boolean value indicating if Secure Sockets Layer (SSL) should be used when connecting to the incoming email server. */
      /* CompleteClass */
      override var incomingServerRequiresSsl: Boolean = js.native
      /** Gets or sets the username to use when connecting to the incoming email server. */
      /* CompleteClass */
      override var incomingServerUsername: String = js.native
      /** Gets or sets the outgoing email server address. */
      /* CompleteClass */
      override var outgoingServerAddress: String = js.native
      /** Gets or sets the port number to use to connect to the outgoing email server. */
      /* CompleteClass */
      override var outgoingServerPort: Double = js.native
      /** Gets or sets a Boolean value indicating if Secure Sockets Layer (SSL) should be used when connecting to the outgoing email server. */
      /* CompleteClass */
      override var outgoingServerRequiresSsl: Boolean = js.native
      /** Gets or sets the username to use when connecting to the outgoing email server. */
      /* CompleteClass */
      override var outgoingServerUsername: String = js.native
      /** Gets or sets a value indicating the type of the server. */
      /* CompleteClass */
      override var serverType: DeviceAccountServerType = js.native
    }
    
    /** Provides the ability to display the system UI for managing sync relationships. */
    @js.native
    abstract class UserDataAccountSystemAccessManager ()
      extends typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.UserDataAccountSystemAccessManager
    
    /** Defines the server types for syncing. */
    @js.native
    object DeviceAccountServerType extends js.Object {
      /* 0 */ val exchange: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType.exchange with Double = js.native
      /* 2 */ val imap: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType.imap with Double = js.native
      /* 1 */ val pop: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType.pop with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType with Double
          ] = js.native
    }
    
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
  
  /** The type of user data content. */
  @js.native
  object UserDataAccountContentKinds extends js.Object {
    /* 2 */ val appointment: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds.appointment with Double = js.native
    /* 1 */ val contact: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds.contact with Double = js.native
    /* 0 */ val email: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds.email with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds with Double
      ] = js.native
  }
  
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
    /* 1 */ val full: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess.full with Double = js.native
    /* 0 */ val systemOnly: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess.systemOnly with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess with Double
      ] = js.native
  }
  
  /** Specifies the requested access type in a call to RequestStoreAsync . */
  @js.native
  object UserDataAccountStoreAccessType extends js.Object {
    /* 0 */ val allAccountsReadOnly: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType.allAccountsReadOnly with Double = js.native
    /* 1 */ val appAccountsReadWrite: typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType.appAccountsReadWrite with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType with Double
      ] = js.native
  }
  
}

