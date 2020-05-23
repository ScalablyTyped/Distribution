package typings.webcola.layoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputNode extends js.Object {
  var fixed: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object InputNode {
  @scala.inline
  def apply(
    fixed: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): InputNode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputNode]
  }
}

