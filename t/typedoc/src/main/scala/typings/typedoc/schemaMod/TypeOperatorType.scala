package typings.typedoc.schemaMod

import typings.typedoc.typedocStrings.keyof
import typings.typedoc.typedocStrings.readonly
import typings.typedoc.typedocStrings.unique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.TypeOperatorType, 'type' | 'operator' | 'target'> */
trait TypeOperatorType extends StObject {
  
  var operator: ToSerialized[keyof | unique | readonly]
  
  var target: ToSerialized[typings.typedoc.modelsTypesMod.SomeType]
  
  var `type`: ToSerialized[/* "typeOperator" */ String]
}
object TypeOperatorType {
  
  inline def apply(
    operator: ToSerialized[keyof | unique | readonly],
    target: ToSerialized[typings.typedoc.modelsTypesMod.SomeType],
    `type`: ToSerialized[/* "typeOperator" */ String]
  ): TypeOperatorType = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOperatorType]
  }
  
  extension [Self <: TypeOperatorType](x: Self) {
    
    inline def setOperator(value: ToSerialized[keyof | unique | readonly]): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "operator", js.Array(value*))
    
    inline def setTarget(value: ToSerialized[typings.typedoc.modelsTypesMod.SomeType]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def setType(value: ToSerialized[/* "typeOperator" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
