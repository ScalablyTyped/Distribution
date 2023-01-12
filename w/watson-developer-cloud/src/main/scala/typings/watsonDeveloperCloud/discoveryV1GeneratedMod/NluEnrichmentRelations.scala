package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object specifying the relations enrichment and related parameters. */
trait NluEnrichmentRelations extends StObject {
  
  /** *For use with `natural_language_understanding` enrichments only.* The enrichement model to use with relationship extraction. May be a custom model provided by Watson Knowledge Studio, the public model for use with Knowledge Graph `en-news`, the default is`en-news`. */
  var model: js.UndefOr[String] = js.undefined
}
object NluEnrichmentRelations {
  
  inline def apply(): NluEnrichmentRelations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentRelations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NluEnrichmentRelations] (val x: Self) extends AnyVal {
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
