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
  
  /* 2 */ val auto: auto with scala.Double = js.native
  /* 0 */ val off: off with scala.Double = js.native
  /* 1 */ val on: on with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.OpticalImageStabilizationMode with scala.Double
  ] = js.native
}

