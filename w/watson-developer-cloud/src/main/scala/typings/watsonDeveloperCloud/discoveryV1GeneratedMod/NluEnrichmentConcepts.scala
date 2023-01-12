package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object specifiying the concepts enrichment and related parameters. */
trait NluEnrichmentConcepts extends StObject {
  
  /** The maximum number of concepts enrichments to extact from each instance of the specified field. */
  var limit: js.UndefOr[Double] = js.undefined
}
object NluEnrichmentConcepts {
  
  inline def apply(): NluEnrichmentConcepts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentConcepts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NluEnrichmentConcepts] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
