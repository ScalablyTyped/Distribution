package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PosPrinterMapMode extends StObject
/** Describes the valid units of measure for point-of-service printers. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterMapMode")
@js.native
object PosPrinterMapMode extends StObject {
  
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
}
