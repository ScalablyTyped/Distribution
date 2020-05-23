package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The message that is spoken by Cortana and shown on the Cortana canvas. */
trait VoiceCommandUserMessage extends js.Object {
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
}

