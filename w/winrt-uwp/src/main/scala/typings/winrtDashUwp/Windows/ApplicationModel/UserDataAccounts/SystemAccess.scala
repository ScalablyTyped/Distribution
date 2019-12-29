package typings.winrtDashUwp.Windows.ApplicationModel.UserDataAccounts

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Foundation.Collections.IIterable
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for apps to invoke system-level UI to manage sync partnerships on the device. */
@JSGlobal("Windows.ApplicationModel.UserDataAccounts.SystemAccess")
@js.native
object SystemAccess extends js.Object {
  /** Represents device settings for app sync relationships. */
  @js.native
  /** Initializes a new instance of the DeviceAccountConfiguration class. */
  class DeviceAccountConfiguration () extends js.Object {
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
  
  @js.native
  sealed trait DeviceAccountServerType extends js.Object
  
  /** Provides the ability to display the system UI for managing sync relationships. */
  @js.native
  abstract class UserDataAccountSystemAccessManager () extends js.Object
  
  /** Defines the server types for syncing. */
  @js.native
  object DeviceAccountServerType extends js.Object {
    /** Exchange server */
    @js.native
    sealed trait exchange extends DeviceAccountServerType
    
    /** IMAP server */
    @js.native
    sealed trait imap extends DeviceAccountServerType
    
    /** POP server */
    @js.native
    sealed trait pop extends DeviceAccountServerType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DeviceAccountServerType with Double] = js.native
    /* 0 */ @js.native
    object exchange extends TopLevel[exchange with Double]
    
    /* 2 */ @js.native
    object imap extends TopLevel[imap with Double]
    
    /* 1 */ @js.native
    object pop extends TopLevel[pop with Double]
    
  }
  
  /* static members */
  @js.native
  object UserDataAccountSystemAccessManager extends js.Object {
    /**
      * Asynchronously displays the system UI to manage the sync relationships for the specified accounts.
      * @param accounts The list of accounts to manage in the system UI.
      * @return Returns an updated list of accounts.
      */
    def addAndShowDeviceAccountsAsync(accounts: IIterable[DeviceAccountConfiguration]): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  }
  
}

