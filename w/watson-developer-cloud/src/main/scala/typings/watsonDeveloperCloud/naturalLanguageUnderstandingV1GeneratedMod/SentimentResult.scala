package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The sentiment of the content. */
@js.native
trait SentimentResult extends StObject {
  
  /** The document level sentiment. */
  var document: js.UndefOr[DocumentSentimentResults] = js.native
  
  /** The targeted sentiment to analyze. */
  var targets: js.UndefOr[js.Array[TargetedSentimentResults]] = js.native
}
object SentimentResult {
  
  @scala.inline
  def apply(): SentimentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SentimentResult]
  }
  
  @scala.inline
  implicit class SentimentResultMutableBuilder[Self <: SentimentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: DocumentSentimentResults): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setTargets(value: js.Array[TargetedSentimentResults]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: TargetedSentimentResults*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
