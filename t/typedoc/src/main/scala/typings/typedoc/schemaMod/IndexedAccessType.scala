package typings.typedoc.schemaMod

import typings.typedoc.typedocStrings.indexedAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.IndexedAccessType, 'type' | 'indexType' | 'objectType'> */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait IndexedAccessType extends SomeType {
  var indexType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type
  var objectType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type
  var `type`: ModelToObject[indexedAccess] | indexedAccess
}

object IndexedAccessType {
  @scala.inline
  def apply(
    indexType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type,
    objectType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type,
    `type`: ModelToObject[indexedAccess] | indexedAccess
  ): IndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedAccessType]
  }
}

