package typings
package winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages speech input for free-form dictation, or an arbitrary sequence of words or phrases that are defined in a grammar set. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechContinuousRecognitionSession")
@js.native
abstract class SpeechContinuousRecognitionSession () extends js.Object {
  /** Gets or sets the time threshold at which the continuous recognition session ends due to lack of audio input. */
  var autoStopSilenceTimeout: scala.Double = js.native
  /** Occurs when a continuous recognition session ends. */
  @JSName("oncompleted")
  var oncompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SpeechContinuousRecognitionSession, SpeechContinuousRecognitionCompletedEventArgs] = js.native
  /** Occurs when the speech recognizer returns the result from a continuous recognition session. */
  @JSName("onresultgenerated")
  var onresultgenerated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
    SpeechContinuousRecognitionSession, 
    SpeechContinuousRecognitionResultGeneratedEventArgs
  ] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_completed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.completed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SpeechContinuousRecognitionSession, SpeechContinuousRecognitionCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resultgenerated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.resultgenerated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      SpeechContinuousRecognitionSession, 
      SpeechContinuousRecognitionResultGeneratedEventArgs
    ]
  ): scala.Unit = js.native
  /**
    * Asynchronously cancel the continuous speech recognition session and discard all pending recognition results.
    * @return An asynchronous handler called when the operation is complete.
    */
  def cancelAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Occurs when a continuous recognition session ends. */
  def oncompleted(
    ev: SpeechContinuousRecognitionCompletedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SpeechContinuousRecognitionSession]
  ): scala.Unit = js.native
  /** Occurs when the speech recognizer returns the result from a continuous recognition session. */
  def onresultgenerated(
    ev: SpeechContinuousRecognitionResultGeneratedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SpeechContinuousRecognitionSession]
  ): scala.Unit = js.native
  /**
    * Asynchronously pause a continuous speech recognition session.
    * @return An asynchronous handler called when the operation is complete.
    */
  def pauseAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_completed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.completed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SpeechContinuousRecognitionSession, SpeechContinuousRecognitionCompletedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resultgenerated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.resultgenerated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      SpeechContinuousRecognitionSession, 
      SpeechContinuousRecognitionResultGeneratedEventArgs
    ]
  ): scala.Unit = js.native
  /** Resumes a continuous speech recognition session, if paused. */
  def resume(): scala.Unit = js.native
  /**
    * Overload
    * @return An asynchronous handler called when the operation is complete.
    */
  def startAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Overload
    * @param mode The speech recognition behavior.
    * @return An asynchronous handler called when the operation is complete.
    */
  def startAsync(mode: SpeechContinuousRecognitionMode): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously end a continuous speech recognition session and pass all pending recognition results to the ResultGenerated event.
    * @return An asynchronous handler called when the operation is complete.
    */
  def stopAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

