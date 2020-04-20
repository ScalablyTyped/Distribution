package typings.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontLikeObject extends _FontValue {
  var family: js.UndefOr[js.Array[String]] = js.undefined
  var size: Double
  var style: js.UndefOr[FontStyle] = js.undefined
  var weight: js.UndefOr[FontWeight] = js.undefined
}

object FontLikeObject {
  @scala.inline
  def apply(size: Double, family: js.Array[String] = null, style: FontStyle = null, weight: FontWeight = null): FontLikeObject = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontLikeObject]
  }
}

