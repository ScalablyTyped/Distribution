package typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The result of compiling the constraints set for a SpeechRecognizer object. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionCompilationResult")
@js.native
abstract class SpeechRecognitionCompilationResult () extends js.Object {
  /** Gets the result state ( SpeechRecognitionResultStatus ) from the compiling of grammar constraints. */
  var status: SpeechRecognitionResultStatus = js.native
}

