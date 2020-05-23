package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var family: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var weight: js.UndefOr[String] = js.undefined
}

object Size {
  @scala.inline
  def apply(family: String = null, size: js.UndefOr[Double] = js.undefined, weight: String = null): Size = {
    val __obj = js.Dynamic.literal()
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

