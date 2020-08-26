package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.PredicateType, 'type' | 'name' | 'asserts' | 'targetType'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ @js.native
trait PredicateType extends SomeType {
  var asserts: ModelToObject[Boolean] | Boolean = js.native
  var name: ModelToObject[String] | String = js.native
  var targetType: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.typesAbstractMod.Type]] | typings.typedoc.typesAbstractMod.Type
  ] = js.native
  var `type`: (ModelToObject[/* "predicate" */ String]) | (/* "predicate" */ String) = js.native
}

object PredicateType {
  @scala.inline
  def apply(
    asserts: ModelToObject[Boolean] | Boolean,
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "predicate" */ String]) | (/* "predicate" */ String)
  ): PredicateType = {
    val __obj = js.Dynamic.literal(asserts = asserts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredicateType]
  }
  @scala.inline
  implicit class PredicateTypeOps[Self <: PredicateType] (val x: Self) extends AnyVal {
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
    def setAssertsVarargs(value: _ModelToObject[js.Any]*): Self = this.set("asserts", js.Array(value :_*))
    @scala.inline
    def setAsserts(value: ModelToObject[Boolean] | Boolean): Self = this.set("asserts", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameVarargs(value: _ModelToObject[js.Any]*): Self = this.set("name", js.Array(value :_*))
    @scala.inline
    def setName(value: ModelToObject[String] | String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: (ModelToObject[/* "predicate" */ String]) | (/* "predicate" */ String)): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("targetType", js.Array(value :_*))
    @scala.inline
    def setTargetType(
      value: ModelToObject[js.UndefOr[typings.typedoc.typesAbstractMod.Type]] | typings.typedoc.typesAbstractMod.Type
    ): Self = this.set("targetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetType: Self = this.set("targetType", js.undefined)
  }
  
}

