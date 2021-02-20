package typings.typedoc.schemaMod

import typings.typedoc.typedocStrings.keyof
import typings.typedoc.typedocStrings.readonly
import typings.typedoc.typedocStrings.unique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.TypeOperatorType, 'type' | 'operator' | 'target'> */
@js.native
trait TypeOperatorType extends SomeType {
  
  var operator: (ModelToObject[keyof | unique | readonly]) | keyof | unique | readonly = js.native
  
  var target: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type = js.native
  
  var `type`: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String) = js.native
}
object TypeOperatorType {
  
  @scala.inline
  def apply(
    operator: (ModelToObject[keyof | unique | readonly]) | keyof | unique | readonly,
    target: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    `type`: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String)
  ): TypeOperatorType = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOperatorType]
  }
  
  @scala.inline
  implicit class TypeOperatorTypeMutableBuilder[Self <: TypeOperatorType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperator(value: (ModelToObject[keyof | unique | readonly]) | keyof | unique | readonly): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "operator", js.Array(value :_*))
    
    @scala.inline
    def setTarget(
      value: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
    ): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "target", js.Array(value :_*))
    
    @scala.inline
    def setType(value: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
