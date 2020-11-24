package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The response to the question specified by the background app and shown on the Cortana confirmation screen. This screen is displayed when the background app service calls RequestConfirmationAsync . */
@js.native
trait VoiceCommandConfirmationResult extends js.Object {
  
  /** Gets the response to the question specified by the background app and shown on the Cortana confirmation screen. */
  var confirmed: Boolean = js.native
}
object VoiceCommandConfirmationResult {
  
  @scala.inline
  def apply(confirmed: Boolean): VoiceCommandConfirmationResult = {
    val __obj = js.Dynamic.literal(confirmed = confirmed.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandConfirmationResult]
  }
  
  @scala.inline
  implicit class VoiceCommandConfirmationResultOps[Self <: VoiceCommandConfirmationResult] (val x: Self) extends AnyVal {
    
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
    def setConfirmed(value: Boolean): Self = this.set("confirmed", value.asInstanceOf[js.Any])
  }
}
