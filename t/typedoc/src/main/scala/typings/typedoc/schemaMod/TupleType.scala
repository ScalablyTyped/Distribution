package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.TupleType, 'type'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait TupleType extends SomeType {
  var elements: js.UndefOr[ModelToObject[js.Array[typings.typedoc.typesAbstractMod.Type]]] = js.undefined
  var `type`: (ModelToObject[/* "tuple" */ String]) | (/* "tuple" */ String)
}

object TupleType {
  @scala.inline
  def apply(
    `type`: (ModelToObject[/* "tuple" */ String]) | (/* "tuple" */ String),
    elements: ModelToObject[js.Array[typings.typedoc.typesAbstractMod.Type]] = null
  ): TupleType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[TupleType]
  }
}

