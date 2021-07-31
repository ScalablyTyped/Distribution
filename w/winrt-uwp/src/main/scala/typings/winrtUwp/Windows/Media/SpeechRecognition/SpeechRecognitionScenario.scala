package typings.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpeechRecognitionScenario extends StObject
/** Specifies the scenario used to optimize speech recognition for a web-service constraint (created through a SpeechRecognitionTopicConstraint object). */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionScenario")
@js.native
object SpeechRecognitionScenario extends StObject {
  
  /** A dictation scenario. */
  @js.native
  sealed trait dictation
    extends StObject
       with SpeechRecognitionScenario
  
  /** A form input scenario. */
  @js.native
  sealed trait formFilling
    extends StObject
       with SpeechRecognitionScenario
  
  /** A web search scenario. */
  @js.native
  sealed trait webSearch
    extends StObject
       with SpeechRecognitionScenario
}
