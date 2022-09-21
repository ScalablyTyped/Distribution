package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.InferredType, 'type' | 'name' | 'constraint'> */
trait InferredType extends StObject {
  
  var constraint: ToSerialized[js.UndefOr[typings.typedoc.modelsTypesMod.SomeType]]
  
  var name: ToSerialized[String]
  
  var `type`: ToSerialized[/* "inferred" */ String]
}
object InferredType {
  
  inline def apply(name: ToSerialized[String], `type`: ToSerialized[/* "inferred" */ String]): InferredType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferredType]
  }
  
  extension [Self <: InferredType](x: Self) {
    
    inline def setConstraint(value: ToSerialized[js.UndefOr[typings.typedoc.modelsTypesMod.SomeType]]): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    inline def setConstraintVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "constraint", js.Array(value*))
    
    inline def setName(value: ToSerialized[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setType(value: ToSerialized[/* "inferred" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
