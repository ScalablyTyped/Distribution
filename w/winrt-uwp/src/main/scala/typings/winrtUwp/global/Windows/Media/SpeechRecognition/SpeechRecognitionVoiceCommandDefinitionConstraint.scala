package typings.winrtUwp.global.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A constraint for a SpeechRecognizer object based on a Voice Command Definition (VCD) file. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionVoiceCommandDefinitionConstraint")
@js.native
abstract class SpeechRecognitionVoiceCommandDefinitionConstraint ()
  extends typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionVoiceCommandDefinitionConstraint {
  /** Gets or sets whether the constraint can be used by the SpeechRecognizer object to perform recognition. */
  /* CompleteClass */
  override var isEnabled: Boolean = js.native
  /** Gets or sets the weighted value of the constraint. */
  /* CompleteClass */
  override var probability: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability = js.native
  /** Gets or sets a tag that can be useful for identifying the constraint. */
  /* CompleteClass */
  override var tag: String = js.native
  /** Gets the type of the constraint. */
  /* CompleteClass */
  override var `type`: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintType = js.native
}

