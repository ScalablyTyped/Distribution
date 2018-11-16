package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

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
  sealed trait blockedForPrivacy
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CameraStreamState
  
  /** The camera stream is not currently streaming. */
  @js.native
  sealed trait notStreaming
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CameraStreamState
  
  /** The camera stream has been shut down. */
  @js.native
  sealed trait shutdown
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CameraStreamState
  
  /** The camera stream is currently streaming. */
  @js.native
  sealed trait streaming
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CameraStreamState
  
  val blockedForPrivacy: blockedForPrivacy with java.lang.String = js.native
  val notStreaming: notStreaming with java.lang.String = js.native
  val shutdown: shutdown with java.lang.String = js.native
  val streaming: streaming with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CameraStreamState with java.lang.String
  ] = js.native
}

