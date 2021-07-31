package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ArrayType, 'type' | 'elementType'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait ArrayType
  extends StObject
     with SomeType {
  
  var elementType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type
  
  var `type`: (ModelToObject[/* "array" */ String]) | (/* "array" */ String)
}
object ArrayType {
  
  @scala.inline
  def apply(
    elementType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type,
    `type`: (ModelToObject[/* "array" */ String]) | (/* "array" */ String)
  ): ArrayType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayType]
  }
  
  @scala.inline
  implicit class ArrayTypeMutableBuilder[Self <: ArrayType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementType(value: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "elementType", js.Array(value :_*))
    
    @scala.inline
    def setType(value: (ModelToObject[/* "array" */ String]) | (/* "array" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
