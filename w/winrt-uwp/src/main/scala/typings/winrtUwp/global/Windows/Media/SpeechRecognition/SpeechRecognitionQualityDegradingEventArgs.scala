package typings.winrtUwp.global.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SpeechRecognitionQualityDegradingEvent event. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionQualityDegradingEventArgs")
@js.native
abstract class SpeechRecognitionQualityDegradingEventArgs ()
  extends typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionQualityDegradingEventArgs {
  /** Gets the audio problem that occurred. */
  /* CompleteClass */
  override var problem: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionAudioProblem = js.native
}

