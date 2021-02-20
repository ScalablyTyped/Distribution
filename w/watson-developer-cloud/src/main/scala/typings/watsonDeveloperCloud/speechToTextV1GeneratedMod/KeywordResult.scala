package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** KeywordResult. */
@js.native
trait KeywordResult extends StObject {
  
  /** A confidence score for the keyword match in the range of 0.0 to 1.0. */
  var confidence: Double = js.native
  
  /** The end time in seconds of the keyword match. */
  var end_time: Double = js.native
  
  /** A specified keyword normalized to the spoken phrase that matched in the audio input. */
  var normalized_text: String = js.native
  
  /** The start time in seconds of the keyword match. */
  var start_time: Double = js.native
}
object KeywordResult {
  
  @scala.inline
  def apply(confidence: Double, end_time: Double, normalized_text: String, start_time: Double): KeywordResult = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], normalized_text = normalized_text.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeywordResult]
  }
  
  @scala.inline
  implicit class KeywordResultMutableBuilder[Self <: KeywordResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_time(value: Double): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalized_text(value: String): Self = StObject.set(x, "normalized_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_time(value: Double): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
  }
}
