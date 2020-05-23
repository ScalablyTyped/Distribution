package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ReferenceType, 'type' | 'name' | 'typeArguments'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait ReferenceType extends SomeType {
  var id: js.UndefOr[Double] = js.undefined
  var name: ModelToObject[String] | String
  var `type`: (ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)
  var typeArguments: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typings.typedoc.typesAbstractMod.Type]]] | js.Array[typings.typedoc.typesAbstractMod.Type]
  ] = js.undefined
}

object ReferenceType {
  @scala.inline
  def apply(
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "reference" */ String]) | (/* "reference" */ String),
    id: js.UndefOr[Double] = js.undefined,
    typeArguments: ModelToObject[js.UndefOr[js.Array[typings.typedoc.typesAbstractMod.Type]]] | js.Array[typings.typedoc.typesAbstractMod.Type] = null
  ): ReferenceType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceType]
  }
}

