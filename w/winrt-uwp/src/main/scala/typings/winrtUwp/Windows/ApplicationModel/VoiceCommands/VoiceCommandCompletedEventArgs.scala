package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the VoiceCommandCompleted event. */
trait VoiceCommandCompletedEventArgs extends js.Object {
  /** The reason the voice command completed. */
  var reason: VoiceCommandCompletionReason
}

object VoiceCommandCompletedEventArgs {
  @scala.inline
  def apply(reason: VoiceCommandCompletionReason): VoiceCommandCompletedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandCompletedEventArgs]
  }
}

