package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information regarding availability of and updates to Mobile Broadband Accounts. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcher")
@js.native
/** Creates a new instance of a MobileBroadbandAccountWatcher . */
class MobileBroadbandAccountWatcher () extends js.Object {
  /** Occurs when a Mobile Broadband Account is added to the client. */
  @JSName("onaccountadded")
  var onaccountadded_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MobileBroadbandAccountWatcher, MobileBroadbandAccountEventArgs] = js.native
  /** Occurs when a Mobile Broadband Account is removed from the client. */
  @JSName("onaccountremoved")
  var onaccountremoved_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MobileBroadbandAccountWatcher, MobileBroadbandAccountEventArgs] = js.native
  /** Occurs when a Mobile Broadband Account is updated on the client. */
  @JSName("onaccountupdated")
  var onaccountupdated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MobileBroadbandAccountWatcher, MobileBroadbandAccountUpdatedEventArgs] = js.native
  /** Occurs when the account watcher has finished enumerating accounts for the client. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MobileBroadbandAccountWatcher, _] = js.native
  /** Occurs when the MobileBroadbandAccountWatcher has stopped. */
  @JSName("onstopped")
  var onstopped_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MobileBroadbandAccountWatcher, _] = js.native
  /** Gets the status of the account watcher. */
  var status: MobileBroadbandAccountWatcherStatus = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accountadded(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.accountadded,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MobileBroadbandAccountWatcher, MobileBroadbandAccountEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accountremoved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.accountremoved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MobileBroadbandAccountWatcher, MobileBroadbandAccountEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accountupdated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.accountupdated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MobileBroadbandAccountWatcher, MobileBroadbandAccountUpdatedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enumerationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.enumerationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MobileBroadbandAccountWatcher, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MobileBroadbandAccountWatcher, _]
  ): scala.Unit = js.native
  /** Occurs when a Mobile Broadband Account is added to the client. */
  def onaccountadded(
    ev: MobileBroadbandAccountEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MobileBroadbandAccountWatcher]
  ): scala.Unit = js.native
  /** Occurs when a Mobile Broadband Account is removed from the client. */
  def onaccountremoved(
    ev: MobileBroadbandAccountEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MobileBroadbandAccountWatcher]
  ): scala.Unit = js.native
  /** Occurs when a Mobile Broadband Account is updated on the client. */
  def onaccountupdated(
    ev: MobileBroadbandAccountUpdatedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MobileBroadbandAccountWatcher]
  ): scala.Unit = js.native
  /** Occurs when the account watcher has finished enumerating accounts for the client. */
  def onenumerationcompleted(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[MobileBroadbandAccountWatcher]): scala.Unit = js.native
  /** Occurs when the MobileBroadbandAccountWatcher has stopped. */
  def onstopped(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[MobileBroadbandAccountWatcher]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_accountadded(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.accountadded,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MobileBroadbandAccountWatcher, MobileBroadbandAccountEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_accountremoved(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.accountremoved,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MobileBroadbandAccountWatcher, MobileBroadbandAccountEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_accountupdated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.accountupdated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MobileBroadbandAccountWatcher, MobileBroadbandAccountUpdatedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enumerationcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.enumerationcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MobileBroadbandAccountWatcher, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.stopped,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MobileBroadbandAccountWatcher, _]
  ): scala.Unit = js.native
  /** Starts the account watcher. */
  def start(): scala.Unit = js.native
  /** Stops the account watcher. */
  def stop(): scala.Unit = js.native
}

