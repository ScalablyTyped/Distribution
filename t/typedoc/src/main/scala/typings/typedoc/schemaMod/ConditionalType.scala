package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ConditionalType, 'type' | 'checkType' | 'extendsType' | 'trueType' | 'falseType'> */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait ConditionalType extends SomeType {
  var checkType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
  var extendsType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
  var falseType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
  var trueType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
  var `type`: ModelToObject[String] | String
}

object ConditionalType {
  @scala.inline
  def apply(
    checkType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    extendsType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    falseType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    trueType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    `type`: ModelToObject[String] | String
  ): ConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalType]
  }
}

