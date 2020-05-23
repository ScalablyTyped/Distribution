package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the UI settings for the SpeechRecognizer.RecognizeWithUIAsync method. */
trait SpeechRecognizerUIOptions extends js.Object {
  /** Gets or sets the heading text that is displayed on the Listening screen. The default is "Listening...". */
  var audiblePrompt: String
  /** Gets or sets the example text shown on the Listening screen. */
  var exampleText: String
  /** Gets or sets whether the recognized text is spoken back to the user on the Heard you say screen. */
  var isReadBackEnabled: Boolean
  /** Gets or sets whether a Heard you say screen is shown to the user after speech recognition is completed. */
  var showConfirmation: Boolean
}

object SpeechRecognizerUIOptions {
  @scala.inline
  def apply(audiblePrompt: String, exampleText: String, isReadBackEnabled: Boolean, showConfirmation: Boolean): SpeechRecognizerUIOptions = {
    val __obj = js.Dynamic.literal(audiblePrompt = audiblePrompt.asInstanceOf[js.Any], exampleText = exampleText.asInstanceOf[js.Any], isReadBackEnabled = isReadBackEnabled.asInstanceOf[js.Any], showConfirmation = showConfirmation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognizerUIOptions]
  }
}

