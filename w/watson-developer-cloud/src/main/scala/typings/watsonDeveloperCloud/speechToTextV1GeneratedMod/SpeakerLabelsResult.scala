package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SpeakerLabelsResult. */
trait SpeakerLabelsResult extends StObject {
  
  /** A score that indicates the service's confidence in its identification of the speaker in the range of 0.0 to 1.0. */
  var confidence: Double
  
  /** An indication of whether the service might further change word and speaker-label results. A value of `true` means that the service guarantees not to send any further updates for the current or any preceding results; `false` means that the service might send further updates to the results. */
  var final_results: Boolean
  
  /** The start time of a word from the transcript. The value matches the start time of a word from the `timestamps` array. */
  var from: Double
  
  /** The numeric identifier that the service assigns to a speaker from the audio. Speaker IDs begin at `0` initially but can evolve and change across interim results (if supported by the method) and between interim and final results as the service processes the audio. They are not guaranteed to be sequential, contiguous, or ordered. */
  var speaker: Double
  
  /** The end time of a word from the transcript. The value matches the end time of a word from the `timestamps` array. */
  var to: Double
}
object SpeakerLabelsResult {
  
  @scala.inline
  def apply(confidence: Double, final_results: Boolean, from: Double, speaker: Double, to: Double): SpeakerLabelsResult = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], final_results = final_results.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], speaker = speaker.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeakerLabelsResult]
  }
  
  @scala.inline
  implicit class SpeakerLabelsResultMutableBuilder[Self <: SpeakerLabelsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinal_results(value: Boolean): Self = StObject.set(x, "final_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeaker(value: Double): Self = StObject.set(x, "speaker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
