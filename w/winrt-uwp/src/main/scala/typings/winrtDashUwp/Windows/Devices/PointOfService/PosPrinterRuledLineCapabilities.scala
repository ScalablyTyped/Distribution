package typings.winrtDashUwp.Windows.Devices.PointOfService

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
  
  /* 1 */ val horizontal: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterRuledLineCapabilities.horizontal with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterRuledLineCapabilities.none with Double = js.native
  /* 2 */ val vertical: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterRuledLineCapabilities.vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterRuledLineCapabilities with Double] = js.native
}

