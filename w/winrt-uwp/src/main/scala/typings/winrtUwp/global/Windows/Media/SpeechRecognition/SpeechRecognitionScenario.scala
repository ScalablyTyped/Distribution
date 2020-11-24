package typings.winrtUwp.global.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the scenario used to optimize speech recognition for a web-service constraint (created through a SpeechRecognitionTopicConstraint object). */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionScenario")
@js.native
object SpeechRecognitionScenario extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario with Double
  ] = js.native
  
  /* 1 */ val dictation: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario.dictation with Double = js.native
  
  /* 2 */ val formFilling: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario.formFilling with Double = js.native
  
  /* 0 */ val webSearch: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario.webSearch with Double = js.native
}
