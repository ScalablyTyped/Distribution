package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs

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
  sealed trait aborted
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdServiceWatcherStatus
  
  /** The watcher has been created. */
  @js.native
  sealed trait created
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdServiceWatcherStatus
  
  /** The watcher has finished enumerating service instances. */
  @js.native
  sealed trait enumerationCompleted
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdServiceWatcherStatus
  
  /** The watcher has acknowledged receiving a start command. */
  @js.native
  sealed trait started
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdServiceWatcherStatus
  
  /** The watcher has completed processing a stop command. */
  @js.native
  sealed trait stopped
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdServiceWatcherStatus
  
  /** The watcher has acknowledged receiving a stop command. */
  @js.native
  sealed trait stopping
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdServiceWatcherStatus
  
  /* 5 */ val aborted: aborted with scala.Double = js.native
  /* 0 */ val created: created with scala.Double = js.native
  /* 2 */ val enumerationCompleted: enumerationCompleted with scala.Double = js.native
  /* 1 */ val started: started with scala.Double = js.native
  /* 4 */ val stopped: stopped with scala.Double = js.native
  /* 3 */ val stopping: stopping with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdServiceWatcherStatus with scala.Double
  ] = js.native
}

