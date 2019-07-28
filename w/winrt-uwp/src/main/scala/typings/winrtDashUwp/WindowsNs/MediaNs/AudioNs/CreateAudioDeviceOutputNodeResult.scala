package typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of creating an audio device output node. */
@JSGlobal("Windows.Media.Audio.CreateAudioDeviceOutputNodeResult")
@js.native
abstract class CreateAudioDeviceOutputNodeResult () extends js.Object {
  /** Gets the audio device output node. */
  var deviceOutputNode: AudioDeviceOutputNode = js.native
  /** Gets the status of audio device output node creation. */
  var status: AudioDeviceNodeCreationStatus = js.native
}

