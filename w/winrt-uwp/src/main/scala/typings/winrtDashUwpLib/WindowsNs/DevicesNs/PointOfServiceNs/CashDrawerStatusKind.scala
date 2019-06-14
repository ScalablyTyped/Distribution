package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CashDrawerStatusKind extends js.Object

/** Defines the constants that indicate the cash drawer power status. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawerStatusKind")
@js.native
object CashDrawerStatusKind extends js.Object {
  /** The device status is not any of the above states. This is available so a POS driver can provide custom notifications to the app. */
  @js.native
  sealed trait extended
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.CashDrawerStatusKind
  
  /** The device is powered off or detached from the terminal. */
  @js.native
  sealed trait off
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.CashDrawerStatusKind
  
  /** The device is either off or offline, but the current state can not be distinguished. */
  @js.native
  sealed trait offOrOffline
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.CashDrawerStatusKind
  
  /** The device is powered on but is not available to respond to requests. */
  @js.native
  sealed trait offline
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.CashDrawerStatusKind
  
  /** The device is powered on and ready to use. */
  @js.native
  sealed trait online
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.CashDrawerStatusKind
  
  /* 4 */ val extended: extended with scala.Double = js.native
  /* 1 */ val off: off with scala.Double = js.native
  /* 3 */ val offOrOffline: offOrOffline with scala.Double = js.native
  /* 2 */ val offline: offline with scala.Double = js.native
  /* 0 */ val online: online with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.CashDrawerStatusKind with scala.Double
  ] = js.native
}

