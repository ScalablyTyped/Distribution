package typings.winrtDashUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SpeechRecognitionQualityDegradingEvent event. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionQualityDegradingEventArgs")
@js.native
abstract class SpeechRecognitionQualityDegradingEventArgs () extends js.Object {
  /** Gets the audio problem that occurred. */
  var problem: SpeechRecognitionAudioProblem = js.native
}

