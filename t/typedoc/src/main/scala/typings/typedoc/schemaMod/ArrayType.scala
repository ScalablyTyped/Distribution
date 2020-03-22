package typings.typedoc.schemaMod

import typings.typedoc.typedocStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ArrayType, 'type' | 'elementType'> */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait ArrayType extends SomeType {
  var elementType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type
  var `type`: ModelToObject[array] | array
}

object ArrayType {
  @scala.inline
  def apply(
    elementType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type,
    `type`: ModelToObject[array] | array
  ): ArrayType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayType]
  }
}

