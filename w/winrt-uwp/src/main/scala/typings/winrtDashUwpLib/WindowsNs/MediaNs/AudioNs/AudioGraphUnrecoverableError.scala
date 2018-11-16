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
  
  val audioDeviceLost: audioDeviceLost with java.lang.String = js.native
  val audioSessionDisconnected: audioSessionDisconnected with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val unknownFailure: unknownFailure with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.AudioGraphUnrecoverableError with java.lang.String
  ] = js.native
}

