package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas. */
trait VoiceCommandResponse extends StObject {
  
  /** Gets or sets a string as a launch parameter that can be associated with the response by the background app service. */
  var appLaunchArgument: String
  
  /** The initial message that is spoken by Cortana and shown on the Cortana canvas. */
  var message: VoiceCommandUserMessage
  
  /** The secondary message (for disambiguation and confirmation screens only) that is spoken by Cortana and shown on the Cortana canvas, if a response was not understood. */
  var repeatMessage: VoiceCommandUserMessage
  
  /** The collection of assets, containing image and text data, provided by the background app service for display on the Cortana canvas. */
  var voiceCommandContentTiles: IVector[VoiceCommandContentTile]
}
object VoiceCommandResponse {
  
  inline def apply(
    appLaunchArgument: String,
    message: VoiceCommandUserMessage,
    repeatMessage: VoiceCommandUserMessage,
    voiceCommandContentTiles: IVector[VoiceCommandContentTile]
  ): VoiceCommandResponse = {
    val __obj = js.Dynamic.literal(appLaunchArgument = appLaunchArgument.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], repeatMessage = repeatMessage.asInstanceOf[js.Any], voiceCommandContentTiles = voiceCommandContentTiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoiceCommandResponse] (val x: Self) extends AnyVal {
    
    inline def setAppLaunchArgument(value: String): Self = StObject.set(x, "appLaunchArgument", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: VoiceCommandUserMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setRepeatMessage(value: VoiceCommandUserMessage): Self = StObject.set(x, "repeatMessage", value.asInstanceOf[js.Any])
    
    inline def setVoiceCommandContentTiles(value: IVector[VoiceCommandContentTile]): Self = StObject.set(x, "voiceCommandContentTiles", value.asInstanceOf[js.Any])
  }
}
