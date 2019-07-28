package typings.winrtDashUwp.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 5 */ val aborted: typings.winrtDashUwp.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdServiceWatcherStatus.aborted with Double = js.native
  /* 0 */ val created: typings.winrtDashUwp.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdServiceWatcherStatus.created with Double = js.native
  /* 2 */ val enumerationCompleted: typings.winrtDashUwp.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdServiceWatcherStatus.enumerationCompleted with Double = js.native
  /* 1 */ val started: typings.winrtDashUwp.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdServiceWatcherStatus.started with Double = js.native
  /* 4 */ val stopped: typings.winrtDashUwp.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdServiceWatcherStatus.stopped with Double = js.native
  /* 3 */ val stopping: typings.winrtDashUwp.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdServiceWatcherStatus.stopping with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DnssdServiceWatcherStatus with Double] = js.native
}

