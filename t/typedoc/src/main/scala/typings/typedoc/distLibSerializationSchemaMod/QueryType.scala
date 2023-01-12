package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.QueryType, 'type' | 'queryType'> */
trait QueryType extends StObject {
  
  var queryType: ToSerialized[typings.typedoc.distLibModelsTypesMod.ReferenceType]
  
  var `type`: ToSerialized[/* "query" */ String]
}
object QueryType {
  
  inline def apply(
    queryType: ToSerialized[typings.typedoc.distLibModelsTypesMod.ReferenceType],
    `type`: ToSerialized[/* "query" */ String]
  ): QueryType = {
    val __obj = js.Dynamic.literal(queryType = queryType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryType] (val x: Self) extends AnyVal {
    
    inline def setQueryType(value: ToSerialized[typings.typedoc.distLibModelsTypesMod.ReferenceType]): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    inline def setType(value: ToSerialized[/* "query" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
