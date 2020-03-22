package typings.typedoc.schemaMod

import typings.typedoc.abstractMod.ReflectionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ReflectionGroup, 'title' | 'kind' | 'categories'> */
trait ReflectionGroup
  extends __ModelToObject[js.Any] {
  var categories: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typings.typedoc.reflectionCategoryMod.ReflectionCategory]]] | js.Array[typings.typedoc.reflectionCategoryMod.ReflectionCategory]
  ] = js.undefined
  var children: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models/reflections/abstract.Reflection>[number]['id'] */ js.Any
    ]
  ] = js.undefined
  var kind: ModelToObject[ReflectionKind] | ReflectionKind
  var title: ModelToObject[String] | String
}

object ReflectionGroup {
  @scala.inline
  def apply(
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    title: ModelToObject[String] | String,
    categories: ModelToObject[js.UndefOr[js.Array[typings.typedoc.reflectionCategoryMod.ReflectionCategory]]] | js.Array[typings.typedoc.reflectionCategoryMod.ReflectionCategory] = null,
    children: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models/reflections/abstract.Reflection>[number]['id'] */ js.Any
    ] = null
  ): ReflectionGroup = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionGroup]
  }
}

