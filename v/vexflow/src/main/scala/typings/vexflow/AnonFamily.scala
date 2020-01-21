package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFamily extends js.Object {
  var family: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var weight: js.UndefOr[String] = js.undefined
}

object AnonFamily {
  @scala.inline
  def apply(family: String = null, size: Int | Double = null, weight: String = null): AnonFamily = {
    val __obj = js.Dynamic.literal()
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFamily]
  }
}

