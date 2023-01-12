package typings.winrtUwp.Windows.Media.Audio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of creating an audio file output node. */
trait CreateAudioFileOutputNodeResult extends StObject {
  
  /** Gets the audio file output node. */
  var fileOutputNode: AudioFileOutputNode
  
  /** Gets the status of audio file output node creation. */
  var status: AudioFileNodeCreationStatus
}
object CreateAudioFileOutputNodeResult {
  
  inline def apply(fileOutputNode: AudioFileOutputNode, status: AudioFileNodeCreationStatus): CreateAudioFileOutputNodeResult = {
    val __obj = js.Dynamic.literal(fileOutputNode = fileOutputNode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAudioFileOutputNodeResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAudioFileOutputNodeResult] (val x: Self) extends AnyVal {
    
    inline def setFileOutputNode(value: AudioFileOutputNode): Self = StObject.set(x, "fileOutputNode", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AudioFileNodeCreationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
