package typings.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of creating an audio device output node. */
@js.native
trait CreateAudioDeviceOutputNodeResult extends js.Object {
  
  /** Gets the audio device output node. */
  var deviceOutputNode: AudioDeviceOutputNode = js.native
  
  /** Gets the status of audio device output node creation. */
  var status: AudioDeviceNodeCreationStatus = js.native
}
object CreateAudioDeviceOutputNodeResult {
  
  @scala.inline
  def apply(deviceOutputNode: AudioDeviceOutputNode, status: AudioDeviceNodeCreationStatus): CreateAudioDeviceOutputNodeResult = {
    val __obj = js.Dynamic.literal(deviceOutputNode = deviceOutputNode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAudioDeviceOutputNodeResult]
  }
  
  @scala.inline
  implicit class CreateAudioDeviceOutputNodeResultOps[Self <: CreateAudioDeviceOutputNodeResult] (val x: Self) extends AnyVal {
    
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
    def setDeviceOutputNode(value: AudioDeviceOutputNode): Self = this.set("deviceOutputNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: AudioDeviceNodeCreationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
