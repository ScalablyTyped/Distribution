package typings.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of creating an audio device output node. */
trait CreateAudioDeviceOutputNodeResult extends js.Object {
  /** Gets the audio device output node. */
  var deviceOutputNode: AudioDeviceOutputNode
  /** Gets the status of audio device output node creation. */
  var status: AudioDeviceNodeCreationStatus
}

object CreateAudioDeviceOutputNodeResult {
  @scala.inline
  def apply(deviceOutputNode: AudioDeviceOutputNode, status: AudioDeviceNodeCreationStatus): CreateAudioDeviceOutputNodeResult = {
    val __obj = js.Dynamic.literal(deviceOutputNode = deviceOutputNode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAudioDeviceOutputNodeResult]
  }
}

