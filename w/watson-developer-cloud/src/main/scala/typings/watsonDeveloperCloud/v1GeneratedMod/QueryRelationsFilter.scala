package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryRelationsFilter. */
@js.native
trait QueryRelationsFilter extends js.Object {
  
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
  implicit class QueryRelationsFilterOps[Self <: QueryRelationsFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocument_idsVarargs(value: String*): Self = this.set("document_ids", js.Array(value :_*))
    
    @scala.inline
    def setDocument_ids(value: js.Array[String]): Self = this.set("document_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument_ids: Self = this.set("document_ids", js.undefined)
    
    @scala.inline
    def setEntity_types(value: QueryFilterType): Self = this.set("entity_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity_types: Self = this.set("entity_types", js.undefined)
    
    @scala.inline
    def setRelation_types(value: QueryFilterType): Self = this.set("relation_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelation_types: Self = this.set("relation_types", js.undefined)
  }
}
