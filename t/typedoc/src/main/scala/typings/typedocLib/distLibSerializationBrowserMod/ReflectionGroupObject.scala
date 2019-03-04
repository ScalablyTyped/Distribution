package typings
package typedocLib.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReflectionGroupObject extends js.Object {
  var children: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var kind: scala.Double
  var title: java.lang.String
}

object ReflectionGroupObject {
  @scala.inline
  def apply(kind: scala.Double, title: java.lang.String, children: js.Array[scala.Double] = null): ReflectionGroupObject = {
    val __obj = js.Dynamic.literal(kind = kind, title = title)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[ReflectionGroupObject]
  }
}

