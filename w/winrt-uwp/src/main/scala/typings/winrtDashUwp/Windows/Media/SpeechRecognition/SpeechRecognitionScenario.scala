package typings.winrtDashUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpeechRecognitionScenario with Double] = js.native
  /* 1 */ @js.native
  object dictation extends TopLevel[dictation with Double]
  
  /* 2 */ @js.native
  object formFilling extends TopLevel[formFilling with Double]
  
  /* 0 */ @js.native
  object webSearch extends TopLevel[webSearch with Double]
  
}

