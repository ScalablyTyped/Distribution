package typings.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of creating an audio device input node. */
trait CreateAudioDeviceInputNodeResult extends js.Object {
  /** Gets the audio device input node. */
  var deviceInputNode: AudioDeviceInputNode
  /** Gets the status of audio device input node creation. */
  var status: AudioDeviceNodeCreationStatus
}

object CreateAudioDeviceInputNodeResult {
  @scala.inline
  def apply(deviceInputNode: AudioDeviceInputNode, status: AudioDeviceNodeCreationStatus): CreateAudioDeviceInputNodeResult = {
    val __obj = js.Dynamic.literal(deviceInputNode = deviceInputNode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAudioDeviceInputNodeResult]
  }
}

