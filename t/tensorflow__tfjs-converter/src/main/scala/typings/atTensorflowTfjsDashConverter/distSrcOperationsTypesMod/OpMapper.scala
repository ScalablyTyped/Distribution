package typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpMapper extends js.Object {
  var attrs: js.UndefOr[js.Array[AttrParamMapper]] = js.undefined
  var category: Category
  var customExecutor: js.UndefOr[OpExecutor] = js.undefined
  var inputs: js.UndefOr[js.Array[InputParamMapper]] = js.undefined
  var tfOpName: String
}

object OpMapper {
  @scala.inline
  def apply(
    category: Category,
    tfOpName: String,
    attrs: js.Array[AttrParamMapper] = null,
    customExecutor: /* node */ GraphNode => Tensor[Rank] | js.Array[Tensor[Rank]] | (js.Promise[Tensor[Rank] | js.Array[Tensor[Rank]]]) = null,
    inputs: js.Array[InputParamMapper] = null
  ): OpMapper = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], tfOpName = tfOpName.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (customExecutor != null) __obj.updateDynamic("customExecutor")(js.Any.fromFunction1(customExecutor))
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpMapper]
  }
}

