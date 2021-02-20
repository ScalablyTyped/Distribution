package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Emotion results for a specified target. */
@js.native
trait TargetedEmotionResults extends StObject {
  
  /** The emotion results for the target. */
  var emotion: js.UndefOr[EmotionScores] = js.native
  
  /** Targeted text. */
  var text: js.UndefOr[String] = js.native
}
object TargetedEmotionResults {
  
  @scala.inline
  def apply(): TargetedEmotionResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetedEmotionResults]
  }
  
  @scala.inline
  implicit class TargetedEmotionResultsMutableBuilder[Self <: TargetedEmotionResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmotion(value: EmotionScores): Self = StObject.set(x, "emotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmotionUndefined: Self = StObject.set(x, "emotion", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
