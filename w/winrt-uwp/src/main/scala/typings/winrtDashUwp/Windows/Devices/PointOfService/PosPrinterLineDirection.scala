package typings.winrtDashUwp.Windows.Devices.PointOfService

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
  sealed trait horizontal extends PosPrinterLineDirection
  
  /** Prints a vertical ruled line. */
  @js.native
  sealed trait vertical extends PosPrinterLineDirection
  
  /* 0 */ val horizontal: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterLineDirection.horizontal with Double = js.native
  /* 1 */ val vertical: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterLineDirection.vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterLineDirection with Double] = js.native
}

