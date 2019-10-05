package typings.winrtDashUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpeechRecognitionScenario extends js.Object

/** Specifies the scenario used to optimize speech recognition for a web-service constraint (created through a SpeechRecognitionTopicConstraint object). */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionScenario")
@js.native
object SpeechRecognitionScenario extends js.Object {
  /** A dictation scenario. */
  @js.native
  sealed trait dictation extends SpeechRecognitionScenario
  
  /** A form input scenario. */
  @js.native
  sealed trait formFilling extends SpeechRecognitionScenario
  
  /** A web search scenario. */
  @js.native
  sealed trait webSearch extends SpeechRecognitionScenario
  
  /* 1 */ val dictation: typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario.dictation with Double = js.native
  /* 2 */ val formFilling: typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario.formFilling with Double = js.native
  /* 0 */ val webSearch: typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario.webSearch with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpeechRecognitionScenario with Double] = js.native
}

