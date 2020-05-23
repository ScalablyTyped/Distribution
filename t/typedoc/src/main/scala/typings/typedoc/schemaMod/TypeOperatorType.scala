package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.TypeOperatorType, 'type' | 'operator' | 'target'> */
trait TypeOperatorType extends SomeType {
  var operator: (ModelToObject[/* "keyof" */ String]) | (/* "keyof" */ String)
  var target: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
  var `type`: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String)
}

object TypeOperatorType {
  @scala.inline
  def apply(
    operator: (ModelToObject[/* "keyof" */ String]) | (/* "keyof" */ String),
    target: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    `type`: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String)
  ): TypeOperatorType = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOperatorType]
  }
}

