package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CellularClass extends StObject
@JSGlobal("Windows.Devices.Sms.CellularClass")
@js.native
object CellularClass extends StObject {
  
  @js.native
  sealed trait cdma
    extends StObject
       with CellularClass
  
  @js.native
  sealed trait gsm
    extends StObject
       with CellularClass
  
  @js.native
  sealed trait none
    extends StObject
       with CellularClass
}
