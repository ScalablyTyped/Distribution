package typings.atTensorflowTfjsDashConverter.distSrcExecutorTensorUnderscoreArrayMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TensorWithState extends js.Object {
  var cleared: js.UndefOr[Boolean] = js.undefined
  var read: js.UndefOr[Boolean] = js.undefined
  var tensor: js.UndefOr[Tensor[Rank]] = js.undefined
  var written: js.UndefOr[Boolean] = js.undefined
}

object TensorWithState {
  @scala.inline
  def apply(
    cleared: js.UndefOr[Boolean] = js.undefined,
    read: js.UndefOr[Boolean] = js.undefined,
    tensor: Tensor[Rank] = null,
    written: js.UndefOr[Boolean] = js.undefined
  ): TensorWithState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cleared)) __obj.updateDynamic("cleared")(cleared)
    if (!js.isUndefined(read)) __obj.updateDynamic("read")(read)
    if (tensor != null) __obj.updateDynamic("tensor")(tensor)
    if (!js.isUndefined(written)) __obj.updateDynamic("written")(written)
    __obj.asInstanceOf[TensorWithState]
  }
}

