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
  
  val left90: left90 with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  val right90: right90 with java.lang.String = js.native
  val rotate180: rotate180 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterRotation with java.lang.String
  ] = js.native
}

