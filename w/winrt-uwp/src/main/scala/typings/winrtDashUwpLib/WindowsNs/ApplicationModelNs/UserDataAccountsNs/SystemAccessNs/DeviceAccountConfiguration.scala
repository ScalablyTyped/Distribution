package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.SystemAccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents device settings for app sync relationships. */
@JSGlobal("Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountConfiguration")
@js.native
/** Initializes a new instance of the DeviceAccountConfiguration class. */
class DeviceAccountConfiguration () extends js.Object {
  /** Gets or sets the name that identifies the device account. */
  var accountName: java.lang.String = js.native
  /** Gets or sets a Boolean value indicating if calendar syncing is enabled. */
  var calendarSyncEnabled: scala.Boolean = js.native
  /** Gets or sets a Boolean value indicating if contacts syncing is enabled. */
  var contactsSyncEnabled: scala.Boolean = js.native
  /** Gets or sets the value that identifies the device account type. */
  var deviceAccountTypeId: java.lang.String = js.native
  /** Gets or sets the network domain of the device. */
  var domain: java.lang.String = js.native
  /** Gets or sets the email address of the current user. */
  var emailAddress: java.lang.String = js.native
  /** Gets or sets a Boolean value indicating if email syncing is enabled. */
  var emailSyncEnabled: scala.Boolean = js.native
  /** Gets or sets the incoming email server address. */
  var incomingServerAddress: java.lang.String = js.native
  /** Gets or sets the port number to use to connect to the incoming email server. */
  var incomingServerPort: scala.Double = js.native
  /** Gets or sets a Boolean value indicating if Secure Sockets Layer (SSL) should be used when connecting to the incoming email server. */
  var incomingServerRequiresSsl: scala.Boolean = js.native
  /** Gets or sets the username to use when connecting to the incoming email server. */
  var incomingServerUsername: java.lang.String = js.native
  /** Gets or sets the outgoing email server address. */
  var outgoingServerAddress: java.lang.String = js.native
  /** Gets or sets the port number to use to connect to the outgoing email server. */
  var outgoingServerPort: scala.Double = js.native
  /** Gets or sets a Boolean value indicating if Secure Sockets Layer (SSL) should be used when connecting to the outgoing email server. */
  var outgoingServerRequiresSsl: scala.Boolean = js.native
  /** Gets or sets the username to use when connecting to the outgoing email server. */
  var outgoingServerUsername: java.lang.String = js.native
  /** Gets or sets a value indicating the type of the server. */
  var serverType: DeviceAccountServerType = js.native
}

