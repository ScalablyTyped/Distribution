package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object specifiying the semantic roles enrichment and related parameters. */
@js.native
trait NluEnrichmentSemanticRoles extends StObject {
  
  /** When `true`, entities are extracted from the identified sentence parts. */
  var entities: js.UndefOr[Boolean] = js.native
  
  /** When `true`, keywords are extracted from the identified sentence parts. */
  var keywords: js.UndefOr[Boolean] = js.native
  
  /** The maximum number of semantic roles enrichments to extact from each instance of the specified field. */
  var limit: js.UndefOr[Double] = js.native
}
object NluEnrichmentSemanticRoles {
  
  @scala.inline
  def apply(): NluEnrichmentSemanticRoles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentSemanticRoles]
  }
  
  @scala.inline
  implicit class NluEnrichmentSemanticRolesMutableBuilder[Self <: NluEnrichmentSemanticRoles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: Boolean): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setKeywords(value: Boolean): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
