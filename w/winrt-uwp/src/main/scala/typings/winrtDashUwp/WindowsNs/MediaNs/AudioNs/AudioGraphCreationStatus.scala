package typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioGraphCreationStatus extends js.Object

/** Defines status values for audio graph creation. */
@JSGlobal("Windows.Media.Audio.AudioGraphCreationStatus")
@js.native
object AudioGraphCreationStatus extends js.Object {
  /** The PrimaryRenderDevice for the audio graph is not available. */
  @js.native
  sealed trait deviceNotAvailable extends AudioGraphCreationStatus
  
  /** The audio stream format is not supported by the audio graph. */
  @js.native
  sealed trait formatNotSupported extends AudioGraphCreationStatus
  
  /** Creation of the audio graph succeeded. */
  @js.native
  sealed trait success extends AudioGraphCreationStatus
  
  /** An unknown failure occurred during creation of the audio graph. */
  @js.native
  sealed trait unknownFailure extends AudioGraphCreationStatus
  
  /* 1 */ val deviceNotAvailable: typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs.AudioGraphCreationStatus.deviceNotAvailable with Double = js.native
  /* 2 */ val formatNotSupported: typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs.AudioGraphCreationStatus.formatNotSupported with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs.AudioGraphCreationStatus.success with Double = js.native
  /* 3 */ val unknownFailure: typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs.AudioGraphCreationStatus.unknownFailure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioGraphCreationStatus with Double] = js.native
}

