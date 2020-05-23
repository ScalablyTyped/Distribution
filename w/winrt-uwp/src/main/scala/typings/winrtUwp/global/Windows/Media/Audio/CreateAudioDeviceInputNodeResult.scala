package typings.winrtUwp.global.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of creating an audio device input node. */
@JSGlobal("Windows.Media.Audio.CreateAudioDeviceInputNodeResult")
@js.native
abstract class CreateAudioDeviceInputNodeResult ()
  extends typings.winrtUwp.Windows.Media.Audio.CreateAudioDeviceInputNodeResult {
  /** Gets the audio device input node. */
  /* CompleteClass */
  override var deviceInputNode: typings.winrtUwp.Windows.Media.Audio.AudioDeviceInputNode = js.native
  /** Gets the status of audio device input node creation. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Media.Audio.AudioDeviceNodeCreationStatus = js.native
}

