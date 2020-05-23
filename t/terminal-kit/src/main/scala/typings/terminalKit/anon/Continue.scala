package typings.terminalKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Continue extends js.Object {
  var continue: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var width: Null | Double
  var x: Double
}

object Continue {
  @scala.inline
  def apply(
    x: Double,
    continue: js.UndefOr[Boolean] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    width: Double = null.asInstanceOf[Double]
  ): Continue = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(continue)) __obj.updateDynamic("continue")(continue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Continue]
  }
}

