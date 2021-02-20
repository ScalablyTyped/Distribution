package typings.winrtUwp.Windows.Media.SpeechRecognition

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Globalization.Language
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.hypothesisgenerated
import typings.winrtUwp.winrtUwpStrings.recognitionqualitydegrading
import typings.winrtUwp.winrtUwpStrings.statechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables speech recognition with either a default or a custom graphical user interface (GUI). */
@js.native
trait SpeechRecognizer extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hypothesisgenerated(
    `type`: hypothesisgenerated,
    listener: TypedEventHandler[SpeechRecognizer, SpeechRecognitionHypothesisGeneratedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_recognitionqualitydegrading(
    `type`: recognitionqualitydegrading,
    listener: TypedEventHandler[SpeechRecognizer, SpeechRecognitionQualityDegradingEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechanged(
    `type`: statechanged,
    listener: TypedEventHandler[SpeechRecognizer, SpeechRecognizerStateChangedEventArgs]
  ): Unit = js.native
  
  /** Disposes the speech recognizer by freeing, releasing, or resetting allocated resources. */
  def close(): Unit = js.native
  
  /**
    * Asynchronously compile all constraints specified by the Constraints property.
    * @return The result of the constraints compilation as a SpeechRecognitionCompilationResult object.
    */
  def compileConstraintsAsync(): IPromiseWithIAsyncOperation[SpeechRecognitionCompilationResult] = js.native
  
  /** Gets the collection of constraint objects that are associated with the SpeechRecognizer object. */
  var constraints: IVector[ISpeechRecognitionConstraint] = js.native
  
  /** Gets the continuous recognition session object ( SpeechContinuousRecognitionSession ) associated with this SpeechRecognizer . */
  var continuousRecognitionSession: SpeechContinuousRecognitionSession = js.native
  
  /** Gets the language used for speech recognition. */
  var currentLanguage: Language = js.native
  
  /** Occurs during an ongoing dictation session when a recognition result fragment is returned by the speech recognizer. */
  def onhypothesisgenerated(ev: SpeechRecognitionHypothesisGeneratedEventArgs with WinRTEvent[SpeechRecognizer]): Unit = js.native
  /** Occurs during an ongoing dictation session when a recognition result fragment is returned by the speech recognizer. */
  @JSName("onhypothesisgenerated")
  var onhypothesisgenerated_Original: TypedEventHandler[SpeechRecognizer, SpeechRecognitionHypothesisGeneratedEventArgs] = js.native
  
  /** This event is raised when an audio problem is detected that might affect recognition accuracy. */
  def onrecognitionqualitydegrading(ev: SpeechRecognitionQualityDegradingEventArgs with WinRTEvent[SpeechRecognizer]): Unit = js.native
  /** This event is raised when an audio problem is detected that might affect recognition accuracy. */
  @JSName("onrecognitionqualitydegrading")
  var onrecognitionqualitydegrading_Original: TypedEventHandler[SpeechRecognizer, SpeechRecognitionQualityDegradingEventArgs] = js.native
  
  /** This event is raised when a change occurs to the State property during audio capture. */
  def onstatechanged(ev: SpeechRecognizerStateChangedEventArgs with WinRTEvent[SpeechRecognizer]): Unit = js.native
  /** This event is raised when a change occurs to the State property during audio capture. */
  @JSName("onstatechanged")
  var onstatechanged_Original: TypedEventHandler[SpeechRecognizer, SpeechRecognizerStateChangedEventArgs] = js.native
  
  /**
    * Begins a speech recognition session for a SpeechRecognizer object.
    * @return The result of the speech recognition session that was initiated by the SpeechRecognizer object.
    */
  def recognizeAsync(): IPromiseWithIAsyncOperation[SpeechRecognitionResult] = js.native
  
  /**
    * Asynchronously starts a speech recognition session that includes additional UI mechanisms, including prompts, examples, text-to-speech (TTS), and confirmations.
    * @return The result of the speech recognition session as a SpeechRecognitionResult object.
    */
  def recognizeWithUIAsync(): IPromiseWithIAsyncOperation[SpeechRecognitionResult] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hypothesisgenerated(
    `type`: hypothesisgenerated,
    listener: TypedEventHandler[SpeechRecognizer, SpeechRecognitionHypothesisGeneratedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_recognitionqualitydegrading(
    `type`: recognitionqualitydegrading,
    listener: TypedEventHandler[SpeechRecognizer, SpeechRecognitionQualityDegradingEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechanged(
    `type`: statechanged,
    listener: TypedEventHandler[SpeechRecognizer, SpeechRecognizerStateChangedEventArgs]
  ): Unit = js.native
  
  /** Gets the state of the speech recognizer. */
  var state: SpeechRecognizerState = js.native
  
  /**
    * Asynchronously ends the speech recognition session.
    * @return No object or value is returned when this method completes.
    */
  def stopRecognitionAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Gets how long a speech recognizer ignores silence or unrecognizable sounds (babble) and continues listening for speech input. */
  var timeouts: SpeechRecognizerTimeouts = js.native
  
  /** Gets the UI settings for the RecognizeWithUIAsync method. */
  var uiOptions: SpeechRecognizerUIOptions = js.native
}
