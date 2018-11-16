package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the VoiceCommandCompleted event. */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletedEventArgs")
@js.native
abstract class VoiceCommandCompletedEventArgs () extends js.Object {
  /** The reason the voice command completed. */
  var reason: VoiceCommandCompletionReason = js.native
}

