package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Handles communication to and from the lock screen. */
@JSGlobal("Windows.ApplicationModel.Calls.LockScreenCallUI")
@js.native
abstract class LockScreenCallUI () extends js.Object {
  /** Gets and sets a brief description of the nature of the call. This brief description is also called the call's accessible name; its form is "Video call with Jane Doe." */
  var callTitle: java.lang.String = js.native
  /** Occurs when the lock screen interaction is complete. */
  @JSName("onclosed")
  var onclosed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockScreenCallUI, _] = js.native
  /** Occurs when the lock screen wants to end the call. */
  @JSName("onendrequested")
  var onendrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockScreenCallUI, LockScreenCallEndRequestedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.closed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockScreenCallUI, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.endrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockScreenCallUI, LockScreenCallEndRequestedEventArgs]
  ): scala.Unit = js.native
  /** Removes the app from the lock screen UI. */
  def dismiss(): scala.Unit = js.native
  /** Occurs when the lock screen interaction is complete. */
  def onclosed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[LockScreenCallUI]): scala.Unit = js.native
  /** Occurs when the lock screen wants to end the call. */
  def onendrequested(
    ev: LockScreenCallEndRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[LockScreenCallUI]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_closed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.closed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockScreenCallUI, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_endrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.endrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockScreenCallUI, LockScreenCallEndRequestedEventArgs]
  ): scala.Unit = js.native
}

