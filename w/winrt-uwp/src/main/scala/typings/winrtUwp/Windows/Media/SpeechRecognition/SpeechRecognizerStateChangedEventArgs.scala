package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the SpeechRecognizer.StateChangedEvent event. */
@js.native
trait SpeechRecognizerStateChangedEventArgs extends js.Object {
  
  /** Gets the audio capture state. */
  var state: SpeechRecognizerState = js.native
}
object SpeechRecognizerStateChangedEventArgs {
  
  @scala.inline
  def apply(state: SpeechRecognizerState): SpeechRecognizerStateChangedEventArgs = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognizerStateChangedEventArgs]
  }
  
  @scala.inline
  implicit class SpeechRecognizerStateChangedEventArgsOps[Self <: SpeechRecognizerStateChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setState(value: SpeechRecognizerState): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
