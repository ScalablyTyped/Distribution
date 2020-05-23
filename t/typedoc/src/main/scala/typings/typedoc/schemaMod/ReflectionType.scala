package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ReflectionType, 'type'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait ReflectionType extends SomeType {
  var declaration: js.UndefOr[ModelToObject[typings.typedoc.reflectionsDeclarationMod.DeclarationReflection]] = js.undefined
  var `type`: (ModelToObject[/* "reflection" */ String]) | (/* "reflection" */ String)
}

object ReflectionType {
  @scala.inline
  def apply(
    `type`: (ModelToObject[/* "reflection" */ String]) | (/* "reflection" */ String),
    declaration: ModelToObject[typings.typedoc.reflectionsDeclarationMod.DeclarationReflection] = null
  ): ReflectionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionType]
  }
}

