package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

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
  
  /* 1 */ val above: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterBarcodeTextPosition.above with Double = js.native
  /* 2 */ val below: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterBarcodeTextPosition.below with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterBarcodeTextPosition.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterBarcodeTextPosition with Double] = js.native
}

