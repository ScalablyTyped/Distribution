package typings.typedoc.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReflectionGroupObject extends js.Object {
  var categories: js.UndefOr[js.Array[ReflectionCategoryObject]] = js.undefined
  var children: js.UndefOr[js.Array[Double]] = js.undefined
  var kind: Double
  var title: String
}

object ReflectionGroupObject {
  @scala.inline
  def apply(
    kind: Double,
    title: String,
    categories: js.Array[ReflectionCategoryObject] = null,
    children: js.Array[Double] = null
  ): ReflectionGroupObject = {
    val __obj = js.Dynamic.literal(kind = kind, title = title)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[ReflectionGroupObject]
  }
}

