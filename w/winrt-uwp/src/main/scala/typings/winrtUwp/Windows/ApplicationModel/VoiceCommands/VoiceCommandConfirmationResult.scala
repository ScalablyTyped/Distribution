package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The response to the question specified by the background app and shown on the Cortana confirmation screen. This screen is displayed when the background app service calls RequestConfirmationAsync . */
trait VoiceCommandConfirmationResult extends js.Object {
  /** Gets the response to the question specified by the background app and shown on the Cortana confirmation screen. */
  var confirmed: Boolean
}

object VoiceCommandConfirmationResult {
  @scala.inline
  def apply(confirmed: Boolean): VoiceCommandConfirmationResult = {
    val __obj = js.Dynamic.literal(confirmed = confirmed.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandConfirmationResult]
  }
}

