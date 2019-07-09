package typings
package atTensorflowTfjsDashConverterLib.distSrcExecutorTensorUnderscoreArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TensorWithState extends js.Object {
  var cleared: js.UndefOr[scala.Boolean] = js.undefined
  var read: js.UndefOr[scala.Boolean] = js.undefined
  var tensor: js.UndefOr[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.undefined
  var written: js.UndefOr[scala.Boolean] = js.undefined
}

object TensorWithState {
  @scala.inline
  def apply(
    cleared: js.UndefOr[scala.Boolean] = js.undefined,
    read: js.UndefOr[scala.Boolean] = js.undefined,
    tensor: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = null,
    written: js.UndefOr[scala.Boolean] = js.undefined
  ): TensorWithState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cleared)) __obj.updateDynamic("cleared")(cleared)
    if (!js.isUndefined(read)) __obj.updateDynamic("read")(read)
    if (tensor != null) __obj.updateDynamic("tensor")(tensor)
    if (!js.isUndefined(written)) __obj.updateDynamic("written")(written)
    __obj.asInstanceOf[TensorWithState]
  }
}

