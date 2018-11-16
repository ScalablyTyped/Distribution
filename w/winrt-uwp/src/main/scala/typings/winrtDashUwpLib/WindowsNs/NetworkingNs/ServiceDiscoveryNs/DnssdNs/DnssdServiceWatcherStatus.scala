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
  
  val aborted: aborted with java.lang.String = js.native
  val created: created with java.lang.String = js.native
  val enumerationCompleted: enumerationCompleted with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  val stopped: stopped with java.lang.String = js.native
  val stopping: stopping with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs.DnssdServiceWatcherStatus with java.lang.String
  ] = js.native
}

