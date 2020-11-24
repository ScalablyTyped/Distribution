package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The timespan that a speech recognizer ignores silence or unrecognizable sounds (babble) and continues listening for speech input. */
@js.native
trait SpeechRecognizerTimeouts extends js.Object {
  
  /** Gets and sets the length of time that a SpeechRecognizer continues to listen while receiving unrecognizable sounds (babble) before it assumes speech input has ended and finalizes the recognition operation. */
  var babbleTimeout: Double = js.native
  
  /** Gets and sets the length of time, after recognition results have been generated, that a SpeechRecognizer detects silence and assumes speech input has ended. */
  var endSilenceTimeout: Double = js.native
  
  /** Gets and sets the length of time, before any recognition results have been generated, that a SpeechRecognizer detects silence and assumes speech input has ended. */
  var initialSilenceTimeout: Double = js.native
}
object SpeechRecognizerTimeouts {
  
  @scala.inline
  def apply(babbleTimeout: Double, endSilenceTimeout: Double, initialSilenceTimeout: Double): SpeechRecognizerTimeouts = {
    val __obj = js.Dynamic.literal(babbleTimeout = babbleTimeout.asInstanceOf[js.Any], endSilenceTimeout = endSilenceTimeout.asInstanceOf[js.Any], initialSilenceTimeout = initialSilenceTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognizerTimeouts]
  }
  
  @scala.inline
  implicit class SpeechRecognizerTimeoutsOps[Self <: SpeechRecognizerTimeouts] (val x: Self) extends AnyVal {
    
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
    def setBabbleTimeout(value: Double): Self = this.set("babbleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndSilenceTimeout(value: Double): Self = this.set("endSilenceTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialSilenceTimeout(value: Double): Self = this.set("initialSilenceTimeout", value.asInstanceOf[js.Any])
  }
}
