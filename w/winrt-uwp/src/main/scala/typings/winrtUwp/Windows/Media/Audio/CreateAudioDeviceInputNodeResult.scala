package typings.winrtUwp.Windows.Media.Audio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of creating an audio device input node. */
trait CreateAudioDeviceInputNodeResult extends StObject {
  
  /** Gets the audio device input node. */
  var deviceInputNode: AudioDeviceInputNode
  
  /** Gets the status of audio device input node creation. */
  var status: AudioDeviceNodeCreationStatus
}
object CreateAudioDeviceInputNodeResult {
  
  inline def apply(deviceInputNode: AudioDeviceInputNode, status: AudioDeviceNodeCreationStatus): CreateAudioDeviceInputNodeResult = {
    val __obj = js.Dynamic.literal(deviceInputNode = deviceInputNode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAudioDeviceInputNodeResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAudioDeviceInputNodeResult] (val x: Self) extends AnyVal {
    
    inline def setDeviceInputNode(value: AudioDeviceInputNode): Self = StObject.set(x, "deviceInputNode", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AudioDeviceNodeCreationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
