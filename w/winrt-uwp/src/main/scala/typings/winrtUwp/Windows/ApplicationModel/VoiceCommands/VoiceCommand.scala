package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The command given to Cortana, using either speech or text, and routed to a background app. */
@js.native
trait VoiceCommand extends js.Object {
  
  /** Gets the value of the Name attribute for the Command element declared in the Voice Command Definition (VCD) file. */
  var commandName: String = js.native
  
  /** Gets a dictionary containing the semantic properties of the recognized phrase in the voice command. */
  var properties: IMapView[String, IVectorView[_]] = js.native
  
  /** Gets the SpeechRecognitionResult object representing the results returned by the voice command. */
  var speechRecognitionResult: SpeechRecognitionResult = js.native
}
object VoiceCommand {
  
  @scala.inline
  def apply(
    commandName: String,
    properties: IMapView[String, IVectorView[_]],
    speechRecognitionResult: SpeechRecognitionResult
  ): VoiceCommand = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], speechRecognitionResult = speechRecognitionResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommand]
  }
  
  @scala.inline
  implicit class VoiceCommandOps[Self <: VoiceCommand] (val x: Self) extends AnyVal {
    
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
    def setCommandName(value: String): Self = this.set("commandName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IMapView[String, IVectorView[_]]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechRecognitionResult(value: SpeechRecognitionResult): Self = this.set("speechRecognitionResult", value.asInstanceOf[js.Any])
  }
}
