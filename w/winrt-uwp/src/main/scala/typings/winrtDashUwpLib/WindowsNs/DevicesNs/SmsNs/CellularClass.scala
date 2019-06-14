package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CellularClass extends js.Object

/** This enumerated type defines the type of radio standard in a device. */
@JSGlobal("Windows.Devices.Sms.CellularClass")
@js.native
object CellularClass extends js.Object {
  /** The device type is CDMA cellular class. */
  @js.native
  sealed trait cdma
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.CellularClass
  
  /** The device type is GSM cellular class. */
  @js.native
  sealed trait gsm
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.CellularClass
  
  /** The device type corresponds to no cellular class. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.CellularClass
  
  /* 2 */ val cdma: cdma with scala.Double = js.native
  /* 1 */ val gsm: gsm with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.CellularClass with scala.Double] = js.native
}

