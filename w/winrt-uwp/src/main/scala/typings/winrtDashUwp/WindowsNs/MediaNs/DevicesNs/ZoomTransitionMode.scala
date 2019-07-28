package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZoomTransitionMode extends js.Object

/** Defines the zoom transition modes. */
@JSGlobal("Windows.Media.Devices.ZoomTransitionMode")
@js.native
object ZoomTransitionMode extends js.Object {
  /** The default zoom transition mode for the device. Can be Direct or Smooth, depending on the device. */
  @js.native
  sealed trait auto extends ZoomTransitionMode
  
  /** The zoom transition is instantaneous. */
  @js.native
  sealed trait direct extends ZoomTransitionMode
  
  /** The zoom transition is smooth. */
  @js.native
  sealed trait smooth extends ZoomTransitionMode
  
  /* 0 */ val auto: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.ZoomTransitionMode.auto with Double = js.native
  /* 1 */ val direct: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.ZoomTransitionMode.direct with Double = js.native
  /* 2 */ val smooth: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.ZoomTransitionMode.smooth with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ZoomTransitionMode with Double] = js.native
}

