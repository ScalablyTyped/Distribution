package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CellularClass extends js.Object

@JSGlobal("Windows.Devices.Sms.CellularClass")
@js.native
object CellularClass extends js.Object {
  @js.native
  sealed trait cdma
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.CellularClass
  
  @js.native
  sealed trait gsm
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.CellularClass
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.CellularClass
  
  /* 2 */ val cdma: cdma with scala.Double = js.native
  /* 1 */ val gsm: gsm with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.DevicesNs.SmsNs.CellularClass with scala.Double] = js.native
}

