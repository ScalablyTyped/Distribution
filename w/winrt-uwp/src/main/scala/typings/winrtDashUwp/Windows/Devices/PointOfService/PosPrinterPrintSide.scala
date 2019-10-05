package typings.winrtDashUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PosPrinterPrintSide extends js.Object

/** Describes the sides of the sheet of paper on which the point-of-service printer prints. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterPrintSide")
@js.native
object PosPrinterPrintSide extends js.Object {
  /** The point-of-service printer is printing or should print on the front side of the sheet. */
  @js.native
  sealed trait side1 extends PosPrinterPrintSide
  
  /** The point-of-service printer is printing or should print on the back side of the sheet. */
  @js.native
  sealed trait side2 extends PosPrinterPrintSide
  
  /** The side on which the point-of-service printer is currently printing is unknown. */
  @js.native
  sealed trait unknown extends PosPrinterPrintSide
  
  /* 1 */ val side1: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterPrintSide.side1 with Double = js.native
  /* 2 */ val side2: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterPrintSide.side2 with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterPrintSide.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterPrintSide with Double] = js.native
}

