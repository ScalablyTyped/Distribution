package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas. */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse")
@js.native
abstract class VoiceCommandResponse () extends js.Object {
  /** Gets or sets a string as a launch parameter that can be associated with the response by the background app service. */
  var appLaunchArgument: java.lang.String = js.native
  /** The initial message that is spoken by Cortana and shown on the Cortana canvas. */
  var message: VoiceCommandUserMessage = js.native
  /** The secondary message (for disambiguation and confirmation screens only) that is spoken by Cortana and shown on the Cortana canvas, if a response was not understood. */
  var repeatMessage: VoiceCommandUserMessage = js.native
  /** The collection of assets, containing image and text data, provided by the background app service for display on the Cortana canvas. */
  var voiceCommandContentTiles: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[VoiceCommandContentTile] = js.native
}

/** The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas. */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse")
@js.native
object VoiceCommandResponse extends js.Object {
  /** Gets the maximum number of content tiles the background app service can display on the Cortana canvas. */
  var maxSupportedVoiceCommandContentTiles: scala.Double = js.native
  /**
                   * Creates a VoiceCommandResponse object used in calls to ReportProgressAsync , ReportSuccessAsync or ReportFailureAsync .
                   * @param message The message that is spoken by Cortana and shown on the Cortana canvas.
                   * @param contentTiles The collection of assets, containing image and text data, shown on the Cortana canvas.
                   * @return The response from the background app service for progress, completion, confirmation, or disambiguation screens displayed on the Cortana canvas.
                   */
  def createResponse(
    message: winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandUserMessage,
    contentTiles: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[
      winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTile
    ]
  ): winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandResponse = js.native
  /**
                   * Creates a VoiceCommandResponse object used in calls to ReportProgressAsync , ReportSuccessAsync or ReportFailureAsync .
                   * @param userMessage The message that is spoken by Cortana and shown on the Cortana canvas.
                   * @return The response from the background app service for progress, completion, confirmation, or disambiguation screens displayed on the Cortana canvas.
                   */
  def createResponse(userMessage: winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandUserMessage): winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandResponse = js.native
  /**
                   * Creates a VoiceCommandResponse object used in calls to RequestConfirmationAsync or RequestDisambiguationAsync .
                   * @param message The initial message that is spoken by Cortana and shown on the Cortana canvas.
                   * @param repeatMessage The secondary message that is spoken by Cortana and shown on the Cortana canvas, if a response was not understood.
                   * @return The response from the background app service for progress, completion, confirmation, or disambiguation screens displayed on the Cortana canvas.
                   */
  def createResponseForPrompt(
    message: winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandUserMessage,
    repeatMessage: winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandUserMessage
  ): winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandResponse = js.native
  /**
                   * Creates a VoiceCommandResponse object used in calls to RequestConfirmationAsync or RequestDisambiguationAsync .
                   * @param message The initial message that is spoken by Cortana and shown on the Cortana canvas.
                   * @param repeatMessage The secondary message that is spoken by Cortana and shown on the Cortana canvas, if a response was not understood.
                   * @param contentTiles The collection of assets, containing image and text data, shown on the Cortana canvas.
                   * @return The response from the background app service for progress, completion, confirmation, or disambiguation screens displayed on the Cortana canvas.
                   */
  def createResponseForPrompt(
    message: winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandUserMessage,
    repeatMessage: winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandUserMessage,
    contentTiles: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[
      winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTile
    ]
  ): winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandResponse = js.native
}

