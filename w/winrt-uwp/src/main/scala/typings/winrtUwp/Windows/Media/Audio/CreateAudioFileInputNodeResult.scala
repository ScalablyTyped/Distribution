package typings.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of creating an audio file input node. */
trait CreateAudioFileInputNodeResult extends js.Object {
  /** Gets the audio file input node. */
  var fileInputNode: AudioFileInputNode
  /** Gets the status of audio file input node creation. */
  var status: AudioFileNodeCreationStatus
}

object CreateAudioFileInputNodeResult {
  @scala.inline
  def apply(fileInputNode: AudioFileInputNode, status: AudioFileNodeCreationStatus): CreateAudioFileInputNodeResult = {
    val __obj = js.Dynamic.literal(fileInputNode = fileInputNode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAudioFileInputNodeResult]
  }
}

