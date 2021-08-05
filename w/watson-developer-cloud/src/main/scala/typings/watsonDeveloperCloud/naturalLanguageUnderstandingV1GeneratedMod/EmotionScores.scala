package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** EmotionScores. */
trait EmotionScores extends StObject {
  
  /** Anger score from 0 to 1. A higher score means that the text is more likely to convey anger. */
  var anger: js.UndefOr[Double] = js.undefined
  
  /** Disgust score from 0 to 1. A higher score means that the text is more likely to convey disgust. */
  var disgust: js.UndefOr[Double] = js.undefined
  
  /** Fear score from 0 to 1. A higher score means that the text is more likely to convey fear. */
  var fear: js.UndefOr[Double] = js.undefined
  
  /** Joy score from 0 to 1. A higher score means that the text is more likely to convey joy. */
  var joy: js.UndefOr[Double] = js.undefined
  
  /** Sadness score from 0 to 1. A higher score means that the text is more likely to convey sadness. */
  var sadness: js.UndefOr[Double] = js.undefined
}
object EmotionScores {
  
  inline def apply(): EmotionScores = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmotionScores]
  }
  
  extension [Self <: EmotionScores](x: Self) {
    
    inline def setAnger(value: Double): Self = StObject.set(x, "anger", value.asInstanceOf[js.Any])
    
    inline def setAngerUndefined: Self = StObject.set(x, "anger", js.undefined)
    
    inline def setDisgust(value: Double): Self = StObject.set(x, "disgust", value.asInstanceOf[js.Any])
    
    inline def setDisgustUndefined: Self = StObject.set(x, "disgust", js.undefined)
    
    inline def setFear(value: Double): Self = StObject.set(x, "fear", value.asInstanceOf[js.Any])
    
    inline def setFearUndefined: Self = StObject.set(x, "fear", js.undefined)
    
    inline def setJoy(value: Double): Self = StObject.set(x, "joy", value.asInstanceOf[js.Any])
    
    inline def setJoyUndefined: Self = StObject.set(x, "joy", js.undefined)
    
    inline def setSadness(value: Double): Self = StObject.set(x, "sadness", value.asInstanceOf[js.Any])
    
    inline def setSadnessUndefined: Self = StObject.set(x, "sadness", js.undefined)
  }
}
