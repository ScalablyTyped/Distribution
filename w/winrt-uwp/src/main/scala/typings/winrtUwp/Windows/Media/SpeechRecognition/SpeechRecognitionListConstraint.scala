package typings.winrtUwp.Windows.Media.SpeechRecognition

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A constraint for a SpeechRecognizer object based on a list of words or phrases. When initialized, this object is added to the Constraints collection. */
trait SpeechRecognitionListConstraint extends js.Object {
  /** Gets the array of words or phrases that make up the constraint. */
  var commands: IVector[String]
  /** Gets or sets whether the constraint can be used by the speech recognizer to perform recognition. */
  var isEnabled: Boolean
  /** Gets or sets the weighted value of the constraint. */
  var probability: SpeechRecognitionConstraintProbability
  /** Gets or sets a tag that can be useful for identifying the constraint. */
  var tag: String
  /** Gets the type of the constraint. */
  var `type`: SpeechRecognitionConstraintType
}

object SpeechRecognitionListConstraint {
  @scala.inline
  def apply(
    commands: IVector[String],
    isEnabled: Boolean,
    probability: SpeechRecognitionConstraintProbability,
    tag: String,
    `type`: SpeechRecognitionConstraintType
  ): SpeechRecognitionListConstraint = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionListConstraint]
  }
}

