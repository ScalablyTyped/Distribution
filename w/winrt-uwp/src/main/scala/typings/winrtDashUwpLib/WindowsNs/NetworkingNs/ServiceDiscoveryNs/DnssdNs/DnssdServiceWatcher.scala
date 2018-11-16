package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ServiceDiscoveryNs.DnssdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Maintains a collection of available DNS Service Discovery (DNS-SD) service instances. */
@JSGlobal("Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceWatcher")
@js.native
abstract class DnssdServiceWatcher () extends js.Object {
  /** Event that is triggered when a DnssdServiceWatcher has added a DNS Service Discovery (DNS-SD) instance to its collection of available service instances. */
  @JSName("onadded")
  var onadded_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DnssdServiceWatcher, DnssdServiceInstance] = js.native
  /** Event triggered when a DnssdServiceWatcher has finished enumerating available DNS Service Discovery (DNS-SD) service instances. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DnssdServiceWatcher, _] = js.native
  /** Event triggered when an in-progress enumeration has been stopped. */
  @JSName("onstopped")
  var onstopped_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DnssdServiceWatcher, _] = js.native
  /** Gets the current status of the DnssdServiceWatcherStatus . */
  var status: DnssdServiceWatcherStatus = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_added(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.added,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DnssdServiceWatcher, DnssdServiceInstance]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enumerationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.enumerationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DnssdServiceWatcher, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DnssdServiceWatcher, _]
  ): scala.Unit = js.native
  /** Event that is triggered when a DnssdServiceWatcher has added a DNS Service Discovery (DNS-SD) instance to its collection of available service instances. */
  def onadded(ev: DnssdServiceInstance with winrtDashUwpLib.WindowsNs.WinRTEvent[DnssdServiceWatcher]): scala.Unit = js.native
  /** Event triggered when a DnssdServiceWatcher has finished enumerating available DNS Service Discovery (DNS-SD) service instances. */
  def onenumerationcompleted(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[DnssdServiceWatcher]): scala.Unit = js.native
  /** Event triggered when an in-progress enumeration has been stopped. */
  def onstopped(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[DnssdServiceWatcher]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_added(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.added,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DnssdServiceWatcher, DnssdServiceInstance]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enumerationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.enumerationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DnssdServiceWatcher, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DnssdServiceWatcher, _]
  ): scala.Unit = js.native
  /** Starts an enumeration of the network for available DNS Service Discovery (DNS-SD) service instances. */
  def start(): scala.Unit = js.native
  /** Stops an in-progress enumeration of available DNS Service Discovery (DNS-SD) service instances. */
  def stop(): scala.Unit = js.native
}

