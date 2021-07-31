package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ToneChatScore. */
trait ToneChatScore extends StObject {
  
  /** The score for the tone in the range of 0.5 to 1. A score greater than 0.75 indicates a high likelihood that the tone is perceived in the utterance. */
  var score: Double
  
  /** The unique, non-localized identifier of the tone for the results. The service returns results only for tones whose scores meet a minimum threshold of 0.5. */
  var tone_id: String
  
  /** The user-visible, localized name of the tone. */
  var tone_name: String
}
object ToneChatScore {
  
  @scala.inline
  def apply(score: Double, tone_id: String, tone_name: String): ToneChatScore = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], tone_id = tone_id.asInstanceOf[js.Any], tone_name = tone_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToneChatScore]
  }
  
  @scala.inline
  implicit class ToneChatScoreMutableBuilder[Self <: ToneChatScore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTone_id(value: String): Self = StObject.set(x, "tone_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTone_name(value: String): Self = StObject.set(x, "tone_name", value.asInstanceOf[js.Any])
  }
}
