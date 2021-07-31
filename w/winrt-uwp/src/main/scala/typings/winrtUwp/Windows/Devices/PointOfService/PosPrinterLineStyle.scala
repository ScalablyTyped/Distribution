package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PosPrinterLineStyle extends StObject
/** Describes the line styles that a receipt or slip printer station can use to print a ruled line. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterLineStyle")
@js.native
object PosPrinterLineStyle extends StObject {
  
  /** Prints a sequence of short lines separated by spaces. */
  @js.native
  sealed trait broken
    extends StObject
       with PosPrinterLineStyle
  
  /** Prints a sequence of short lines separated by a space, then followed by a very short line, followed by a space, then followed by a short line again. */
  @js.native
  sealed trait chain
    extends StObject
       with PosPrinterLineStyle
  
  /** Prints a continuous solid line of double the normal thickness. */
  @js.native
  sealed trait doubleSolid
    extends StObject
       with PosPrinterLineStyle
  
  /** Prints a continuous solid line. */
  @js.native
  sealed trait singleSolid
    extends StObject
       with PosPrinterLineStyle
}
