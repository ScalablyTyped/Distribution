package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ReflectionCategory, 'title'> */
trait ReflectionCategory
  extends __ModelToObject[js.Any] {
  var children: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models/reflections/abstract.Reflection>[number]['id'] */ js.Any
    ]
  ] = js.undefined
  var title: ModelToObject[String] | String
}

object ReflectionCategory {
  @scala.inline
  def apply(
    title: ModelToObject[String] | String,
    children: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models/reflections/abstract.Reflection>[number]['id'] */ js.Any
    ] = null
  ): ReflectionCategory = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionCategory]
  }
}

