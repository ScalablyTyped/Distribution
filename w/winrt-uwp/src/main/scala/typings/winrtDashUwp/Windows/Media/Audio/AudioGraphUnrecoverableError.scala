package typings.winrtDashUwp.Windows.Media.Audio

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Audio.AudioGraphUnrecoverableError.audioDeviceLost
import typings.winrtDashUwp.Windows.Media.Audio.AudioGraphUnrecoverableError.audioSessionDisconnected
import typings.winrtDashUwp.Windows.Media.Audio.AudioGraphUnrecoverableError.none
import typings.winrtDashUwp.Windows.Media.Audio.AudioGraphUnrecoverableError.unknownFailure
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioGraphUnrecoverableError with Double] = js.native
  /* 1 */ @js.native
  object audioDeviceLost extends TopLevel[audioDeviceLost with Double]
  
  /* 2 */ @js.native
  object audioSessionDisconnected extends TopLevel[audioSessionDisconnected with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object unknownFailure extends TopLevel[unknownFailure with Double]
  
}

