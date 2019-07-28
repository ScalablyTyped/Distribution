package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HdrVideoMode extends js.Object

/** Defines the High Dynamic Range (HDR) video modes. */
@JSGlobal("Windows.Media.Devices.HdrVideoMode")
@js.native
object HdrVideoMode extends js.Object {
  /** The system dynamically enables HDR video capture when appropriate. */
  @js.native
  sealed trait auto extends HdrVideoMode
  
  /** HDR video capture is disabled. */
  @js.native
  sealed trait off extends HdrVideoMode
  
  /** HDR video capture is enabled. */
  @js.native
  sealed trait on extends HdrVideoMode
  
  /* 2 */ val auto: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.HdrVideoMode.auto with Double = js.native
  /* 0 */ val off: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.HdrVideoMode.off with Double = js.native
  /* 1 */ val on: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.HdrVideoMode.on with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HdrVideoMode with Double] = js.native
}

