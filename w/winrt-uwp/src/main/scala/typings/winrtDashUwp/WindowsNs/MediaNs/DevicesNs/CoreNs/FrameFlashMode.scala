package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FrameFlashMode extends js.Object

/** Specifies the flash mode for a frame in a variable photo sequence. */
@JSGlobal("Windows.Media.Devices.Core.FrameFlashMode")
@js.native
object FrameFlashMode extends js.Object {
  /** The flash is disabled. */
  @js.native
  sealed trait disable extends FrameFlashMode
  
  /** The flash is enabled. */
  @js.native
  sealed trait enable extends FrameFlashMode
  
  /** The flash uses the global flash mode. */
  @js.native
  sealed trait global extends FrameFlashMode
  
  /* 0 */ val disable: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CoreNs.FrameFlashMode.disable with Double = js.native
  /* 1 */ val enable: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CoreNs.FrameFlashMode.enable with Double = js.native
  /* 2 */ val global: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CoreNs.FrameFlashMode.global with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrameFlashMode with Double] = js.native
}

