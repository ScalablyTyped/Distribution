package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.TypeParameterType, 'type' | 'name' | 'constraint'> */
trait TypeParameterType extends SomeType {
  var constraint: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.typesAbstractMod.Type]] | typings.typedoc.typesAbstractMod.Type
  ] = js.undefined
  var name: ModelToObject[String] | String
  var `type`: ModelToObject[String] | String
}

object TypeParameterType {
  @scala.inline
  def apply(
    name: ModelToObject[String] | String,
    `type`: ModelToObject[String] | String,
    constraint: ModelToObject[js.UndefOr[typings.typedoc.typesAbstractMod.Type]] | typings.typedoc.typesAbstractMod.Type = null
  ): TypeParameterType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameterType]
  }
}

