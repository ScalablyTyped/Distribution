package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryRelationsFilter. */
@js.native
trait QueryRelationsFilter extends StObject {
  
  /** A comma-separated list of document IDs to include in the query. */
  var document_ids: js.UndefOr[js.Array[String]] = js.native
  
  var entity_types: js.UndefOr[QueryFilterType] = js.native
  
  var relation_types: js.UndefOr[QueryFilterType] = js.native
}
object QueryRelationsFilter {
  
  @scala.inline
  def apply(): QueryRelationsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRelationsFilter]
  }
  
  @scala.inline
  implicit class QueryRelationsFilterMutableBuilder[Self <: QueryRelationsFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument_ids(value: js.Array[String]): Self = StObject.set(x, "document_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument_idsUndefined: Self = StObject.set(x, "document_ids", js.undefined)
    
    @scala.inline
    def setDocument_idsVarargs(value: String*): Self = StObject.set(x, "document_ids", js.Array(value :_*))
    
    @scala.inline
    def setEntity_types(value: QueryFilterType): Self = StObject.set(x, "entity_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntity_typesUndefined: Self = StObject.set(x, "entity_types", js.undefined)
    
    @scala.inline
    def setRelation_types(value: QueryFilterType): Self = StObject.set(x, "relation_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelation_typesUndefined: Self = StObject.set(x, "relation_types", js.undefined)
  }
}
