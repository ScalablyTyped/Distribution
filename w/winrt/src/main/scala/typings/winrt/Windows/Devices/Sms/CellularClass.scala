package typings.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CellularClass extends js.Object

@JSGlobal("Windows.Devices.Sms.CellularClass")
@js.native
object CellularClass extends js.Object {
  @js.native
  sealed trait cdma extends CellularClass
  
  @js.native
  sealed trait gsm extends CellularClass
  
  @js.native
  sealed trait none extends CellularClass
  
  /* 2 */ val cdma: typings.winrt.Windows.Devices.Sms.CellularClass.cdma with Double = js.native
  /* 1 */ val gsm: typings.winrt.Windows.Devices.Sms.CellularClass.gsm with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Devices.Sms.CellularClass.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CellularClass with Double] = js.native
}

