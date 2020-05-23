package typings.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of creating an audio file output node. */
trait CreateAudioFileOutputNodeResult extends js.Object {
  /** Gets the audio file output node. */
  var fileOutputNode: AudioFileOutputNode
  /** Gets the status of audio file output node creation. */
  var status: AudioFileNodeCreationStatus
}

object CreateAudioFileOutputNodeResult {
  @scala.inline
  def apply(fileOutputNode: AudioFileOutputNode, status: AudioFileNodeCreationStatus): CreateAudioFileOutputNodeResult = {
    val __obj = js.Dynamic.literal(fileOutputNode = fileOutputNode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAudioFileOutputNodeResult]
  }
}

