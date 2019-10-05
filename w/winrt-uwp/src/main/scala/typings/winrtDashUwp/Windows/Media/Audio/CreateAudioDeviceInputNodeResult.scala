package typings.winrtDashUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of creating an audio device input node. */
@JSGlobal("Windows.Media.Audio.CreateAudioDeviceInputNodeResult")
@js.native
abstract class CreateAudioDeviceInputNodeResult () extends js.Object {
  /** Gets the audio device input node. */
  var deviceInputNode: AudioDeviceInputNode = js.native
  /** Gets the status of audio device input node creation. */
  var status: AudioDeviceNodeCreationStatus = js.native
}

