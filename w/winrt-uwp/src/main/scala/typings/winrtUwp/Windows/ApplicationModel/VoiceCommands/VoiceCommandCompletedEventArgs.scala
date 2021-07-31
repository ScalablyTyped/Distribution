package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the VoiceCommandCompleted event. */
trait VoiceCommandCompletedEventArgs extends StObject {
  
  /** The reason the voice command completed. */
  var reason: VoiceCommandCompletionReason
}
object VoiceCommandCompletedEventArgs {
  
  @scala.inline
  def apply(reason: VoiceCommandCompletionReason): VoiceCommandCompletedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandCompletedEventArgs]
  }
  
  @scala.inline
  implicit class VoiceCommandCompletedEventArgsMutableBuilder[Self <: VoiceCommandCompletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: VoiceCommandCompletionReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
