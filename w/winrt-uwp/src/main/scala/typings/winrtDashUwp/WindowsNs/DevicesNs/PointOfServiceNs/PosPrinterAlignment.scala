package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait center extends PosPrinterAlignment
  
  /** Text is left-aligned. */
  @js.native
  sealed trait left extends PosPrinterAlignment
  
  /** Text is right-aligned. */
  @js.native
  sealed trait right extends PosPrinterAlignment
  
  /* 1 */ val center: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterAlignment.center with Double = js.native
  /* 0 */ val left: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterAlignment.left with Double = js.native
  /* 2 */ val right: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterAlignment.right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterAlignment with Double] = js.native
}

