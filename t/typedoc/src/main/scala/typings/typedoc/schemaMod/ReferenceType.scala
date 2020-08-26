package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ReferenceType, 'type' | 'name' | 'typeArguments'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ @js.native
trait ReferenceType extends SomeType {
  var id: js.UndefOr[Double] = js.native
  var name: ModelToObject[String] | String = js.native
  var `type`: (ModelToObject[/* "reference" */ String]) | (/* "reference" */ String) = js.native
  var typeArguments: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typings.typedoc.typesAbstractMod.Type]]] | js.Array[typings.typedoc.typesAbstractMod.Type]
  ] = js.native
}

object ReferenceType {
  @scala.inline
  def apply(
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)
  ): ReferenceType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceType]
  }
  @scala.inline
  implicit class ReferenceTypeOps[Self <: ReferenceType] (val x: Self) extends AnyVal {
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
    def setNameVarargs(value: _ModelToObject[js.Any]*): Self = this.set("name", js.Array(value :_*))
    @scala.inline
    def setName(value: ModelToObject[String] | String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: (ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setTypeArgumentsVarargs(value: (typings.typedoc.typesAbstractMod.Type | _ModelToObject[js.Any])*): Self = this.set("typeArguments", js.Array(value :_*))
    @scala.inline
    def setTypeArguments(
      value: ModelToObject[js.UndefOr[js.Array[typings.typedoc.typesAbstractMod.Type]]] | js.Array[typings.typedoc.typesAbstractMod.Type]
    ): Self = this.set("typeArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeArguments: Self = this.set("typeArguments", js.undefined)
  }
  
}

