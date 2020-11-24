package typings.winrtUwp.global.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies confidence levels that indicate how accurately a spoken phrase was matched to a phrase in an active constraint. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionConfidence")
@js.native
object SpeechRecognitionConfidence extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence with Double
  ] = js.native
  
  /* 0 */ val high: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence.high with Double = js.native
  
  /* 2 */ val low: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence.low with Double = js.native
  
  /* 1 */ val medium: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence.medium with Double = js.native
  
  /* 3 */ val rejected: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConfidence.rejected with Double = js.native
}
