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
  
  inline def apply(): EmotionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmotionResult]
  }
  
  extension [Self <: EmotionResult](x: Self) {
    
    inline def setDocument(value: DocumentEmotionResults): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setTargets(value: js.Array[TargetedEmotionResults]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: TargetedEmotionResults*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
