package typings.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.added
import typings.winrtUwp.winrtUwpStrings.enumerationcompleted
import typings.winrtUwp.winrtUwpStrings.stopped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Maintains a collection of available DNS Service Discovery (DNS-SD) service instances. */
@js.native
trait DnssdServiceWatcher extends js.Object {
  /** Event that is triggered when a DnssdServiceWatcher has added a DNS Service Discovery (DNS-SD) instance to its collection of available service instances. */
  @JSName("onadded")
  var onadded_Original: TypedEventHandler[DnssdServiceWatcher, DnssdServiceInstance] = js.native
  /** Event triggered when a DnssdServiceWatcher has finished enumerating available DNS Service Discovery (DNS-SD) service instances. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: TypedEventHandler[DnssdServiceWatcher, _] = js.native
  /** Event triggered when an in-progress enumeration has been stopped. */
  @JSName("onstopped")
  var onstopped_Original: TypedEventHandler[DnssdServiceWatcher, _] = js.native
  /** Gets the current status of the DnssdServiceWatcherStatus . */
  var status: DnssdServiceWatcherStatus = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_added(`type`: added, listener: TypedEventHandler[DnssdServiceWatcher, DnssdServiceInstance]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[DnssdServiceWatcher, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(`type`: stopped, listener: TypedEventHandler[DnssdServiceWatcher, _]): Unit = js.native
  /** Event that is triggered when a DnssdServiceWatcher has added a DNS Service Discovery (DNS-SD) instance to its collection of available service instances. */
  def onadded(ev: DnssdServiceInstance with WinRTEvent[DnssdServiceWatcher]): Unit = js.native
  /** Event triggered when a DnssdServiceWatcher has finished enumerating available DNS Service Discovery (DNS-SD) service instances. */
  def onenumerationcompleted(ev: js.Any with WinRTEvent[DnssdServiceWatcher]): Unit = js.native
  /** Event triggered when an in-progress enumeration has been stopped. */
  def onstopped(ev: js.Any with WinRTEvent[DnssdServiceWatcher]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_added(`type`: added, listener: TypedEventHandler[DnssdServiceWatcher, DnssdServiceInstance]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[DnssdServiceWatcher, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(`type`: stopped, listener: TypedEventHandler[DnssdServiceWatcher, _]): Unit = js.native
  /** Starts an enumeration of the network for available DNS Service Discovery (DNS-SD) service instances. */
  def start(): Unit = js.native
  /** Stops an in-progress enumeration of available DNS Service Discovery (DNS-SD) service instances. */
  def stop(): Unit = js.native
}

