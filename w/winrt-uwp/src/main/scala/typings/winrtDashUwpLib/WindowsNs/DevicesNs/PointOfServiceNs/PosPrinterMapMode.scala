package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PosPrinterMapMode extends js.Object

/** Describes the valid units of measure for point-of-service printers. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterMapMode")
@js.native
object PosPrinterMapMode extends js.Object {
  /** The dot width for the point-of-service printer. */
  @js.native
  sealed trait dots
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMapMode
  
  /** 0.001 inch. */
  @js.native
  sealed trait english
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMapMode
  
  /** 0.01 millimeter. */
  @js.native
  sealed trait metric
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMapMode
  
  /** 1/1440 of an inch. */
  @js.native
  sealed trait twips
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMapMode
  
  /* 0 */ val dots: dots with scala.Double = js.native
  /* 2 */ val english: english with scala.Double = js.native
  /* 3 */ val metric: metric with scala.Double = js.native
  /* 1 */ val twips: twips with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMapMode with scala.Double
  ] = js.native
}

