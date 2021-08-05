package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.QueryType, 'type' | 'queryType'> */
trait QueryType extends StObject {
  
  var queryType: ModelToObject[typings.typedoc.modelsTypesReferenceMod.ReferenceType] | typings.typedoc.modelsTypesReferenceMod.ReferenceType
  
  var `type`: (ModelToObject[/* "query" */ String]) | (/* "query" */ String)
}
object QueryType {
  
  inline def apply(
    queryType: ModelToObject[typings.typedoc.modelsTypesReferenceMod.ReferenceType] | typings.typedoc.modelsTypesReferenceMod.ReferenceType,
    `type`: (ModelToObject[/* "query" */ String]) | (/* "query" */ String)
  ): QueryType = {
    val __obj = js.Dynamic.literal(queryType = queryType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryType]
  }
  
  extension [Self <: QueryType](x: Self) {
    
    inline def setQueryType(
      value: ModelToObject[typings.typedoc.modelsTypesReferenceMod.ReferenceType] | typings.typedoc.modelsTypesReferenceMod.ReferenceType
    ): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    inline def setQueryTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "queryType", js.Array(value :_*))
    
    inline def setType(value: (ModelToObject[/* "query" */ String]) | (/* "query" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
