package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.UserDataAccountsNs.SystemAccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents device settings for app sync relationships. */
@JSGlobal("Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountConfiguration")
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

