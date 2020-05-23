package typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd

import typings.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates detailed information about the result of an attempt to register a service instance using DNS-SD. */
trait DnssdRegistrationResult extends js.Object {
  /** Indicates whether the instance name was changed in the course of the registration process. */
  var hasInstanceNameChanged: Boolean
  /** The IP address of the successfully-created service instance. */
  var ipAddress: HostName
  /** An enumeration value indicating the result of a service instance registration attempt. */
  var status: DnssdRegistrationStatus
}

object DnssdRegistrationResult {
  @scala.inline
  def apply(hasInstanceNameChanged: Boolean, ipAddress: HostName, status: DnssdRegistrationStatus): DnssdRegistrationResult = {
    val __obj = js.Dynamic.literal(hasInstanceNameChanged = hasInstanceNameChanged.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnssdRegistrationResult]
  }
}

