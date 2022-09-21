package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The command given to Cortana, using either speech or text, and routed to a background app. */
trait VoiceCommand extends StObject {
  
  /** Gets the value of the Name attribute for the Command element declared in the Voice Command Definition (VCD) file. */
  var commandName: String
  
  /** Gets a dictionary containing the semantic properties of the recognized phrase in the voice command. */
  var properties: IMapView[String, IVectorView[Any]]
  
  /** Gets the SpeechRecognitionResult object representing the results returned by the voice command. */
  var speechRecognitionResult: SpeechRecognitionResult
}
object VoiceCommand {
  
  inline def apply(
    commandName: String,
    properties: IMapView[String, IVectorView[Any]],
    speechRecognitionResult: SpeechRecognitionResult
  ): VoiceCommand = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], speechRecognitionResult = speechRecognitionResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommand]
  }
  
  extension [Self <: VoiceCommand](x: Self) {
    
    inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IMapView[String, IVectorView[Any]]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setSpeechRecognitionResult(value: SpeechRecognitionResult): Self = StObject.set(x, "speechRecognitionResult", value.asInstanceOf[js.Any])
  }
}
