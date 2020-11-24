package typings.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
