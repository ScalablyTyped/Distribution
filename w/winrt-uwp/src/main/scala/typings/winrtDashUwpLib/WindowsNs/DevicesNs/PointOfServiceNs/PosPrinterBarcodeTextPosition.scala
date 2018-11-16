package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait above
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterBarcodeTextPosition
  
  /** The barcode text is below the barcode. */
  @js.native
  sealed trait below
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterBarcodeTextPosition
  
  /** There is no barcode text. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterBarcodeTextPosition
  
  val above: above with java.lang.String = js.native
  val below: below with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterBarcodeTextPosition with java.lang.String
  ] = js.native
}

