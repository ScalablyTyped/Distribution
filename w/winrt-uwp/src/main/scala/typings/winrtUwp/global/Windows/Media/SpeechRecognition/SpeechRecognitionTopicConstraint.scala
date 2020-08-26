package typings.winrtUwp.global.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A pre-defined grammar constraint (specifed by SpeechRecognitionScenario ) provided through a web service. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionTopicConstraint")
@js.native
class SpeechRecognitionTopicConstraint protected ()
  extends typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionTopicConstraint {
  /**
    * Creates an instance of the SpeechRecognitionTopicConstraint class by using a pre-defined scenario type and context.
    * @param scenario A predefined scenario type.
    * @param topicHint A subject, or context hint, used to optimize recognition.
    */
  def this(
    scenario: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario,
    topicHint: String
  ) = this()
  /**
    * Creates an instance of the SpeechRecognitionTopicConstraint class by using a pre-defined scenario type, context, and an identifier.
    * @param scenario A predefined scenario type.
    * @param topicHint A subject, or context hint, used to optimize recognition.
    * @param tag Identifier for the constraint.
    */
  def this(
    scenario: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario,
    topicHint: String,
    tag: String
  ) = this()
}

