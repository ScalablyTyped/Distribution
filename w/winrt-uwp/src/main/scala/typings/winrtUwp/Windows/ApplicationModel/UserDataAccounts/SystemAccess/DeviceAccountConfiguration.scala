package typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents device settings for app sync relationships. */
trait DeviceAccountConfiguration extends js.Object {
  /** Gets or sets the name that identifies the device account. */
  var accountName: String
  /** Gets or sets a Boolean value indicating if calendar syncing is enabled. */
  var calendarSyncEnabled: Boolean
  /** Gets or sets a Boolean value indicating if contacts syncing is enabled. */
  var contactsSyncEnabled: Boolean
  /** Gets or sets the value that identifies the device account type. */
  var deviceAccountTypeId: String
  /** Gets or sets the network domain of the device. */
  var domain: String
  /** Gets or sets the email address of the current user. */
  var emailAddress: String
  /** Gets or sets a Boolean value indicating if email syncing is enabled. */
  var emailSyncEnabled: Boolean
  /** Gets or sets the incoming email server address. */
  var incomingServerAddress: String
  /** Gets or sets the port number to use to connect to the incoming email server. */
  var incomingServerPort: Double
  /** Gets or sets a Boolean value indicating if Secure Sockets Layer (SSL) should be used when connecting to the incoming email server. */
  var incomingServerRequiresSsl: Boolean
  /** Gets or sets the username to use when connecting to the incoming email server. */
  var incomingServerUsername: String
  /** Gets or sets the outgoing email server address. */
  var outgoingServerAddress: String
  /** Gets or sets the port number to use to connect to the outgoing email server. */
  var outgoingServerPort: Double
  /** Gets or sets a Boolean value indicating if Secure Sockets Layer (SSL) should be used when connecting to the outgoing email server. */
  var outgoingServerRequiresSsl: Boolean
  /** Gets or sets the username to use when connecting to the outgoing email server. */
  var outgoingServerUsername: String
  /** Gets or sets a value indicating the type of the server. */
  var serverType: DeviceAccountServerType
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
}

