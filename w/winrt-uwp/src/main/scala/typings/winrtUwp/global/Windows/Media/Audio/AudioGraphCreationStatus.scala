package typings.winrtUwp.global.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines status values for audio graph creation. */
@JSGlobal("Windows.Media.Audio.AudioGraphCreationStatus")
@js.native
object AudioGraphCreationStatus extends js.Object {
  /* 1 */ val deviceNotAvailable: typings.winrtUwp.Windows.Media.Audio.AudioGraphCreationStatus.deviceNotAvailable with Double = js.native
  /* 2 */ val formatNotSupported: typings.winrtUwp.Windows.Media.Audio.AudioGraphCreationStatus.formatNotSupported with Double = js.native
  /* 0 */ val success: typings.winrtUwp.Windows.Media.Audio.AudioGraphCreationStatus.success with Double = js.native
  /* 3 */ val unknownFailure: typings.winrtUwp.Windows.Media.Audio.AudioGraphCreationStatus.unknownFailure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Audio.AudioGraphCreationStatus with Double] = js.native
}

