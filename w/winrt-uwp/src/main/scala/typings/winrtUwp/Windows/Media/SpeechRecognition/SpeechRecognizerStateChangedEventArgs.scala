package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SpeechRecognizer.StateChangedEvent event. */
trait SpeechRecognizerStateChangedEventArgs extends js.Object {
  /** Gets the audio capture state. */
  var state: SpeechRecognizerState
}

object SpeechRecognizerStateChangedEventArgs {
  @scala.inline
  def apply(state: SpeechRecognizerState): SpeechRecognizerStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognizerStateChangedEventArgs]
  }
}

