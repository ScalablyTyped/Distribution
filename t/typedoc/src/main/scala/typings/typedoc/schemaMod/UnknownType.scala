package typings.typedoc.schemaMod

import typings.typedoc.typedocStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.UnknownType, 'type' | 'name'> */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait UnknownType extends SomeType {
  var name: ModelToObject[String] | String
  var `type`: ModelToObject[unknown] | unknown
}

object UnknownType {
  @scala.inline
  def apply(name: ModelToObject[String] | String, `type`: ModelToObject[unknown] | unknown): UnknownType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnknownType]
  }
}

