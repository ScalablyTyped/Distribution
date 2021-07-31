package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SentenceResult. */
trait SentenceResult extends StObject {
  
  /** Character offsets indicating the beginning and end of the sentence in the analyzed text. */
  var location: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** The sentence. */
  var text: js.UndefOr[String] = js.undefined
}
object SentenceResult {
  
  @scala.inline
  def apply(): SentenceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SentenceResult]
  }
  
  @scala.inline
  implicit class SentenceResultMutableBuilder[Self <: SentenceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
