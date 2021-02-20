package typings.winrtUwp.Windows.ApplicationModel.Calls

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.closed
import typings.winrtUwp.winrtUwpStrings.endrequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Handles communication to and from the lock screen. */
@js.native
trait LockScreenCallUI extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closed(`type`: closed, listener: TypedEventHandler[LockScreenCallUI, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endrequested(
    `type`: endrequested,
    listener: TypedEventHandler[LockScreenCallUI, LockScreenCallEndRequestedEventArgs]
  ): Unit = js.native
  
  /** Gets and sets a brief description of the nature of the call. This brief description is also called the call's accessible name; its form is "Video call with Jane Doe." */
  var callTitle: String = js.native
  
  /** Removes the app from the lock screen UI. */
  def dismiss(): Unit = js.native
  
  /** Occurs when the lock screen interaction is complete. */
  def onclosed(ev: js.Any with WinRTEvent[LockScreenCallUI]): Unit = js.native
  /** Occurs when the lock screen interaction is complete. */
  @JSName("onclosed")
  var onclosed_Original: TypedEventHandler[LockScreenCallUI, _] = js.native
  
  /** Occurs when the lock screen wants to end the call. */
  def onendrequested(ev: LockScreenCallEndRequestedEventArgs with WinRTEvent[LockScreenCallUI]): Unit = js.native
  /** Occurs when the lock screen wants to end the call. */
  @JSName("onendrequested")
  var onendrequested_Original: TypedEventHandler[LockScreenCallUI, LockScreenCallEndRequestedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_closed(`type`: closed, listener: TypedEventHandler[LockScreenCallUI, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_endrequested(
    `type`: endrequested,
    listener: TypedEventHandler[LockScreenCallUI, LockScreenCallEndRequestedEventArgs]
  ): Unit = js.native
}
