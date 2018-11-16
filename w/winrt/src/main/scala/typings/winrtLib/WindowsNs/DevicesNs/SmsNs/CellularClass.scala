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
  
  val cdma: cdma with java.lang.String = js.native
  val gsm: gsm with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.DevicesNs.SmsNs.CellularClass with java.lang.String] = js.native
}

