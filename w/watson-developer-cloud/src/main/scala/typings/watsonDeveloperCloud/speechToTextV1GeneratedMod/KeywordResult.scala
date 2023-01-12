package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** KeywordResult. */
trait KeywordResult extends StObject {
  
  /** A confidence score for the keyword match in the range of 0.0 to 1.0. */
  var confidence: Double
  
  /** The end time in seconds of the keyword match. */
  var end_time: Double
  
  /** A specified keyword normalized to the spoken phrase that matched in the audio input. */
  var normalized_text: String
  
  /** The start time in seconds of the keyword match. */
  var start_time: Double
}
object KeywordResult {
  
  inline def apply(confidence: Double, end_time: Double, normalized_text: String, start_time: Double): KeywordResult = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], normalized_text = normalized_text.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeywordResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeywordResult] (val x: Self) extends AnyVal {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setEnd_time(value: Double): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    inline def setNormalized_text(value: String): Self = StObject.set(x, "normalized_text", value.asInstanceOf[js.Any])
    
    inline def setStart_time(value: Double): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
  }
}
