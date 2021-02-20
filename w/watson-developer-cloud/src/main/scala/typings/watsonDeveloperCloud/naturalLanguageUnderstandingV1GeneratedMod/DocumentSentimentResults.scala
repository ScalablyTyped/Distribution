package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DocumentSentimentResults. */
@js.native
trait DocumentSentimentResults extends StObject {
  
  /** Indicates whether the sentiment is positive, neutral, or negative. */
  var label: js.UndefOr[String] = js.native
  
  /** Sentiment score from -1 (negative) to 1 (positive). */
  var score: js.UndefOr[Double] = js.native
}
object DocumentSentimentResults {
  
  @scala.inline
  def apply(): DocumentSentimentResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSentimentResults]
  }
  
  @scala.inline
  implicit class DocumentSentimentResultsMutableBuilder[Self <: DocumentSentimentResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
