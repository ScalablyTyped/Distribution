package typings.winrtUwp.Windows.Media.SpeechRecognition

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A constraint for a SpeechRecognizer object based on a list of words or phrases. When initialized, this object is added to the Constraints collection. */
@js.native
trait SpeechRecognitionListConstraint extends StObject {
  
  /** Gets the array of words or phrases that make up the constraint. */
  var commands: IVector[String] = js.native
  
  /** Gets or sets whether the constraint can be used by the speech recognizer to perform recognition. */
  var isEnabled: Boolean = js.native
  
  /** Gets or sets the weighted value of the constraint. */
  var probability: SpeechRecognitionConstraintProbability = js.native
  
  /** Gets or sets a tag that can be useful for identifying the constraint. */
  var tag: String = js.native
  
  /** Gets the type of the constraint. */
  var `type`: SpeechRecognitionConstraintType = js.native
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
  
  @scala.inline
  implicit class SpeechRecognitionListConstraintMutableBuilder[Self <: SpeechRecognitionListConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommands(value: IVector[String]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProbability(value: SpeechRecognitionConstraintProbability): Self = StObject.set(x, "probability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: SpeechRecognitionConstraintType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
