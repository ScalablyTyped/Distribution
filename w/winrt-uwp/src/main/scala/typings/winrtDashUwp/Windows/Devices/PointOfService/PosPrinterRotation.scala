package typings.winrtDashUwp.Windows.Devices.PointOfService

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
  
  /* 2 */ val left90: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterRotation.left90 with Double = js.native
  /* 0 */ val normal: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterRotation.normal with Double = js.native
  /* 1 */ val right90: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterRotation.right90 with Double = js.native
  /* 3 */ val rotate180: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterRotation.rotate180 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterRotation with Double] = js.native
}

