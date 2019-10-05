package typings.winrtDashUwp.Windows.ApplicationModel.VoiceCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The response to the question specified by the background app and shown on the Cortana confirmation screen. This screen is displayed when the background app service calls RequestConfirmationAsync . */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandConfirmationResult")
@js.native
abstract class VoiceCommandConfirmationResult () extends js.Object {
  /** Gets the response to the question specified by the background app and shown on the Cortana confirmation screen. */
  var confirmed: Boolean = js.native
}

