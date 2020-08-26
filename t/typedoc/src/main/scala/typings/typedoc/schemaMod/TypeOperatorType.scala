package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.TypeOperatorType, 'type' | 'operator' | 'target'> */
@js.native
trait TypeOperatorType extends SomeType {
  var operator: (ModelToObject[/* "keyof" */ String]) | (/* "keyof" */ String) = js.native
  var target: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type = js.native
  var `type`: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String) = js.native
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
  @scala.inline
  implicit class TypeOperatorTypeOps[Self <: TypeOperatorType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOperatorVarargs(value: _ModelToObject[js.Any]*): Self = this.set("operator", js.Array(value :_*))
    @scala.inline
    def setOperator(value: (ModelToObject[/* "keyof" */ String]) | (/* "keyof" */ String)): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetVarargs(value: _ModelToObject[js.Any]*): Self = this.set("target", js.Array(value :_*))
    @scala.inline
    def setTarget(
      value: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
    ): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String)): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

