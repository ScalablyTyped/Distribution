package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object specifying the sentiment extraction enrichment and related parameters. */
@js.native
trait NluEnrichmentSentiment extends StObject {
  
  /** When `true`, sentiment analysis is performed on the entire field. */
  var document: js.UndefOr[Boolean] = js.native
  
  /** A comma-separated list of target strings that will have any associated sentiment analyzed. */
  var targets: js.UndefOr[js.Array[String]] = js.native
}
object NluEnrichmentSentiment {
  
  @scala.inline
  def apply(): NluEnrichmentSentiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentSentiment]
  }
  
  @scala.inline
  implicit class NluEnrichmentSentimentMutableBuilder[Self <: NluEnrichmentSentiment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: Boolean): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
