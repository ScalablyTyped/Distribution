package typings
package winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A pre-defined grammar constraint (specifed by SpeechRecognitionScenario ) provided through a web service. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionTopicConstraint")
@js.native
class SpeechRecognitionTopicConstraint protected () extends js.Object {
  /**
    * Creates an instance of the SpeechRecognitionTopicConstraint class by using a pre-defined scenario type and context.
    * @param scenario A predefined scenario type.
    * @param topicHint A subject, or context hint, used to optimize recognition.
    */
  def this(scenario: SpeechRecognitionScenario, topicHint: java.lang.String) = this()
  /**
    * Creates an instance of the SpeechRecognitionTopicConstraint class by using a pre-defined scenario type, context, and an identifier.
    * @param scenario A predefined scenario type.
    * @param topicHint A subject, or context hint, used to optimize recognition.
    * @param tag Identifier for the constraint.
    */
  def this(scenario: SpeechRecognitionScenario, topicHint: java.lang.String, tag: java.lang.String) = this()
  /** Gets or sets whether the constraint can be used by the SpeechRecognizer object to perform recognition. */
  var isEnabled: scala.Boolean = js.native
  /** Gets or sets the weighted value of the constraint. */
  var probability: SpeechRecognitionConstraintProbability = js.native
  /** Gets the predefined scenario type for the constraint. */
  var scenario: SpeechRecognitionScenario = js.native
  /** Gets or sets a tag that can be useful for identifying the constraint. */
  var tag: java.lang.String = js.native
  /** Gets the topic hint for the constraint. */
  var topicHint: java.lang.String = js.native
  /** Gets the type of the constraint. */
  var `type`: SpeechRecognitionConstraintType = js.native
}

