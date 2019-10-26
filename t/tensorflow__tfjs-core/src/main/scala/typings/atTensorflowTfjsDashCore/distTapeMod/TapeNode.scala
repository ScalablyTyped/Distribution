package typings.atTensorflowTfjsDashCore.distTapeMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedTensorMap
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TapeNode extends js.Object {
  var gradient: js.UndefOr[js.Function1[/* dys */ js.Array[Tensor[Rank]], NamedGradientMap]] = js.undefined
  var id: Double
  var inputs: NamedTensorMap
  var name: String
  var outputs: js.Array[Tensor[Rank]]
  var saved: js.UndefOr[js.Array[Tensor[Rank]]] = js.undefined
}

object TapeNode {
  @scala.inline
  def apply(
    id: Double,
    inputs: NamedTensorMap,
    name: String,
    outputs: js.Array[Tensor[Rank]],
    gradient: /* dys */ js.Array[Tensor[Rank]] => NamedGradientMap = null,
    saved: js.Array[Tensor[Rank]] = null
  ): TapeNode = {
    val __obj = js.Dynamic.literal(id = id, inputs = inputs, name = name, outputs = outputs)
    if (gradient != null) __obj.updateDynamic("gradient")(js.Any.fromFunction1(gradient))
    if (saved != null) __obj.updateDynamic("saved")(saved)
    __obj.asInstanceOf[TapeNode]
  }
}

