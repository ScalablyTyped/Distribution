package typings.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of creating an audio file input node. */
@js.native
trait CreateAudioFileInputNodeResult extends js.Object {
  
  /** Gets the audio file input node. */
  var fileInputNode: AudioFileInputNode = js.native
  
  /** Gets the status of audio file input node creation. */
  var status: AudioFileNodeCreationStatus = js.native
}
object CreateAudioFileInputNodeResult {
  
  @scala.inline
  def apply(fileInputNode: AudioFileInputNode, status: AudioFileNodeCreationStatus): CreateAudioFileInputNodeResult = {
    val __obj = js.Dynamic.literal(fileInputNode = fileInputNode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAudioFileInputNodeResult]
  }
  
  @scala.inline
  implicit class CreateAudioFileInputNodeResultOps[Self <: CreateAudioFileInputNodeResult] (val x: Self) extends AnyVal {
    
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
    def setFileInputNode(value: AudioFileInputNode): Self = this.set("fileInputNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: AudioFileNodeCreationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
