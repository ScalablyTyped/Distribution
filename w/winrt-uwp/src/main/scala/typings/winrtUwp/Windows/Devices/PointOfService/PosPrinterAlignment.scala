package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PosPrinterAlignment extends StObject
/** Describes the possible horizontal alignments of the text that a point-of-service printer prints on the page. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterAlignment")
@js.native
object PosPrinterAlignment extends StObject {
  
  /** Text is centered. */
  @js.native
  sealed trait center extends PosPrinterAlignment
  
  /** Text is left-aligned. */
  @js.native
  sealed trait left extends PosPrinterAlignment
  
  /** Text is right-aligned. */
  @js.native
  sealed trait right extends PosPrinterAlignment
}
