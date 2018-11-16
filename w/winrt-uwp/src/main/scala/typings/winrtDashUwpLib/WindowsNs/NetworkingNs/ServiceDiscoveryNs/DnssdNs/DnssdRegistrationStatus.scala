package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs

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
  sealed trait invalidServiceName
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdRegistrationStatus
  
  /** The service was not registered because security settings did not allow it. */
  @js.native
  sealed trait securityError
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdRegistrationStatus
  
  /** The service was not registered because of an error on the DNS server. */
  @js.native
  sealed trait serverError
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdRegistrationStatus
  
  /** The service has been registered successfully. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdRegistrationStatus
  
  val invalidServiceName: invalidServiceName with java.lang.String = js.native
  val securityError: securityError with java.lang.String = js.native
  val serverError: serverError with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdRegistrationStatus with java.lang.String
  ] = js.native
}

