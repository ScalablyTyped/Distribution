package typings.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of creating an audio file output node. */
@js.native
trait CreateAudioFileOutputNodeResult extends js.Object {
  /** Gets the audio file output node. */
  var fileOutputNode: AudioFileOutputNode = js.native
  /** Gets the status of audio file output node creation. */
  var status: AudioFileNodeCreationStatus = js.native
}

object CreateAudioFileOutputNodeResult {
  @scala.inline
  def apply(fileOutputNode: AudioFileOutputNode, status: AudioFileNodeCreationStatus): CreateAudioFileOutputNodeResult = {
    val __obj = js.Dynamic.literal(fileOutputNode = fileOutputNode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAudioFileOutputNodeResult]
  }
  @scala.inline
  implicit class CreateAudioFileOutputNodeResultOps[Self <: CreateAudioFileOutputNodeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileOutputNode(value: AudioFileOutputNode): Self = this.set("fileOutputNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: AudioFileNodeCreationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

