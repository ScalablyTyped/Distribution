package typings.typedoc

import typings.typedoc.schemaMod.ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.ReflectionCategory> */
trait PartialReflectionCategory extends js.Object {
  var children: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models/reflections/abstract.Reflection>[number]['id'] */ js.Any
    ]
  ] = js.undefined
  var title: js.UndefOr[ModelToObject[String] | String] = js.undefined
}

object PartialReflectionCategory {
  @scala.inline
  def apply(
    children: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models/reflections/abstract.Reflection>[number]['id'] */ js.Any
    ] = null,
    title: ModelToObject[String] | String = null
  ): PartialReflectionCategory = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialReflectionCategory]
  }
}

