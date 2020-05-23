package typings.winrtUwp.global.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines status values for audio device node creation. */
@JSGlobal("Windows.Media.Audio.AudioDeviceNodeCreationStatus")
@js.native
object AudioDeviceNodeCreationStatus extends js.Object {
  /* 4 */ val accessDenied: typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus.accessDenied with Double = js.native
  /* 1 */ val deviceNotAvailable: typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus.deviceNotAvailable with Double = js.native
  /* 2 */ val formatNotSupported: typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus.formatNotSupported with Double = js.native
  /* 0 */ val success: typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus.success with Double = js.native
  /* 3 */ val unknownFailure: typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus.unknownFailure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus with Double] = js.native
}

