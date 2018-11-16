package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait broken
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterLineStyle
  
  /** Prints a sequence of short lines separated by a space, then followed by a very short line, followed by a space, then followed by a short line again. */
  @js.native
  sealed trait chain
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterLineStyle
  
  /** Prints a continuous solid line of double the normal thickness. */
  @js.native
  sealed trait doubleSolid
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterLineStyle
  
  /** Prints a continuous solid line. */
  @js.native
  sealed trait singleSolid
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterLineStyle
  
  val broken: broken with java.lang.String = js.native
  val chain: chain with java.lang.String = js.native
  val doubleSolid: doubleSolid with java.lang.String = js.native
  val singleSolid: singleSolid with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterLineStyle with java.lang.String
  ] = js.native
}

