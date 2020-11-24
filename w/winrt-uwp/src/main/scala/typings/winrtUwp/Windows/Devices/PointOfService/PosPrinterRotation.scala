package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PosPrinterRotation extends js.Object
/** Describes the possible ways that a point-of-service printer can rotate the text or image on the page. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterRotation")
@js.native
object PosPrinterRotation extends js.Object {
  
  /** The text or image is rotated 90 degrees counterclockwise. */
  @js.native
  sealed trait left90 extends PosPrinterRotation
  
  /** The text or image is not rotated. */
  @js.native
  sealed trait normal extends PosPrinterRotation
  
  /** The text or image is rotated 90 degrees clockwise. */
  @js.native
  sealed trait right90 extends PosPrinterRotation
  
  /** The text or image is upside-down. */
  @js.native
  sealed trait rotate180 extends PosPrinterRotation
}
