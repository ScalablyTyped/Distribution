package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraStreamState extends js.Object

/** Defines the state of a camera stream. */
@JSGlobal("Windows.Media.Devices.CameraStreamState")
@js.native
object CameraStreamState extends js.Object {
  /** Frames in the stream are being dropped for privacy reasons. */
  @js.native
  sealed trait blockedForPrivacy extends CameraStreamState
  
  /** The camera stream is not currently streaming. */
  @js.native
  sealed trait notStreaming extends CameraStreamState
  
  /** The camera stream has been shut down. */
  @js.native
  sealed trait shutdown extends CameraStreamState
  
  /** The camera stream is currently streaming. */
  @js.native
  sealed trait streaming extends CameraStreamState
  
  /* 2 */ val blockedForPrivacy: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CameraStreamState.blockedForPrivacy with Double = js.native
  /* 0 */ val notStreaming: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CameraStreamState.notStreaming with Double = js.native
  /* 3 */ val shutdown: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CameraStreamState.shutdown with Double = js.native
  /* 1 */ val streaming: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CameraStreamState.streaming with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraStreamState with Double] = js.native
}

