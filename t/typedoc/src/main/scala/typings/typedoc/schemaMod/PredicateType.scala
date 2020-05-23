package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.PredicateType, 'type' | 'name' | 'asserts' | 'targetType'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait PredicateType extends SomeType {
  var asserts: ModelToObject[Boolean] | Boolean
  var name: ModelToObject[String] | String
  var targetType: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.typesAbstractMod.Type]] | typings.typedoc.typesAbstractMod.Type
  ] = js.undefined
  var `type`: (ModelToObject[/* "predicate" */ String]) | (/* "predicate" */ String)
}

object PredicateType {
  @scala.inline
  def apply(
    asserts: ModelToObject[Boolean] | Boolean,
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "predicate" */ String]) | (/* "predicate" */ String),
    targetType: ModelToObject[js.UndefOr[typings.typedoc.typesAbstractMod.Type]] | typings.typedoc.typesAbstractMod.Type = null
  ): PredicateType = {
    val __obj = js.Dynamic.literal(asserts = asserts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (targetType != null) __obj.updateDynamic("targetType")(targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredicateType]
  }
}

