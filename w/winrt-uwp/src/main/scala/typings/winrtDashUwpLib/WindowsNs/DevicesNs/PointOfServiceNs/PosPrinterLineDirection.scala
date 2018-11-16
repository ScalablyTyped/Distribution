package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PosPrinterLineDirection extends js.Object

/** Describes the possible directions that a receipt or slip printer station can use to print a ruled line. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterLineDirection")
@js.native
object PosPrinterLineDirection extends js.Object {
  /** Prints a horizontal ruled line. */
  @js.native
  sealed trait horizontal
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterLineDirection
  
  /** Prints a vertical ruled line. */
  @js.native
  sealed trait vertical
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterLineDirection
  
  val horizontal: horizontal with java.lang.String = js.native
  val vertical: vertical with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterLineDirection with java.lang.String
  ] = js.native
}

