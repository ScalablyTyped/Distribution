package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A constraint for a SpeechRecognizer object based on a Voice Command Definition (VCD) file. */
trait SpeechRecognitionVoiceCommandDefinitionConstraint extends js.Object {
  /** Gets or sets whether the constraint can be used by the SpeechRecognizer object to perform recognition. */
  var isEnabled: Boolean
  /** Gets or sets the weighted value of the constraint. */
  var probability: SpeechRecognitionConstraintProbability
  /** Gets or sets a tag that can be useful for identifying the constraint. */
  var tag: String
  /** Gets the type of the constraint. */
  var `type`: SpeechRecognitionConstraintType
}

object SpeechRecognitionVoiceCommandDefinitionConstraint {
  @scala.inline
  def apply(
    isEnabled: Boolean,
    probability: SpeechRecognitionConstraintProbability,
    tag: String,
    `type`: SpeechRecognitionConstraintType
  ): SpeechRecognitionVoiceCommandDefinitionConstraint = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionVoiceCommandDefinitionConstraint]
  }
}

