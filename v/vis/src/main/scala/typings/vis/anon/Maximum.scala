package typings.vis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maximum extends js.Object {
  var maximum: js.UndefOr[Double] = js.undefined
  var minimum: js.UndefOr[Double] = js.undefined
}

object Maximum {
  @scala.inline
  def apply(maximum: js.UndefOr[Double] = js.undefined, minimum: js.UndefOr[Double] = js.undefined): Maximum = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maximum]
  }
}

