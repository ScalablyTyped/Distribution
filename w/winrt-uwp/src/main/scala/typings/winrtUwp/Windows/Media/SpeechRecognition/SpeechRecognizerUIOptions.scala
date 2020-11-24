package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the UI settings for the SpeechRecognizer.RecognizeWithUIAsync method. */
@js.native
trait SpeechRecognizerUIOptions extends js.Object {
  
  /** Gets or sets the heading text that is displayed on the Listening screen. The default is "Listening...". */
  var audiblePrompt: String = js.native
  
  /** Gets or sets the example text shown on the Listening screen. */
  var exampleText: String = js.native
  
  /** Gets or sets whether the recognized text is spoken back to the user on the Heard you say screen. */
  var isReadBackEnabled: Boolean = js.native
  
  /** Gets or sets whether a Heard you say screen is shown to the user after speech recognition is completed. */
  var showConfirmation: Boolean = js.native
}
object SpeechRecognizerUIOptions {
  
  @scala.inline
  def apply(audiblePrompt: String, exampleText: String, isReadBackEnabled: Boolean, showConfirmation: Boolean): SpeechRecognizerUIOptions = {
    val __obj = js.Dynamic.literal(audiblePrompt = audiblePrompt.asInstanceOf[js.Any], exampleText = exampleText.asInstanceOf[js.Any], isReadBackEnabled = isReadBackEnabled.asInstanceOf[js.Any], showConfirmation = showConfirmation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognizerUIOptions]
  }
  
  @scala.inline
  implicit class SpeechRecognizerUIOptionsOps[Self <: SpeechRecognizerUIOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAudiblePrompt(value: String): Self = this.set("audiblePrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleText(value: String): Self = this.set("exampleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadBackEnabled(value: Boolean): Self = this.set("isReadBackEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowConfirmation(value: Boolean): Self = this.set("showConfirmation", value.asInstanceOf[js.Any])
  }
}
