package typings.winrtDashUwp.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DnssdRegistrationStatus extends js.Object

/** Values representing the status of a DNS-SD registration attempt. */
@JSGlobal("Windows.Networking.ServiceDiscovery.Dnssd.DnssdRegistrationStatus")
@js.native
object DnssdRegistrationStatus extends js.Object {
  /** The service was not registered because the service name provided is not valid. */
  @js.native
  sealed trait invalidServiceName extends DnssdRegistrationStatus
  
  /** The service was not registered because security settings did not allow it. */
  @js.native
  sealed trait securityError extends DnssdRegistrationStatus
  
  /** The service was not registered because of an error on the DNS server. */
  @js.native
  sealed trait serverError extends DnssdRegistrationStatus
  
  /** The service has been registered successfully. */
  @js.native
  sealed trait success extends DnssdRegistrationStatus
  
  /* 1 */ val invalidServiceName: typings.winrtDashUwp.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdRegistrationStatus.invalidServiceName with Double = js.native
  /* 3 */ val securityError: typings.winrtDashUwp.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdRegistrationStatus.securityError with Double = js.native
  /* 2 */ val serverError: typings.winrtDashUwp.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdRegistrationStatus.serverError with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdRegistrationStatus.success with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DnssdRegistrationStatus with Double] = js.native
}

