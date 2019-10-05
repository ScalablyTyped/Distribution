package typings.winrtDashUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A constraint for a SpeechRecognizer object based on a Voice Command Definition (VCD) file. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionVoiceCommandDefinitionConstraint")
@js.native
abstract class SpeechRecognitionVoiceCommandDefinitionConstraint () extends js.Object {
  /** Gets or sets whether the constraint can be used by the SpeechRecognizer object to perform recognition. */
  var isEnabled: Boolean = js.native
  /** Gets or sets the weighted value of the constraint. */
  var probability: SpeechRecognitionConstraintProbability = js.native
  /** Gets or sets a tag that can be useful for identifying the constraint. */
  var tag: String = js.native
  /** Gets the type of the constraint. */
  var `type`: SpeechRecognitionConstraintType = js.native
}

