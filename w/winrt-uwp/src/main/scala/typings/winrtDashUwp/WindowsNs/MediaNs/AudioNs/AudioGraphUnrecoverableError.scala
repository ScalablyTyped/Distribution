package typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs

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
  sealed trait audioDeviceLost extends AudioGraphUnrecoverableError
  
  /** The audio session has been disconnected. */
  @js.native
  sealed trait audioSessionDisconnected extends AudioGraphUnrecoverableError
  
  /** No unrecoverable errors were found. */
  @js.native
  sealed trait none extends AudioGraphUnrecoverableError
  
  /** An unknown failure occurred during creation of the audio graph. */
  @js.native
  sealed trait unknownFailure extends AudioGraphUnrecoverableError
  
  /* 1 */ val audioDeviceLost: typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs.AudioGraphUnrecoverableError.audioDeviceLost with Double = js.native
  /* 2 */ val audioSessionDisconnected: typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs.AudioGraphUnrecoverableError.audioSessionDisconnected with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs.AudioGraphUnrecoverableError.none with Double = js.native
  /* 3 */ val unknownFailure: typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs.AudioGraphUnrecoverableError.unknownFailure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioGraphUnrecoverableError with Double] = js.native
}

