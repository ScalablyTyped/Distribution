package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserveNodeRect extends js.Object {
  /**
    * bottom
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /**
    * left
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * right
    */
  var right: js.UndefOr[Double] = js.undefined
  /**
    * top
    */
  var top: js.UndefOr[Double] = js.undefined
}

object ObserveNodeRect {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): ObserveNodeRect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserveNodeRect]
  }
}

