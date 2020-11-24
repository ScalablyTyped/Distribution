package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the VoiceCommandCompleted event. */
@js.native
trait VoiceCommandCompletedEventArgs extends js.Object {
  
  /** The reason the voice command completed. */
  var reason: VoiceCommandCompletionReason = js.native
}
object VoiceCommandCompletedEventArgs {
  
  @scala.inline
  def apply(reason: VoiceCommandCompletionReason): VoiceCommandCompletedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandCompletedEventArgs]
  }
  
  @scala.inline
  implicit class VoiceCommandCompletedEventArgsOps[Self <: VoiceCommandCompletedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setReason(value: VoiceCommandCompletionReason): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
