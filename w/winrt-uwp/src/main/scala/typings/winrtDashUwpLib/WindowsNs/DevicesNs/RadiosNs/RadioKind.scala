package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RadioKind extends js.Object

/** Enumeration that represents the kinds of radio devices. */
@JSGlobal("Windows.Devices.Radios.RadioKind")
@js.native
object RadioKind extends js.Object {
  /** A Bluetooth radio. */
  @js.native
  sealed trait bluetooth
    extends winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs.RadioKind
  
  /** An FM radio. */
  @js.native
  sealed trait fm
    extends winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs.RadioKind
  
  /** A mobile broadband radio. */
  @js.native
  sealed trait mobileBroadband
    extends winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs.RadioKind
  
  /** An unspecified kind of radio device. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs.RadioKind
  
  /** A Wi-Fi radio. */
  @js.native
  sealed trait wiFi
    extends winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs.RadioKind
  
  val bluetooth: bluetooth with java.lang.String = js.native
  val fm: fm with java.lang.String = js.native
  val mobileBroadband: mobileBroadband with java.lang.String = js.native
  val other: other with java.lang.String = js.native
  val wiFi: wiFi with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.RadiosNs.RadioKind with java.lang.String] = js.native
}

