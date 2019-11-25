package typings.typedoc.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReflectionCategoryObject extends js.Object {
  var children: js.UndefOr[js.Array[Double]] = js.undefined
  var title: String
}

object ReflectionCategoryObject {
  @scala.inline
  def apply(title: String, children: js.Array[Double] = null): ReflectionCategoryObject = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionCategoryObject]
  }
}

