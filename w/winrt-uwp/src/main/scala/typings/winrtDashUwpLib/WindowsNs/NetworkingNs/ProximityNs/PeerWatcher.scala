package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Dynamically discovers peer apps within wireless range. */
@JSGlobal("Windows.Networking.Proximity.PeerWatcher")
@js.native
abstract class PeerWatcher () extends js.Object {
  /** Occurs when a peer app is found within wireless range. */
  @JSName("onadded")
  var onadded_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PeerWatcher, PeerInformation] = js.native
  /** Occurs after a scan operation is complete and all peer apps within wireless range have been found. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PeerWatcher, _] = js.native
  /** Occurs when a peer app is no longer within wireless range. */
  @JSName("onremoved")
  var onremoved_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PeerWatcher, PeerInformation] = js.native
  /** Occurs when the PeerWatcher object has been stopped. */
  @JSName("onstopped")
  var onstopped_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PeerWatcher, _] = js.native
  /** Occurs when the DisplayName or DiscoveryData for a peer app within wireless range has changed. */
  @JSName("onupdated")
  var onupdated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PeerWatcher, PeerInformation] = js.native
  /** Gets the current state of the PeerWatcher object. */
  var status: PeerWatcherStatus = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_added(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.added,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PeerWatcher, PeerInformation]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enumerationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.enumerationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PeerWatcher, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.removed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PeerWatcher, PeerInformation]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PeerWatcher, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.updated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PeerWatcher, PeerInformation]
  ): scala.Unit = js.native
  /** Occurs when a peer app is found within wireless range. */
  def onadded(ev: PeerInformation with winrtDashUwpLib.WindowsNs.WinRTEvent[PeerWatcher]): scala.Unit = js.native
  /** Occurs after a scan operation is complete and all peer apps within wireless range have been found. */
  def onenumerationcompleted(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PeerWatcher]): scala.Unit = js.native
  /** Occurs when a peer app is no longer within wireless range. */
  def onremoved(ev: PeerInformation with winrtDashUwpLib.WindowsNs.WinRTEvent[PeerWatcher]): scala.Unit = js.native
  /** Occurs when the PeerWatcher object has been stopped. */
  def onstopped(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PeerWatcher]): scala.Unit = js.native
  /** Occurs when the DisplayName or DiscoveryData for a peer app within wireless range has changed. */
  def onupdated(ev: PeerInformation with winrtDashUwpLib.WindowsNs.WinRTEvent[PeerWatcher]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_added(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.added,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PeerWatcher, PeerInformation]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enumerationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.enumerationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PeerWatcher, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.removed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PeerWatcher, PeerInformation]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PeerWatcher, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.updated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PeerWatcher, PeerInformation]
  ): scala.Unit = js.native
  /** Begin dynamically searching for peer apps within wireless range. */
  def start(): scala.Unit = js.native
  /** Stop dynamically searching for peer apps within wireless range. */
  def stop(): scala.Unit = js.native
}

