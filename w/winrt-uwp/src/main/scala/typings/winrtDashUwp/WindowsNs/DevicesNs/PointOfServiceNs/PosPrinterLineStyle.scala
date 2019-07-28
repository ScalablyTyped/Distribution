package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PosPrinterLineStyle extends js.Object

/** Describes the line styles that a receipt or slip printer station can use to print a ruled line. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterLineStyle")
@js.native
object PosPrinterLineStyle extends js.Object {
  /** Prints a sequence of short lines separated by spaces. */
  @js.native
  sealed trait broken extends PosPrinterLineStyle
  
  /** Prints a sequence of short lines separated by a space, then followed by a very short line, followed by a space, then followed by a short line again. */
  @js.native
  sealed trait chain extends PosPrinterLineStyle
  
  /** Prints a continuous solid line of double the normal thickness. */
  @js.native
  sealed trait doubleSolid extends PosPrinterLineStyle
  
  /** Prints a continuous solid line. */
  @js.native
  sealed trait singleSolid extends PosPrinterLineStyle
  
  /* 2 */ val broken: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterLineStyle.broken with Double = js.native
  /* 3 */ val chain: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterLineStyle.chain with Double = js.native
  /* 1 */ val doubleSolid: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterLineStyle.doubleSolid with Double = js.native
  /* 0 */ val singleSolid: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterLineStyle.singleSolid with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterLineStyle with Double] = js.native
}

