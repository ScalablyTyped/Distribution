package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object specifiying the concepts enrichment and related parameters. */
@js.native
trait NluEnrichmentConcepts extends StObject {
  
  /** The maximum number of concepts enrichments to extact from each instance of the specified field. */
  var limit: js.UndefOr[Double] = js.native
}
object NluEnrichmentConcepts {
  
  @scala.inline
  def apply(): NluEnrichmentConcepts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentConcepts]
  }
  
  @scala.inline
  implicit class NluEnrichmentConceptsMutableBuilder[Self <: NluEnrichmentConcepts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
