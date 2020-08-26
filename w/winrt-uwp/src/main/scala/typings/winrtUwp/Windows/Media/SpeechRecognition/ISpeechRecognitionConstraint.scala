package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a constraint for a SpeechRecognizer object. */
@js.native
trait ISpeechRecognitionConstraint extends js.Object {
  /** Gets or sets whether the constraint can be used by the SpeechRecognizer object to perform recognition. */
  var isEnabled: Boolean = js.native
  /** Gets or sets the weighted value of the constraint. */
  var probability: SpeechRecognitionConstraintProbability = js.native
  /** Gets or sets a tag that can be useful for identifying the constraint. */
  var tag: String = js.native
  /** Gets the type of the constraint. */
  var `type`: SpeechRecognitionConstraintType = js.native
}

object ISpeechRecognitionConstraint {
  @scala.inline
  def apply(
    isEnabled: Boolean,
    probability: SpeechRecognitionConstraintProbability,
    tag: String,
    `type`: SpeechRecognitionConstraintType
  ): ISpeechRecognitionConstraint = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpeechRecognitionConstraint]
  }
  @scala.inline
  implicit class ISpeechRecognitionConstraintOps[Self <: ISpeechRecognitionConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setProbability(value: SpeechRecognitionConstraintProbability): Self = this.set("probability", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: SpeechRecognitionConstraintType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

