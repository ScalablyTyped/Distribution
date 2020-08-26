package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.IntersectionType, 'type' | 'types'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ @js.native
trait IntersectionType extends SomeType {
  var `type`: ModelToObject[String] | String = js.native
  var types: ModelToObject[js.Array[typings.typedoc.typesAbstractMod.Type]] | js.Array[typings.typedoc.typesAbstractMod.Type] = js.native
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
  @scala.inline
  implicit class IntersectionTypeOps[Self <: IntersectionType] (val x: Self) extends AnyVal {
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
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: ModelToObject[String] | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: (typings.typedoc.typesAbstractMod.Type | _ModelToObject[js.Any])*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(
      value: ModelToObject[js.Array[typings.typedoc.typesAbstractMod.Type]] | js.Array[typings.typedoc.typesAbstractMod.Type]
    ): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

