package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterRotation with Double] = js.native
  /* 2 */ @js.native
  object left90 extends TopLevel[left90 with Double]
  
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 1 */ @js.native
  object right90 extends TopLevel[right90 with Double]
  
  /* 3 */ @js.native
  object rotate180 extends TopLevel[rotate180 with Double]
  
}

