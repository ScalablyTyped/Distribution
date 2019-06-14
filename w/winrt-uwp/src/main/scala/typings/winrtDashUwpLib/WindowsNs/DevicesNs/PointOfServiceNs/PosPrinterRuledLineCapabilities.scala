package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PosPrinterRuledLineCapabilities extends js.Object

/** Describes the capabilities of the point-of-service printer to draw ruled lines. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterRuledLineCapabilities")
@js.native
object PosPrinterRuledLineCapabilities extends js.Object {
  /** The printer can draw ruled horizontal lines. */
  @js.native
  sealed trait horizontal
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterRuledLineCapabilities
  
  /** The printer cannot draw ruled lines. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterRuledLineCapabilities
  
  /** The printer can draw ruled vertical lines. */
  @js.native
  sealed trait vertical
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterRuledLineCapabilities
  
  /* 1 */ val horizontal: horizontal with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val vertical: vertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterRuledLineCapabilities with scala.Double
  ] = js.native
}

