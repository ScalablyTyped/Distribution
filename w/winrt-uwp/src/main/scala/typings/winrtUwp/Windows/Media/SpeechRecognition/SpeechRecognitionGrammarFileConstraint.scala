package typings.winrtUwp.Windows.Media.SpeechRecognition

import typings.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A constraint for a SpeechRecognizer object based on a Speech Recognition Grammar Specification (SRGS) file. */
@js.native
trait SpeechRecognitionGrammarFileConstraint extends StObject {
  
  /** Gets the StorageFile object representing the Speech Recognition Grammar Specification (SRGS) grammar file. */
  var grammarFile: StorageFile = js.native
  
  /** Gets or sets whether the constraint can be used by the speech recognizer to perform recognition. */
  var isEnabled: Boolean = js.native
  
  /** Gets or sets the weighted value of the constraint. */
  var probability: SpeechRecognitionConstraintProbability = js.native
  
  /** Gets or sets a tag that can be useful for identifying the constraint. */
  var tag: String = js.native
  
  /** Gets the type of the constraint. */
  var `type`: SpeechRecognitionConstraintType = js.native
}
object SpeechRecognitionGrammarFileConstraint {
  
  @scala.inline
  def apply(
    grammarFile: StorageFile,
    isEnabled: Boolean,
    probability: SpeechRecognitionConstraintProbability,
    tag: String,
    `type`: SpeechRecognitionConstraintType
  ): SpeechRecognitionGrammarFileConstraint = {
    val __obj = js.Dynamic.literal(grammarFile = grammarFile.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionGrammarFileConstraint]
  }
  
  @scala.inline
  implicit class SpeechRecognitionGrammarFileConstraintMutableBuilder[Self <: SpeechRecognitionGrammarFileConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrammarFile(value: StorageFile): Self = StObject.set(x, "grammarFile", value.asInstanceOf[js.Any])
    
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
