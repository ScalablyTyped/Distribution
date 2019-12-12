package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Devices.Sms.CellularClass.cdma
import typings.winrt.Windows.Devices.Sms.CellularClass.gsm
import typings.winrt.Windows.Devices.Sms.CellularClass.none
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CellularClass with Double] = js.native
  /* 2 */ @js.native
  object cdma extends TopLevel[cdma with Double]
  
  /* 1 */ @js.native
  object gsm extends TopLevel[gsm with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

