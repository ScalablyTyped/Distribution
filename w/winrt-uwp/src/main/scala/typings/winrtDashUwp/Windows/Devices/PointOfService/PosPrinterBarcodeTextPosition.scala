package typings.winrtDashUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PosPrinterBarcodeTextPosition extends js.Object

/** Describes the possible vertical positions in which a point-of-service printer prints the barcode text relative to the barcode. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterBarcodeTextPosition")
@js.native
object PosPrinterBarcodeTextPosition extends js.Object {
  /** The barcode text is above the barcode. */
  @js.native
  sealed trait above extends PosPrinterBarcodeTextPosition
  
  /** The barcode text is below the barcode. */
  @js.native
  sealed trait below extends PosPrinterBarcodeTextPosition
  
  /** There is no barcode text. */
  @js.native
  sealed trait none extends PosPrinterBarcodeTextPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterBarcodeTextPosition with Double] = js.native
  /* 1 */ @js.native
  object above extends TopLevel[above with Double]
  
  /* 2 */ @js.native
  object below extends TopLevel[below with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

