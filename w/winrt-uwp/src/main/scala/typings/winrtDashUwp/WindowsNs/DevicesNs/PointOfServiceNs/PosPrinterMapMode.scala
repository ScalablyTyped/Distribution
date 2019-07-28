package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait dots extends PosPrinterMapMode
  
  /** 0.001 inch. */
  @js.native
  sealed trait english extends PosPrinterMapMode
  
  /** 0.01 millimeter. */
  @js.native
  sealed trait metric extends PosPrinterMapMode
  
  /** 1/1440 of an inch. */
  @js.native
  sealed trait twips extends PosPrinterMapMode
  
  /* 0 */ val dots: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMapMode.dots with Double = js.native
  /* 2 */ val english: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMapMode.english with Double = js.native
  /* 3 */ val metric: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMapMode.metric with Double = js.native
  /* 1 */ val twips: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterMapMode.twips with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterMapMode with Double] = js.native
}

