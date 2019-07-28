package typings.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Maximum extends js.Object {
  var maximum: js.UndefOr[Double] = js.undefined
  var minimum: js.UndefOr[Double] = js.undefined
}

object Anon_Maximum {
  @scala.inline
  def apply(maximum: Int | Double = null, minimum: Int | Double = null): Anon_Maximum = {
    val __obj = js.Dynamic.literal()
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Maximum]
  }
}

