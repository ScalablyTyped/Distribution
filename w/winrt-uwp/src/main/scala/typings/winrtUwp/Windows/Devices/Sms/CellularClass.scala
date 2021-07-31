package typings.winrtUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CellularClass extends StObject
/** This enumerated type defines the type of radio standard in a device. */
@JSGlobal("Windows.Devices.Sms.CellularClass")
@js.native
object CellularClass extends StObject {
  
  /** The device type is CDMA cellular class. */
  @js.native
  sealed trait cdma
    extends StObject
       with CellularClass
  
  /** The device type is GSM cellular class. */
  @js.native
  sealed trait gsm
    extends StObject
       with CellularClass
  
  /** The device type corresponds to no cellular class. */
  @js.native
  sealed trait none
    extends StObject
       with CellularClass
}
