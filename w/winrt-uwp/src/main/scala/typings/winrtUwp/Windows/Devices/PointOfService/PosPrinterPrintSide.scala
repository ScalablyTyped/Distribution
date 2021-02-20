package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PosPrinterPrintSide extends StObject
/** Describes the sides of the sheet of paper on which the point-of-service printer prints. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterPrintSide")
@js.native
object PosPrinterPrintSide extends StObject {
  
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
