package typings.winrtDashUwp.Windows.Devices.Sms

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
  sealed trait cdma extends CellularClass
  
  /** The device type is GSM cellular class. */
  @js.native
  sealed trait gsm extends CellularClass
  
  /** The device type corresponds to no cellular class. */
  @js.native
  sealed trait none extends CellularClass
  
  /* 2 */ val cdma: typings.winrtDashUwp.Windows.Devices.Sms.CellularClass.cdma with Double = js.native
  /* 1 */ val gsm: typings.winrtDashUwp.Windows.Devices.Sms.CellularClass.gsm with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Devices.Sms.CellularClass.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CellularClass with Double] = js.native
}

