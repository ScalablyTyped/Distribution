package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait side1
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterPrintSide
  
  /** The point-of-service printer is printing or should print on the back side of the sheet. */
  @js.native
  sealed trait side2
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterPrintSide
  
  /** The side on which the point-of-service printer is currently printing is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterPrintSide
  
  val side1: side1 with java.lang.String = js.native
  val side2: side2 with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterPrintSide with java.lang.String
  ] = js.native
}

