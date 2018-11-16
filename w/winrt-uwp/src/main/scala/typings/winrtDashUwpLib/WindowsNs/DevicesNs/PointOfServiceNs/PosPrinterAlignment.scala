package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PosPrinterAlignment extends js.Object

/** Describes the possible horizontal alignments of the text that a point-of-service printer prints on the page. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterAlignment")
@js.native
object PosPrinterAlignment extends js.Object {
  /** Text is centered. */
  @js.native
  sealed trait center
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterAlignment
  
  /** Text is left-aligned. */
  @js.native
  sealed trait left
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterAlignment
  
  /** Text is right-aligned. */
  @js.native
  sealed trait right
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterAlignment
  
  val center: center with java.lang.String = js.native
  val left: left with java.lang.String = js.native
  val right: right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterAlignment with java.lang.String
  ] = js.native
}

