package typings.winrtDashUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterRuledLineCapabilities with Double] = js.native
  /* 1 */ @js.native
  object horizontal extends TopLevel[horizontal with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object vertical extends TopLevel[vertical with Double]
  
}

