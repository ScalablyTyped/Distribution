package typings.winrtUwp.Windows.Devices.PointOfService

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
  
}

