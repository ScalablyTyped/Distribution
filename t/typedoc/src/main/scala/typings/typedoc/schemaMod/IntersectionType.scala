package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.IntersectionType, 'type' | 'types'> */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait IntersectionType extends SomeType {
  var `type`: ModelToObject[String] | String
  var types: ModelToObject[js.Array[typings.typedoc.typesAbstractMod.Type]] | js.Array[typings.typedoc.typesAbstractMod.Type]
}

object IntersectionType {
  @scala.inline
  def apply(
    `type`: ModelToObject[String] | String,
    types: ModelToObject[js.Array[typings.typedoc.typesAbstractMod.Type]] | js.Array[typings.typedoc.typesAbstractMod.Type]
  ): IntersectionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionType]
  }
}

