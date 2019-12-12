package typings.winrtDashUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Devices.OpticalImageStabilizationMode.auto
import typings.winrtDashUwp.Windows.Media.Devices.OpticalImageStabilizationMode.off
import typings.winrtDashUwp.Windows.Media.Devices.OpticalImageStabilizationMode.on
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OpticalImageStabilizationMode with Double] = js.native
  /* 2 */ @js.native
  object auto extends TopLevel[auto with Double]
  
  /* 0 */ @js.native
  object off extends TopLevel[off with Double]
  
  /* 1 */ @js.native
  object on extends TopLevel[on with Double]
  
}

