package typings.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A constraint for a SpeechRecognizer object based on a Voice Command Definition (VCD) file. */
trait SpeechRecognitionVoiceCommandDefinitionConstraint extends StObject {
  
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
  
  inline def apply(
    isEnabled: Boolean,
    probability: SpeechRecognitionConstraintProbability,
    tag: String,
    `type`: SpeechRecognitionConstraintType
  ): SpeechRecognitionVoiceCommandDefinitionConstraint = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionVoiceCommandDefinitionConstraint]
  }
  
  extension [Self <: SpeechRecognitionVoiceCommandDefinitionConstraint](x: Self) {
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setProbability(value: SpeechRecognitionConstraintProbability): Self = StObject.set(x, "probability", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setType(value: SpeechRecognitionConstraintType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
