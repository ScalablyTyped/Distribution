package typings.typedoc.distLibSerializationSchemaMod

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
  
  var target: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]
  
  var `type`: ToSerialized[/* "typeOperator" */ String]
}
object TypeOperatorType {
  
  inline def apply(
    operator: ToSerialized[keyof | unique | readonly],
    target: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType],
    `type`: ToSerialized[/* "typeOperator" */ String]
  ): TypeOperatorType = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOperatorType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeOperatorType] (val x: Self) extends AnyVal {
    
    inline def setOperator(value: ToSerialized[keyof | unique | readonly]): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: ToSerialized[/* "typeOperator" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
