package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.TensorShape.IDim
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITensorShape extends js.Object {
  /** TensorShape dim */
  var dim: js.UndefOr[js.Array[IDim] | Null] = js.undefined
  /** TensorShape unknownRank */
  var unknownRank: js.UndefOr[Boolean | Null] = js.undefined
}

object ITensorShape {
  @scala.inline
  def apply(
    dim: js.UndefOr[Null | js.Array[IDim]] = js.undefined,
    unknownRank: js.UndefOr[Null | Boolean] = js.undefined
  ): ITensorShape = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dim)) __obj.updateDynamic("dim")(dim.asInstanceOf[js.Any])
    if (!js.isUndefined(unknownRank)) __obj.updateDynamic("unknownRank")(unknownRank.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITensorShape]
  }
}

