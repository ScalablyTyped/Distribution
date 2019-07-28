package typings.typedoc.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReflectionGroupObject extends js.Object {
  var children: js.UndefOr[js.Array[Double]] = js.undefined
  var kind: Double
  var title: String
}

object ReflectionGroupObject {
  @scala.inline
  def apply(kind: Double, title: String, children: js.Array[Double] = null): ReflectionGroupObject = {
    val __obj = js.Dynamic.literal(kind = kind, title = title)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[ReflectionGroupObject]
  }
}

