package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait left90
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterRotation
  
  /** The text or image is not rotated. */
  @js.native
  sealed trait normal
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterRotation
  
  /** The text or image is rotated 90 degrees clockwise. */
  @js.native
  sealed trait right90
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterRotation
  
  /** The text or image is upside-down. */
  @js.native
  sealed trait rotate180
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterRotation
  
  /* 2 */ val left90: left90 with scala.Double = js.native
  /* 0 */ val normal: normal with scala.Double = js.native
  /* 1 */ val right90: right90 with scala.Double = js.native
  /* 3 */ val rotate180: rotate180 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterRotation with scala.Double
  ] = js.native
}

