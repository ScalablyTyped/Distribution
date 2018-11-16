package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OpticalImageStabilizationMode extends js.Object

/** Defines the optical image stabilization modes. */
@JSGlobal("Windows.Media.Devices.OpticalImageStabilizationMode")
@js.native
object OpticalImageStabilizationMode extends js.Object {
  /** The system dynamically enables optical image stabilization when appropriate. */
  @js.native
  sealed trait auto
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.OpticalImageStabilizationMode
  
  /** Optical image stabilization is disabled. */
  @js.native
  sealed trait off
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.OpticalImageStabilizationMode
  
  /** Optical image stabilization is enabled. */
  @js.native
  sealed trait on
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.OpticalImageStabilizationMode
  
  val auto: auto with java.lang.String = js.native
  val off: off with java.lang.String = js.native
  val on: on with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.OpticalImageStabilizationMode with java.lang.String
  ] = js.native
}

