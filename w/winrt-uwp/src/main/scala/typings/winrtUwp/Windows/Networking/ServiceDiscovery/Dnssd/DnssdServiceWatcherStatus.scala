package typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DnssdServiceWatcherStatus extends js.Object
/** Values representing the status of a DnssdServiceWatcher. */
@JSGlobal("Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceWatcherStatus")
@js.native
object DnssdServiceWatcherStatus extends js.Object {
  
  /** The watcher has been aborted in the process of enumerating service instances. */
  @js.native
  sealed trait aborted extends DnssdServiceWatcherStatus
  
  /** The watcher has been created. */
  @js.native
  sealed trait created extends DnssdServiceWatcherStatus
  
  /** The watcher has finished enumerating service instances. */
  @js.native
  sealed trait enumerationCompleted extends DnssdServiceWatcherStatus
  
  /** The watcher has acknowledged receiving a start command. */
  @js.native
  sealed trait started extends DnssdServiceWatcherStatus
  
  /** The watcher has completed processing a stop command. */
  @js.native
  sealed trait stopped extends DnssdServiceWatcherStatus
  
  /** The watcher has acknowledged receiving a stop command. */
  @js.native
  sealed trait stopping extends DnssdServiceWatcherStatus
}
