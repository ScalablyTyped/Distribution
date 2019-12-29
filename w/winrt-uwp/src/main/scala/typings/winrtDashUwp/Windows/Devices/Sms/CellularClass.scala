package typings.winrtDashUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CellularClass with Double] = js.native
  /* 2 */ @js.native
  object cdma extends TopLevel[cdma with Double]
  
  /* 1 */ @js.native
  object gsm extends TopLevel[gsm with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

