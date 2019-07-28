package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait horizontal extends PosPrinterRuledLineCapabilities
  
  /** The printer cannot draw ruled lines. */
  @js.native
  sealed trait none extends PosPrinterRuledLineCapabilities
  
  /** The printer can draw ruled vertical lines. */
  @js.native
  sealed trait vertical extends PosPrinterRuledLineCapabilities
  
  /* 1 */ val horizontal: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterRuledLineCapabilities.horizontal with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterRuledLineCapabilities.none with Double = js.native
  /* 2 */ val vertical: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterRuledLineCapabilities.vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterRuledLineCapabilities with Double] = js.native
}

