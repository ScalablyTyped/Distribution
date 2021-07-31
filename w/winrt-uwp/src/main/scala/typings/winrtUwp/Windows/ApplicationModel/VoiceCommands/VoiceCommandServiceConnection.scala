package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Globalization.Language
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.voicecommandcompleted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The background app service connection to Cortana. */
@js.native
trait VoiceCommandServiceConnection extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_voicecommandcompleted(
    `type`: voicecommandcompleted,
    listener: TypedEventHandler[VoiceCommandServiceConnection, VoiceCommandCompletedEventArgs]
  ): Unit = js.native
  
  /**
    * Retrieves the voice command that the user submitted to Cortana by voice or text.
    * @return The VoiceCommand .
    */
  def getVoiceCommandAsync(): IPromiseWithIAsyncOperation[VoiceCommand] = js.native
  
  /** Gets the locale for the voice command. */
  var language: Language = js.native
  
  /** Event raised when the voice command is completed and the background app service is about to be terminated. */
  def onvoicecommandcompleted(ev: VoiceCommandCompletedEventArgs & WinRTEvent[VoiceCommandServiceConnection]): Unit = js.native
  /** Event raised when the voice command is completed and the background app service is about to be terminated. */
  @JSName("onvoicecommandcompleted")
  var onvoicecommandcompleted_Original: TypedEventHandler[VoiceCommandServiceConnection, VoiceCommandCompletedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_voicecommandcompleted(
    `type`: voicecommandcompleted,
    listener: TypedEventHandler[VoiceCommandServiceConnection, VoiceCommandCompletedEventArgs]
  ): Unit = js.native
  
  /**
    * Sends a response to Cortana indicating the voice command has failed.
    * @param response The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas.
    * @return An asynchronous handler called when the operation is complete.
    */
  def reportFailureAsync(response: VoiceCommandResponse): IPromiseWithIAsyncAction = js.native
  
  /**
    * Sends a response to Cortana indicating voice command is being processed.
    * @param response The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas.
    * @return An asynchronous handler called when the operation is complete.
    */
  def reportProgressAsync(response: VoiceCommandResponse): IPromiseWithIAsyncAction = js.native
  
  /**
    * Sends a response to Cortana indicating the voice command has succeeded.
    * @param response The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas.
    * @return An asynchronous handler called when the operation is complete.
    */
  def reportSuccessAsync(response: VoiceCommandResponse): IPromiseWithIAsyncAction = js.native
  
  /**
    * Sends a response to Cortana indicating the command should be handled by the app in the foreground.
    * @param response The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas.
    * @return An asynchronous handler called when the operation is complete.
    */
  def requestAppLaunchAsync(response: VoiceCommandResponse): IPromiseWithIAsyncAction = js.native
  
  /**
    * Sends a response to Cortana indicating the voice command requires confirmation.
    * @param response The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas.
    * @return The VoiceCommandConfirmationResult object with the user's response.
    */
  def requestConfirmationAsync(response: VoiceCommandResponse): IPromiseWithIAsyncOperation[VoiceCommandConfirmationResult] = js.native
  
  /**
    * Sends a response to Cortana indicating the voice command returned more than one result and requires the user to select one.
    * @param response The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas.
    * @return The VoiceCommandDisambiguationResult object with the user's response.
    */
  def requestDisambiguationAsync(response: VoiceCommandResponse): IPromiseWithIAsyncOperation[VoiceCommandDisambiguationResult] = js.native
}
