package typings
package winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SpeechRecognizer.StateChangedEvent event. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizerStateChangedEventArgs")
@js.native
abstract class SpeechRecognizerStateChangedEventArgs () extends js.Object {
  /** Gets the audio capture state. */
  var state: SpeechRecognizerState = js.native
}

