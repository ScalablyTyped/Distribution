package typings.winrtDashUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterMapMode with Double] = js.native
  /* 0 */ @js.native
  object dots extends TopLevel[dots with Double]
  
  /* 2 */ @js.native
  object english extends TopLevel[english with Double]
  
  /* 3 */ @js.native
  object metric extends TopLevel[metric with Double]
  
  /* 1 */ @js.native
  object twips extends TopLevel[twips with Double]
  
}

