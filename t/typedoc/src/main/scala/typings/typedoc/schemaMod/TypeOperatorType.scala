package typings.typedoc.schemaMod

import typings.typedoc.typedocStrings.keyof
import typings.typedoc.typedocStrings.typeOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.TypeOperatorType, 'type' | 'operator' | 'target'> */
trait TypeOperatorType extends SomeType {
  var operator: ModelToObject[keyof] | keyof
  var target: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
  var `type`: ModelToObject[typeOperator] | typeOperator
}

object TypeOperatorType {
  @scala.inline
  def apply(
    operator: ModelToObject[keyof] | keyof,
    target: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    `type`: ModelToObject[typeOperator] | typeOperator
  ): TypeOperatorType = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOperatorType]
  }
}

