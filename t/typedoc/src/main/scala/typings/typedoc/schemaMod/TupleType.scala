package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.TupleType, 'type'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ @js.native
trait TupleType extends SomeType {
  var elements: js.UndefOr[ModelToObject[js.Array[typings.typedoc.typesAbstractMod.Type]]] = js.native
  var `type`: (ModelToObject[/* "tuple" */ String]) | (/* "tuple" */ String) = js.native
}

object TupleType {
  @scala.inline
  def apply(`type`: (ModelToObject[/* "tuple" */ String]) | (/* "tuple" */ String)): TupleType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TupleType]
  }
  @scala.inline
  implicit class TupleTypeOps[Self <: TupleType] (val x: Self) extends AnyVal {
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
    def setType(value: (ModelToObject[/* "tuple" */ String]) | (/* "tuple" */ String)): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementsVarargs(value: _ModelToObject[js.Any]*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: ModelToObject[js.Array[typings.typedoc.typesAbstractMod.Type]]): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
  }
  
}

