package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.closed
import typings.winrtDashUwp.winrtDashUwpStrings.endrequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Handles communication to and from the lock screen. */
@JSGlobal("Windows.ApplicationModel.Calls.LockScreenCallUI")
@js.native
abstract class LockScreenCallUI () extends js.Object {
  /** Gets and sets a brief description of the nature of the call. This brief description is also called the call's accessible name; its form is "Video call with Jane Doe." */
  var callTitle: String = js.native
  /** Occurs when the lock screen interaction is complete. */
  @JSName("onclosed")
  var onclosed_Original: TypedEventHandler[LockScreenCallUI, _] = js.native
  /** Occurs when the lock screen wants to end the call. */
  @JSName("onendrequested")
  var onendrequested_Original: TypedEventHandler[LockScreenCallUI, LockScreenCallEndRequestedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closed(`type`: closed, listener: TypedEventHandler[LockScreenCallUI, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endrequested(
    `type`: endrequested,
    listener: TypedEventHandler[LockScreenCallUI, LockScreenCallEndRequestedEventArgs]
  ): Unit = js.native
  /** Removes the app from the lock screen UI. */
  def dismiss(): Unit = js.native
  /** Occurs when the lock screen interaction is complete. */
  def onclosed(ev: js.Any with WinRTEvent[LockScreenCallUI]): Unit = js.native
  /** Occurs when the lock screen wants to end the call. */
  def onendrequested(ev: LockScreenCallEndRequestedEventArgs with WinRTEvent[LockScreenCallUI]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_closed(`type`: closed, listener: TypedEventHandler[LockScreenCallUI, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_endrequested(
    `type`: endrequested,
    listener: TypedEventHandler[LockScreenCallUI, LockScreenCallEndRequestedEventArgs]
  ): Unit = js.native
}

