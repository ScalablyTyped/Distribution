package typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
