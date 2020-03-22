package typings.typedoc

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.reflectionCategoryMod.ReflectionCategory
import typings.typedoc.schemaMod.ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.ReflectionGroup> */
trait PartialReflectionGroup extends js.Object {
  var categories: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[ReflectionCategory]]] | js.Array[ReflectionCategory]
  ] = js.undefined
  var children: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models/reflections/abstract.Reflection>[number]['id'] */ js.Any
    ]
  ] = js.undefined
  var kind: js.UndefOr[ModelToObject[ReflectionKind] | ReflectionKind] = js.undefined
  var title: js.UndefOr[ModelToObject[String] | String] = js.undefined
}

object PartialReflectionGroup {
  @scala.inline
  def apply(
    categories: ModelToObject[js.UndefOr[js.Array[ReflectionCategory]]] | js.Array[ReflectionCategory] = null,
    children: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models/reflections/abstract.Reflection>[number]['id'] */ js.Any
    ] = null,
    kind: ModelToObject[ReflectionKind] | ReflectionKind = null,
    title: ModelToObject[String] | String = null
  ): PartialReflectionGroup = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialReflectionGroup]
  }
}

