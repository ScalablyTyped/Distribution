package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PosPrinterRotation extends StObject
/** Describes the possible ways that a point-of-service printer can rotate the text or image on the page. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterRotation")
@js.native
object PosPrinterRotation extends StObject {
  
  /** The text or image is rotated 90 degrees counterclockwise. */
  @js.native
  sealed trait left90
    extends StObject
       with PosPrinterRotation
  
  /** The text or image is not rotated. */
  @js.native
  sealed trait normal
    extends StObject
       with PosPrinterRotation
  
  /** The text or image is rotated 90 degrees clockwise. */
  @js.native
  sealed trait right90
    extends StObject
       with PosPrinterRotation
  
  /** The text or image is upside-down. */
  @js.native
  sealed trait rotate180
    extends StObject
       with PosPrinterRotation
}
