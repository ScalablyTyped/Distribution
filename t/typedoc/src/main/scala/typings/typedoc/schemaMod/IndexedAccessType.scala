package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.IndexedAccessType, 'type' | 'indexType' | 'objectType'> */
trait IndexedAccessType extends StObject {
  
  var indexType: ToSerialized[typings.typedoc.modelsTypesMod.SomeType]
  
  var objectType: ToSerialized[typings.typedoc.modelsTypesMod.SomeType]
  
  var `type`: ToSerialized[/* "indexedAccess" */ String]
}
object IndexedAccessType {
  
  inline def apply(
    indexType: ToSerialized[typings.typedoc.modelsTypesMod.SomeType],
    objectType: ToSerialized[typings.typedoc.modelsTypesMod.SomeType],
    `type`: ToSerialized[/* "indexedAccess" */ String]
  ): IndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedAccessType]
  }
  
  extension [Self <: IndexedAccessType](x: Self) {
    
    inline def setIndexType(value: ToSerialized[typings.typedoc.modelsTypesMod.SomeType]): Self = StObject.set(x, "indexType", value.asInstanceOf[js.Any])
    
    inline def setIndexTypeVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "indexType", js.Array(value*))
    
    inline def setObjectType(value: ToSerialized[typings.typedoc.modelsTypesMod.SomeType]): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "objectType", js.Array(value*))
    
    inline def setType(value: ToSerialized[/* "indexedAccess" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
