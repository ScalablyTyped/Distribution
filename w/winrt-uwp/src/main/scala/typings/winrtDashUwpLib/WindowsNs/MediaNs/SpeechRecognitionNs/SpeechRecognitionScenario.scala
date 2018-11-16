package typings
package winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs

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
  sealed trait dictation
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionScenario
  
  /** A form input scenario. */
  @js.native
  sealed trait formFilling
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionScenario
  
  /** A web search scenario. */
  @js.native
  sealed trait webSearch
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionScenario
  
  val dictation: dictation with java.lang.String = js.native
  val formFilling: formFilling with java.lang.String = js.native
  val webSearch: webSearch with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionScenario with java.lang.String
  ] = js.native
}

