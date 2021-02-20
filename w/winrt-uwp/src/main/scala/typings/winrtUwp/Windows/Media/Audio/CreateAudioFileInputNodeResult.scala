package typings.winrtUwp.Windows.Media.Audio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of creating an audio file input node. */
@js.native
trait CreateAudioFileInputNodeResult extends StObject {
  
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
  implicit class CreateAudioFileInputNodeResultMutableBuilder[Self <: CreateAudioFileInputNodeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileInputNode(value: AudioFileInputNode): Self = StObject.set(x, "fileInputNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: AudioFileNodeCreationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
