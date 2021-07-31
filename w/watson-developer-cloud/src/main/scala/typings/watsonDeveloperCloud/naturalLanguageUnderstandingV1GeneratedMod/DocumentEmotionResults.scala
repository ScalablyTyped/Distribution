package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Emotion results for the document as a whole. */
trait DocumentEmotionResults extends StObject {
  
  /** Emotion results for the document as a whole. */
  var emotion: js.UndefOr[EmotionScores] = js.undefined
}
object DocumentEmotionResults {
  
  @scala.inline
  def apply(): DocumentEmotionResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentEmotionResults]
  }
  
  @scala.inline
  implicit class DocumentEmotionResultsMutableBuilder[Self <: DocumentEmotionResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmotion(value: EmotionScores): Self = StObject.set(x, "emotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmotionUndefined: Self = StObject.set(x, "emotion", js.undefined)
  }
}
