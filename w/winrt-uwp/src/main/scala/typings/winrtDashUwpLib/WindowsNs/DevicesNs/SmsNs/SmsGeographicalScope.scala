package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsGeographicalScope extends js.Object

/** Values that describe the geographical scope of a cell broadcast message. */
@JSGlobal("Windows.Devices.Sms.SmsGeographicalScope")
@js.native
object SmsGeographicalScope extends js.Object {
  /** Scope is a single cell tower. */
  @js.native
  sealed trait cell
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsGeographicalScope
  
  /** Scope is a single cell tower, with immediate display. */
  @js.native
  sealed trait cellWithImmediateDisplay
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsGeographicalScope
  
  /** Scope is a Location Area. */
  @js.native
  sealed trait locationArea
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsGeographicalScope
  
  /** An undefined or unknown geographical scope. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsGeographicalScope
  
  /** Scope is the entire Public Land Mobile Network (PLMN). */
  @js.native
  sealed trait plmn
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsGeographicalScope
  
  /* 4 */ val cell: cell with scala.Double = js.native
  /* 1 */ val cellWithImmediateDisplay: cellWithImmediateDisplay with scala.Double = js.native
  /* 2 */ val locationArea: locationArea with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val plmn: plmn with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsGeographicalScope with scala.Double] = js.native
}

