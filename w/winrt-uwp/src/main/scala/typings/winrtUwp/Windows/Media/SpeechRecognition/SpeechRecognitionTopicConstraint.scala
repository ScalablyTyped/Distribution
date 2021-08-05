package typings.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A pre-defined grammar constraint (specifed by SpeechRecognitionScenario ) provided through a web service. */
trait SpeechRecognitionTopicConstraint extends StObject {
  
  /** Gets or sets whether the constraint can be used by the SpeechRecognizer object to perform recognition. */
  var isEnabled: Boolean
  
  /** Gets or sets the weighted value of the constraint. */
  var probability: SpeechRecognitionConstraintProbability
  
  /** Gets the predefined scenario type for the constraint. */
  var scenario: SpeechRecognitionScenario
  
  /** Gets or sets a tag that can be useful for identifying the constraint. */
  var tag: String
  
  /** Gets the topic hint for the constraint. */
  var topicHint: String
  
  /** Gets the type of the constraint. */
  var `type`: SpeechRecognitionConstraintType
}
object SpeechRecognitionTopicConstraint {
  
  inline def apply(
    isEnabled: Boolean,
    probability: SpeechRecognitionConstraintProbability,
    scenario: SpeechRecognitionScenario,
    tag: String,
    topicHint: String,
    `type`: SpeechRecognitionConstraintType
  ): SpeechRecognitionTopicConstraint = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], topicHint = topicHint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionTopicConstraint]
  }
  
  extension [Self <: SpeechRecognitionTopicConstraint](x: Self) {
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setProbability(value: SpeechRecognitionConstraintProbability): Self = StObject.set(x, "probability", value.asInstanceOf[js.Any])
    
    inline def setScenario(value: SpeechRecognitionScenario): Self = StObject.set(x, "scenario", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTopicHint(value: String): Self = StObject.set(x, "topicHint", value.asInstanceOf[js.Any])
    
    inline def setType(value: SpeechRecognitionConstraintType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
