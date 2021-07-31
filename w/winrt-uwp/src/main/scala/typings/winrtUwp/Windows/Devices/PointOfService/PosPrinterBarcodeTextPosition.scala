package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PosPrinterBarcodeTextPosition extends StObject
/** Describes the possible vertical positions in which a point-of-service printer prints the barcode text relative to the barcode. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterBarcodeTextPosition")
@js.native
object PosPrinterBarcodeTextPosition extends StObject {
  
  /** The barcode text is above the barcode. */
  @js.native
  sealed trait above
    extends StObject
       with PosPrinterBarcodeTextPosition
  
  /** The barcode text is below the barcode. */
  @js.native
  sealed trait below
    extends StObject
       with PosPrinterBarcodeTextPosition
  
  /** There is no barcode text. */
  @js.native
  sealed trait none
    extends StObject
       with PosPrinterBarcodeTextPosition
}
