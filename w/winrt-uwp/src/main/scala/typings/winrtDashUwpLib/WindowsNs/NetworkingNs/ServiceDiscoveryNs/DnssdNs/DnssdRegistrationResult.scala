package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates detailed information about the result of an attempt to register a service instance using DNS-SD. */
@JSGlobal("Windows.Networking.ServiceDiscovery.Dnssd.DnssdRegistrationResult")
@js.native
class DnssdRegistrationResult () extends js.Object {
  /** Indicates whether the instance name was changed in the course of the registration process. */
  var hasInstanceNameChanged: scala.Boolean = js.native
  /** The IP address of the successfully-created service instance. */
  var ipAddress: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName = js.native
  /** An enumeration value indicating the result of a service instance registration attempt. */
  var status: DnssdRegistrationStatus = js.native
}

