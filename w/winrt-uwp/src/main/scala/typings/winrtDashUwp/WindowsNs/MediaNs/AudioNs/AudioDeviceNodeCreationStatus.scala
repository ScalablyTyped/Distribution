package typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioDeviceNodeCreationStatus extends js.Object

/** Defines status values for audio device node creation. */
@JSGlobal("Windows.Media.Audio.AudioDeviceNodeCreationStatus")
@js.native
object AudioDeviceNodeCreationStatus extends js.Object {
  /** Access to the audio device was denied. */
  @js.native
  sealed trait accessDenied extends AudioDeviceNodeCreationStatus
  
  /** The audio device is not available. */
  @js.native
  sealed trait deviceNotAvailable extends AudioDeviceNodeCreationStatus
  
  /** The format for audio device node creation is not supported. */
  @js.native
  sealed trait formatNotSupported extends AudioDeviceNodeCreationStatus
  
  /** Audio device node creation succeeded. */
  @js.native
  sealed trait success extends AudioDeviceNodeCreationStatus
  
  /** An unknown failure occurred in creation of the audio device node. */
  @js.native
  sealed trait unknownFailure extends AudioDeviceNodeCreationStatus
  
  /* 4 */ val accessDenied: typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs.AudioDeviceNodeCreationStatus.accessDenied with Double = js.native
  /* 1 */ val deviceNotAvailable: typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs.AudioDeviceNodeCreationStatus.deviceNotAvailable with Double = js.native
  /* 2 */ val formatNotSupported: typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs.AudioDeviceNodeCreationStatus.formatNotSupported with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs.AudioDeviceNodeCreationStatus.success with Double = js.native
  /* 3 */ val unknownFailure: typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs.AudioDeviceNodeCreationStatus.unknownFailure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioDeviceNodeCreationStatus with Double] = js.native
}

