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
  
  val cell: cell with java.lang.String = js.native
  val cellWithImmediateDisplay: cellWithImmediateDisplay with java.lang.String = js.native
  val locationArea: locationArea with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val plmn: plmn with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsGeographicalScope with java.lang.String
  ] = js.native
}

