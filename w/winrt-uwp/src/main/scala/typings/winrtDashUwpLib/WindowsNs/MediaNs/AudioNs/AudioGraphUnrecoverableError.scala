package typings
package winrtDashUwpLib.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioGraphUnrecoverableError extends js.Object

/** Defines unrecoverable errors for the audio graph. */
@JSGlobal("Windows.Media.Audio.AudioGraphUnrecoverableError")
@js.native
object AudioGraphUnrecoverableError extends js.Object {
  /** The audio device has been lost. */
  @js.native
  sealed trait audioDeviceLost
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioGraphUnrecoverableError
  
  /** The audio session has been disconnected. */
  @js.native
  sealed trait audioSessionDisconnected
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioGraphUnrecoverableError
  
  /** No unrecoverable errors were found. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioGraphUnrecoverableError
  
  /** An unknown failure occurred during creation of the audio graph. */
  @js.native
  sealed trait unknownFailure
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioGraphUnrecoverableError
  
  /* 1 */ val audioDeviceLost: audioDeviceLost with scala.Double = js.native
  /* 2 */ val audioSessionDisconnected: audioSessionDisconnected with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val unknownFailure: unknownFailure with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioGraphUnrecoverableError with scala.Double
  ] = js.native
}

