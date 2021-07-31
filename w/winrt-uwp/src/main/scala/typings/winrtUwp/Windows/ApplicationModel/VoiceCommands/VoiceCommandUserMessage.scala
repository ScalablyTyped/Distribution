package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The message that is spoken by Cortana and shown on the Cortana canvas. */
trait VoiceCommandUserMessage extends StObject {
  
  /** Gets or sets the message that is shown on the Cortana canvas. */
  var displayMessage: String
  
  /** The message that is spoken by Cortana. */
  var spokenMessage: String
}
object VoiceCommandUserMessage {
  
  @scala.inline
  def apply(displayMessage: String, spokenMessage: String): VoiceCommandUserMessage = {
    val __obj = js.Dynamic.literal(displayMessage = displayMessage.asInstanceOf[js.Any], spokenMessage = spokenMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandUserMessage]
  }
  
  @scala.inline
  implicit class VoiceCommandUserMessageMutableBuilder[Self <: VoiceCommandUserMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayMessage(value: String): Self = StObject.set(x, "displayMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpokenMessage(value: String): Self = StObject.set(x, "spokenMessage", value.asInstanceOf[js.Any])
  }
}
