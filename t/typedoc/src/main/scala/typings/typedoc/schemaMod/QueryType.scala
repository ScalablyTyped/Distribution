package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.QueryType, 'type' | 'queryType'> */
@js.native
trait QueryType extends js.Object {
  
  var queryType: ModelToObject[typings.typedoc.modelsTypesReferenceMod.ReferenceType] | typings.typedoc.modelsTypesReferenceMod.ReferenceType = js.native
  
  var `type`: (ModelToObject[/* "query" */ String]) | (/* "query" */ String) = js.native
}
object QueryType {
  
  @scala.inline
  def apply(
    queryType: ModelToObject[typings.typedoc.modelsTypesReferenceMod.ReferenceType] | typings.typedoc.modelsTypesReferenceMod.ReferenceType,
    `type`: (ModelToObject[/* "query" */ String]) | (/* "query" */ String)
  ): QueryType = {
    val __obj = js.Dynamic.literal(queryType = queryType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryType]
  }
  
  @scala.inline
  implicit class QueryTypeOps[Self <: QueryType] (val x: Self) extends AnyVal {
    
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
    def setQueryTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("queryType", js.Array(value :_*))
    
    @scala.inline
    def setQueryType(
      value: ModelToObject[typings.typedoc.modelsTypesReferenceMod.ReferenceType] | typings.typedoc.modelsTypesReferenceMod.ReferenceType
    ): Self = this.set("queryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: (ModelToObject[/* "query" */ String]) | (/* "query" */ String)): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
