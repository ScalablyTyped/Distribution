package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The detected anger, disgust, fear, joy, or sadness that is conveyed by the content. Emotion information can be returned for detected entities, keywords, or user-specified target phrases found in the text. */
trait EmotionResult extends StObject {
  
  /** Emotion results for the document as a whole. */
  var document: js.UndefOr[DocumentEmotionResults] = js.undefined
  
  /** Emotion results for specified targets. */
  var targets: js.UndefOr[js.Array[TargetedEmotionResults]] = js.undefined
}
object EmotionResult {
  
  @scala.inline
  def apply(): EmotionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmotionResult]
  }
  
  @scala.inline
  implicit class EmotionResultMutableBuilder[Self <: EmotionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: DocumentEmotionResults): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setTargets(value: js.Array[TargetedEmotionResults]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: TargetedEmotionResults*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
