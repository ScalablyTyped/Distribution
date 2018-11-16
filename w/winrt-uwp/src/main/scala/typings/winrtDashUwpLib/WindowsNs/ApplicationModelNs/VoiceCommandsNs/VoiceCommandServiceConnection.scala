package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The background app service connection to Cortana. */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandServiceConnection")
@js.native
abstract class VoiceCommandServiceConnection () extends js.Object {
  /** Gets the locale for the voice command. */
  var language: winrtDashUwpLib.WindowsNs.GlobalizationNs.Language = js.native
  /** Event raised when the voice command is completed and the background app service is about to be terminated. */
  @JSName("onvoicecommandcompleted")
  var onvoicecommandcompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[VoiceCommandServiceConnection, VoiceCommandCompletedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_voicecommandcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.voicecommandcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[VoiceCommandServiceConnection, VoiceCommandCompletedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Retrieves the voice command that the user submitted to Cortana by voice or text.
                   * @return The VoiceCommand .
                   */
  def getVoiceCommandAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[VoiceCommand] = js.native
  /** Event raised when the voice command is completed and the background app service is about to be terminated. */
  def onvoicecommandcompleted(
    ev: VoiceCommandCompletedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[VoiceCommandServiceConnection]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_voicecommandcompleted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.voicecommandcompleted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[VoiceCommandServiceConnection, VoiceCommandCompletedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Sends a response to Cortana indicating the voice command has failed.
                   * @param response The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas.
                   * @return An asynchronous handler called when the operation is complete.
                   */
  def reportFailureAsync(response: VoiceCommandResponse): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Sends a response to Cortana indicating voice command is being processed.
                   * @param response The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas.
                   * @return An asynchronous handler called when the operation is complete.
                   */
  def reportProgressAsync(response: VoiceCommandResponse): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Sends a response to Cortana indicating the voice command has succeeded.
                   * @param response The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas.
                   * @return An asynchronous handler called when the operation is complete.
                   */
  def reportSuccessAsync(response: VoiceCommandResponse): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Sends a response to Cortana indicating the command should be handled by the app in the foreground.
                   * @param response The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas.
                   * @return An asynchronous handler called when the operation is complete.
                   */
  def requestAppLaunchAsync(response: VoiceCommandResponse): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Sends a response to Cortana indicating the voice command requires confirmation.
                   * @param response The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas.
                   * @return The VoiceCommandConfirmationResult object with the user's response.
                   */
  def requestConfirmationAsync(response: VoiceCommandResponse): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[VoiceCommandConfirmationResult] = js.native
  /**
                   * Sends a response to Cortana indicating the voice command returned more than one result and requires the user to select one.
                   * @param response The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas.
                   * @return The VoiceCommandDisambiguationResult object with the user's response.
                   */
  def requestDisambiguationAsync(response: VoiceCommandResponse): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[VoiceCommandDisambiguationResult] = js.native
}

/** The background app service connection to Cortana. */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandServiceConnection")
@js.native
object VoiceCommandServiceConnection extends js.Object {
  /**
                   * Retrieves a VoiceCommandServiceConnection object from the AppServiceTriggerDetails that contains info associated with the background task for the app service.
                   * @param triggerDetails Contains info associated with the background task for the app service.
                   * @return The background app service connection to Cortana.
                   */
  def fromAppServiceTriggerDetails(triggerDetails: winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppServiceNs.AppServiceTriggerDetails): winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandServiceConnection = js.native
}

