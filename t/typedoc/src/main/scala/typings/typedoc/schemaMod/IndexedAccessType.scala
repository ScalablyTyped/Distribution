package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.IndexedAccessType, 'type' | 'indexType' | 'objectType'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait IndexedAccessType
  extends StObject
     with SomeType {
  
  var indexType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type
  
  var objectType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type
  
  var `type`: (ModelToObject[/* "indexedAccess" */ String]) | (/* "indexedAccess" */ String)
}
object IndexedAccessType {
  
  inline def apply(
    indexType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type,
    objectType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type,
    `type`: (ModelToObject[/* "indexedAccess" */ String]) | (/* "indexedAccess" */ String)
  ): IndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedAccessType]
  }
  
  extension [Self <: IndexedAccessType](x: Self) {
    
    inline def setIndexType(value: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type): Self = StObject.set(x, "indexType", value.asInstanceOf[js.Any])
    
    inline def setIndexTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "indexType", js.Array(value :_*))
    
    inline def setObjectType(value: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "objectType", js.Array(value :_*))
    
    inline def setType(value: (ModelToObject[/* "indexedAccess" */ String]) | (/* "indexedAccess" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
