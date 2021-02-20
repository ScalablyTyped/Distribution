package typings.winrtUwp.Windows.Media.SpeechRecognition

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.completed
import typings.winrtUwp.winrtUwpStrings.resultgenerated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages speech input for free-form dictation, or an arbitrary sequence of words or phrases that are defined in a grammar set. */
@js.native
trait SpeechContinuousRecognitionSession extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_completed(
    `type`: completed,
    listener: TypedEventHandler[SpeechContinuousRecognitionSession, SpeechContinuousRecognitionCompletedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resultgenerated(
    `type`: resultgenerated,
    listener: TypedEventHandler[
      SpeechContinuousRecognitionSession, 
      SpeechContinuousRecognitionResultGeneratedEventArgs
    ]
  ): Unit = js.native
  
  /** Gets or sets the time threshold at which the continuous recognition session ends due to lack of audio input. */
  var autoStopSilenceTimeout: Double = js.native
  
  /**
    * Asynchronously cancel the continuous speech recognition session and discard all pending recognition results.
    * @return An asynchronous handler called when the operation is complete.
    */
  def cancelAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Occurs when a continuous recognition session ends. */
  def oncompleted(
    ev: SpeechContinuousRecognitionCompletedEventArgs with WinRTEvent[SpeechContinuousRecognitionSession]
  ): Unit = js.native
  /** Occurs when a continuous recognition session ends. */
  @JSName("oncompleted")
  var oncompleted_Original: TypedEventHandler[SpeechContinuousRecognitionSession, SpeechContinuousRecognitionCompletedEventArgs] = js.native
  
  /** Occurs when the speech recognizer returns the result from a continuous recognition session. */
  def onresultgenerated(
    ev: SpeechContinuousRecognitionResultGeneratedEventArgs with WinRTEvent[SpeechContinuousRecognitionSession]
  ): Unit = js.native
  /** Occurs when the speech recognizer returns the result from a continuous recognition session. */
  @JSName("onresultgenerated")
  var onresultgenerated_Original: TypedEventHandler[
    SpeechContinuousRecognitionSession, 
    SpeechContinuousRecognitionResultGeneratedEventArgs
  ] = js.native
  
  /**
    * Asynchronously pause a continuous speech recognition session.
    * @return An asynchronous handler called when the operation is complete.
    */
  def pauseAsync(): IPromiseWithIAsyncAction = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_completed(
    `type`: completed,
    listener: TypedEventHandler[SpeechContinuousRecognitionSession, SpeechContinuousRecognitionCompletedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resultgenerated(
    `type`: resultgenerated,
    listener: TypedEventHandler[
      SpeechContinuousRecognitionSession, 
      SpeechContinuousRecognitionResultGeneratedEventArgs
    ]
  ): Unit = js.native
  
  /** Resumes a continuous speech recognition session, if paused. */
  def resume(): Unit = js.native
  
  /**
    * Overload
    * @return An asynchronous handler called when the operation is complete.
    */
  def startAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Overload
    * @param mode The speech recognition behavior.
    * @return An asynchronous handler called when the operation is complete.
    */
  def startAsync(mode: SpeechContinuousRecognitionMode): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously end a continuous speech recognition session and pass all pending recognition results to the ResultGenerated event.
    * @return An asynchronous handler called when the operation is complete.
    */
  def stopAsync(): IPromiseWithIAsyncAction = js.native
}
