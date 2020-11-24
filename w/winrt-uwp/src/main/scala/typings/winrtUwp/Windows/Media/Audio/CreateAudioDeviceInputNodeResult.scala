package typings.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of creating an audio device input node. */
@js.native
trait CreateAudioDeviceInputNodeResult extends js.Object {
  
  /** Gets the audio device input node. */
  var deviceInputNode: AudioDeviceInputNode = js.native
  
  /** Gets the status of audio device input node creation. */
  var status: AudioDeviceNodeCreationStatus = js.native
}
object CreateAudioDeviceInputNodeResult {
  
  @scala.inline
  def apply(deviceInputNode: AudioDeviceInputNode, status: AudioDeviceNodeCreationStatus): CreateAudioDeviceInputNodeResult = {
    val __obj = js.Dynamic.literal(deviceInputNode = deviceInputNode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAudioDeviceInputNodeResult]
  }
  
  @scala.inline
  implicit class CreateAudioDeviceInputNodeResultOps[Self <: CreateAudioDeviceInputNodeResult] (val x: Self) extends AnyVal {
    
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
    def setDeviceInputNode(value: AudioDeviceInputNode): Self = this.set("deviceInputNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: AudioDeviceNodeCreationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
