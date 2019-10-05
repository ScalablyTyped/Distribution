package typings.winrtDashUwp.Windows.Media.Devices

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
  sealed trait auto extends OpticalImageStabilizationMode
  
  /** Optical image stabilization is disabled. */
  @js.native
  sealed trait off extends OpticalImageStabilizationMode
  
  /** Optical image stabilization is enabled. */
  @js.native
  sealed trait on extends OpticalImageStabilizationMode
  
  /* 2 */ val auto: typings.winrtDashUwp.Windows.Media.Devices.OpticalImageStabilizationMode.auto with Double = js.native
  /* 0 */ val off: typings.winrtDashUwp.Windows.Media.Devices.OpticalImageStabilizationMode.off with Double = js.native
  /* 1 */ val on: typings.winrtDashUwp.Windows.Media.Devices.OpticalImageStabilizationMode.on with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OpticalImageStabilizationMode with Double] = js.native
}

