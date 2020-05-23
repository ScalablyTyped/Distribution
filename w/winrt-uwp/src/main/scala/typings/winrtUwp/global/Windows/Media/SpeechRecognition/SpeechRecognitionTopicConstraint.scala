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
  /** Gets or sets whether the constraint can be used by the SpeechRecognizer object to perform recognition. */
  /* CompleteClass */
  override var isEnabled: Boolean = js.native
  /** Gets or sets the weighted value of the constraint. */
  /* CompleteClass */
  override var probability: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability = js.native
  /** Gets the predefined scenario type for the constraint. */
  /* CompleteClass */
  override var scenario: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionScenario = js.native
  /** Gets or sets a tag that can be useful for identifying the constraint. */
  /* CompleteClass */
  override var tag: String = js.native
  /** Gets the topic hint for the constraint. */
  /* CompleteClass */
  override var topicHint: String = js.native
  /** Gets the type of the constraint. */
  /* CompleteClass */
  override var `type`: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintType = js.native
}

