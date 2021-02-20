package typings.winrtUwp.Windows.ApplicationModel

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains user data account information needed to access email, appointments, calendars, and so on. */
object UserDataAccounts {
  
  /** Provides functionality for apps to invoke system-level UI to manage sync partnerships on the device. */
  object SystemAccess {
    
    @js.native
    sealed trait DeviceAccountServerType extends StObject
    /** Defines the server types for syncing. */
    @JSGlobal("Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType")
    @js.native
    object DeviceAccountServerType extends StObject {
      
      /** Exchange server */
      @js.native
      sealed trait exchange extends DeviceAccountServerType
      
      /** IMAP server */
      @js.native
      sealed trait imap extends DeviceAccountServerType
      
      /** POP server */
      @js.native
      sealed trait pop extends DeviceAccountServerType
    }
    
    /** Represents device settings for app sync relationships. */
    @js.native
    trait DeviceAccountConfiguration extends StObject {
      
      /** Gets or sets the name that identifies the device account. */
      var accountName: String = js.native
      
      /** Gets or sets a Boolean value indicating if calendar syncing is enabled. */
      var calendarSyncEnabled: Boolean = js.native
      
      /** Gets or sets a Boolean value indicating if contacts syncing is enabled. */
      var contactsSyncEnabled: Boolean = js.native
      
      /** Gets or sets the value that identifies the device account type. */
      var deviceAccountTypeId: String = js.native
      
      /** Gets or sets the network domain of the device. */
      var domain: String = js.native
      
      /** Gets or sets the email address of the current user. */
      var emailAddress: String = js.native
      
      /** Gets or sets a Boolean value indicating if email syncing is enabled. */
      var emailSyncEnabled: Boolean = js.native
      
      /** Gets or sets the incoming email server address. */
      var incomingServerAddress: String = js.native
      
      /** Gets or sets the port number to use to connect to the incoming email server. */
      var incomingServerPort: Double = js.native
      
      /** Gets or sets a Boolean value indicating if Secure Sockets Layer (SSL) should be used when connecting to the incoming email server. */
      var incomingServerRequiresSsl: Boolean = js.native
      
      /** Gets or sets the username to use when connecting to the incoming email server. */
      var incomingServerUsername: String = js.native
      
      /** Gets or sets the outgoing email server address. */
      var outgoingServerAddress: String = js.native
      
      /** Gets or sets the port number to use to connect to the outgoing email server. */
      var outgoingServerPort: Double = js.native
      
      /** Gets or sets a Boolean value indicating if Secure Sockets Layer (SSL) should be used when connecting to the outgoing email server. */
      var outgoingServerRequiresSsl: Boolean = js.native
      
      /** Gets or sets the username to use when connecting to the outgoing email server. */
      var outgoingServerUsername: String = js.native
      
      /** Gets or sets a value indicating the type of the server. */
      var serverType: DeviceAccountServerType = js.native
    }
    object DeviceAccountConfiguration {
      
      @scala.inline
      def apply(
        accountName: String,
        calendarSyncEnabled: Boolean,
        contactsSyncEnabled: Boolean,
        deviceAccountTypeId: String,
        domain: String,
        emailAddress: String,
        emailSyncEnabled: Boolean,
        incomingServerAddress: String,
        incomingServerPort: Double,
        incomingServerRequiresSsl: Boolean,
        incomingServerUsername: String,
        outgoingServerAddress: String,
        outgoingServerPort: Double,
        outgoingServerRequiresSsl: Boolean,
        outgoingServerUsername: String,
        serverType: DeviceAccountServerType
      ): DeviceAccountConfiguration = {
        val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], calendarSyncEnabled = calendarSyncEnabled.asInstanceOf[js.Any], contactsSyncEnabled = contactsSyncEnabled.asInstanceOf[js.Any], deviceAccountTypeId = deviceAccountTypeId.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], emailSyncEnabled = emailSyncEnabled.asInstanceOf[js.Any], incomingServerAddress = incomingServerAddress.asInstanceOf[js.Any], incomingServerPort = incomingServerPort.asInstanceOf[js.Any], incomingServerRequiresSsl = incomingServerRequiresSsl.asInstanceOf[js.Any], incomingServerUsername = incomingServerUsername.asInstanceOf[js.Any], outgoingServerAddress = outgoingServerAddress.asInstanceOf[js.Any], outgoingServerPort = outgoingServerPort.asInstanceOf[js.Any], outgoingServerRequiresSsl = outgoingServerRequiresSsl.asInstanceOf[js.Any], outgoingServerUsername = outgoingServerUsername.asInstanceOf[js.Any], serverType = serverType.asInstanceOf[js.Any])
        __obj.asInstanceOf[DeviceAccountConfiguration]
      }
      
      @scala.inline
      implicit class DeviceAccountConfigurationMutableBuilder[Self <: DeviceAccountConfiguration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCalendarSyncEnabled(value: Boolean): Self = StObject.set(x, "calendarSyncEnabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContactsSyncEnabled(value: Boolean): Self = StObject.set(x, "contactsSyncEnabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeviceAccountTypeId(value: String): Self = StObject.set(x, "deviceAccountTypeId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmailSyncEnabled(value: Boolean): Self = StObject.set(x, "emailSyncEnabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncomingServerAddress(value: String): Self = StObject.set(x, "incomingServerAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncomingServerPort(value: Double): Self = StObject.set(x, "incomingServerPort", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncomingServerRequiresSsl(value: Boolean): Self = StObject.set(x, "incomingServerRequiresSsl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncomingServerUsername(value: String): Self = StObject.set(x, "incomingServerUsername", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutgoingServerAddress(value: String): Self = StObject.set(x, "outgoingServerAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutgoingServerPort(value: Double): Self = StObject.set(x, "outgoingServerPort", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutgoingServerRequiresSsl(value: Boolean): Self = StObject.set(x, "outgoingServerRequiresSsl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutgoingServerUsername(value: String): Self = StObject.set(x, "outgoingServerUsername", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServerType(value: DeviceAccountServerType): Self = StObject.set(x, "serverType", value.asInstanceOf[js.Any])
      }
    }
    
    /** Provides the ability to display the system UI for managing sync relationships. */
    @js.native
    trait UserDataAccountSystemAccessManager extends StObject
  }
  
  @js.native
  sealed trait UserDataAccountContentKinds extends StObject
  /** The type of user data content. */
  @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds")
  @js.native
  object UserDataAccountContentKinds extends StObject {
    
    /** Appointment data content. */
    @js.native
    sealed trait appointment extends UserDataAccountContentKinds
    
    /** Contact data content. */
    @js.native
    sealed trait contact extends UserDataAccountContentKinds
    
    /** Email data content. */
    @js.native
    sealed trait email extends UserDataAccountContentKinds
  }
  
  @js.native
  sealed trait UserDataAccountOtherAppReadAccess extends StObject
  /** Specifies the rights granted to other apps for reading this UserDataAccount . */
  @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountOtherAppReadAccess")
  @js.native
  object UserDataAccountOtherAppReadAccess extends StObject {
    
    /** Other apps on the device can read all properties of this UserDataAccount . */
    @js.native
    sealed trait full extends UserDataAccountOtherAppReadAccess
    
    /** Only the operating system can read data from this UserDataAccount . */
    @js.native
    sealed trait systemOnly extends UserDataAccountOtherAppReadAccess
  }
  
  @js.native
  sealed trait UserDataAccountStoreAccessType extends StObject
  /** Specifies the requested access type in a call to RequestStoreAsync . */
  @JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType")
  @js.native
  object UserDataAccountStoreAccessType extends StObject {
    
    /** Read-only access to app user data accounts and system user data accounts. */
    @js.native
    sealed trait allAccountsReadOnly extends UserDataAccountStoreAccessType
    
    /** Read/write access to the current app's user data accounts. */
    @js.native
    sealed trait appAccountsReadWrite extends UserDataAccountStoreAccessType
  }
  
  /** Represents a user data account used to access email, contacts, calendars, and so on. */
  @js.native
  trait UserDataAccount extends StObject {
    
    /**
      * Asynchronously deletes all the contact, calendar and email data associated with the account.
      * @return An async action indicating success or failure.
      */
    def deleteAsync(): IPromiseWithIAsyncAction = js.native
    
    /** Gets the unique identifier for the type of the account. */
    var deviceAccountTypeId: String = js.native
    
    /** Gets the enterprise identity associated with the user account. */
    var enterpriseId: String = js.native
    
    /**
      * Returns a collection of AppointmentCalendar instances associated with the UserDataAccount .
      * @return A collection of AppointmentCalendar instances associated with the UserDataAccount .
      */
    def findAppointmentCalendarsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Returns a collection of ContactAnnotationList instances associated with the UserDataAccount .
      * @return A collection of ContactAnnotationList instances associated with the UserDataAccount .
      */
    def findContactAnnotationListsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Returns a collection of ContactList instances associated with the UserDataAccount .
      * @return A collection of ContactList instances associated with the UserDataAccount .
      */
    def findContactListsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Returns a collection of EmailMailbox instances associated with the UserDataAccount .
      * @return A collection of EmailMailbox instances associated with the UserDataAccount .
      */
    def findEmailMailboxesAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /** Gets the icon associated with the UserDataAccount . */
    var icon: IRandomAccessStreamReference = js.native
    
    /** Gets a string that uniquely identifies the UserDataAccount on the local device. */
    var id: String = js.native
    
    /** Gets a Boolean value indicating if the user account data is encrypted when the device becomes locked. */
    var isProtectedUnderLock: Boolean = js.native
    
    /** Gets or sets a value indicating whether other apps on the device have read access to the UserDataAccount . */
    var otherAppReadAccess: UserDataAccountOtherAppReadAccess = js.native
    
    /** Gets the unique identifier for the app package that created the UserDataAccount . */
    var packageFamilyName: String = js.native
    
    /**
      * Asynchronously persists the UserDataAccount to the database.
      * @return Async action that indicates completion of the save operation.
      */
    def saveAsync(): IPromiseWithIAsyncAction = js.native
    
    /** Gets or sets a user name associated with the UserDataAccount that is suitable for displaying. */
    var userDisplayName: String = js.native
  }
  object UserDataAccount {
    
    @scala.inline
    def apply(
      deleteAsync: () => IPromiseWithIAsyncAction,
      deviceAccountTypeId: String,
      enterpriseId: String,
      findAppointmentCalendarsAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]],
      findContactAnnotationListsAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]],
      findContactListsAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]],
      findEmailMailboxesAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]],
      icon: IRandomAccessStreamReference,
      id: String,
      isProtectedUnderLock: Boolean,
      otherAppReadAccess: UserDataAccountOtherAppReadAccess,
      packageFamilyName: String,
      saveAsync: () => IPromiseWithIAsyncAction,
      userDisplayName: String
    ): UserDataAccount = {
      val __obj = js.Dynamic.literal(deleteAsync = js.Any.fromFunction0(deleteAsync), deviceAccountTypeId = deviceAccountTypeId.asInstanceOf[js.Any], enterpriseId = enterpriseId.asInstanceOf[js.Any], findAppointmentCalendarsAsync = js.Any.fromFunction0(findAppointmentCalendarsAsync), findContactAnnotationListsAsync = js.Any.fromFunction0(findContactAnnotationListsAsync), findContactListsAsync = js.Any.fromFunction0(findContactListsAsync), findEmailMailboxesAsync = js.Any.fromFunction0(findEmailMailboxesAsync), icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isProtectedUnderLock = isProtectedUnderLock.asInstanceOf[js.Any], otherAppReadAccess = otherAppReadAccess.asInstanceOf[js.Any], packageFamilyName = packageFamilyName.asInstanceOf[js.Any], saveAsync = js.Any.fromFunction0(saveAsync), userDisplayName = userDisplayName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserDataAccount]
    }
    
    @scala.inline
    implicit class UserDataAccountMutableBuilder[Self <: UserDataAccount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteAsync(value: () => IPromiseWithIAsyncAction): Self = StObject.set(x, "deleteAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeviceAccountTypeId(value: String): Self = StObject.set(x, "deviceAccountTypeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindAppointmentCalendarsAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = StObject.set(x, "findAppointmentCalendarsAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFindContactAnnotationListsAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = StObject.set(x, "findContactAnnotationListsAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFindContactListsAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = StObject.set(x, "findContactListsAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFindEmailMailboxesAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = StObject.set(x, "findEmailMailboxesAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIcon(value: IRandomAccessStreamReference): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsProtectedUnderLock(value: Boolean): Self = StObject.set(x, "isProtectedUnderLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherAppReadAccess(value: UserDataAccountOtherAppReadAccess): Self = StObject.set(x, "otherAppReadAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageFamilyName(value: String): Self = StObject.set(x, "packageFamilyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveAsync(value: () => IPromiseWithIAsyncAction): Self = StObject.set(x, "saveAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUserDisplayName(value: String): Self = StObject.set(x, "userDisplayName", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides APIs to interact with the user’s data accounts including those implemented by the operating system. */
  @js.native
  trait UserDataAccountManager extends StObject
  
  /** Represents a data store that contains user accounts. */
  @js.native
  trait UserDataAccountStore extends StObject {
    
    /**
      * Asynchronously creates a user data account.
      * @param userDisplayName A string containing the user name that is suitable for display.
      * @return Returns the newly created UserDataAccount .
      */
    def createAccountAsync(userDisplayName: String): IPromiseWithIAsyncOperation[UserDataAccount] = js.native
    
    /**
      * Returns a collection of UserDataAccount objects from the store based on the UserDataAccountStoreAccessType value passed into RequestStoreAsync .
      * @return Returns the collection of user data accounts, scoped by access request.
      */
    def findAccountsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Asynchronously gets the specified account.
      * @param id The Id string identifying the account.
      * @return Returns the UserDataAccount identified by the id parameter.
      */
    def getAccountAsync(id: String): IPromiseWithIAsyncOperation[UserDataAccount] = js.native
  }
  object UserDataAccountStore {
    
    @scala.inline
    def apply(
      createAccountAsync: String => IPromiseWithIAsyncOperation[UserDataAccount],
      findAccountsAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]],
      getAccountAsync: String => IPromiseWithIAsyncOperation[UserDataAccount]
    ): UserDataAccountStore = {
      val __obj = js.Dynamic.literal(createAccountAsync = js.Any.fromFunction1(createAccountAsync), findAccountsAsync = js.Any.fromFunction0(findAccountsAsync), getAccountAsync = js.Any.fromFunction1(getAccountAsync))
      __obj.asInstanceOf[UserDataAccountStore]
    }
    
    @scala.inline
    implicit class UserDataAccountStoreMutableBuilder[Self <: UserDataAccountStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateAccountAsync(value: String => IPromiseWithIAsyncOperation[UserDataAccount]): Self = StObject.set(x, "createAccountAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFindAccountsAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = StObject.set(x, "findAccountsAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAccountAsync(value: String => IPromiseWithIAsyncOperation[UserDataAccount]): Self = StObject.set(x, "getAccountAsync", js.Any.fromFunction1(value))
    }
  }
}
