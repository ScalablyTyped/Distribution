package typings
package atTensorflowTfjsDashConverterLib.distSrcOperationsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpMapper extends js.Object {
  var attrs: js.UndefOr[js.Array[AttrParamMapper]] = js.undefined
  var category: Category
  var customExecutor: js.UndefOr[OpExecutor] = js.undefined
  var inputs: js.UndefOr[js.Array[InputParamMapper]] = js.undefined
  var tfOpName: java.lang.String
}

object OpMapper {
  @scala.inline
  def apply(
    category: Category,
    tfOpName: java.lang.String,
    attrs: js.Array[AttrParamMapper] = null,
    customExecutor: OpExecutor = null,
    inputs: js.Array[InputParamMapper] = null
  ): OpMapper = {
    val __obj = js.Dynamic.literal(category = category, tfOpName = tfOpName)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (customExecutor != null) __obj.updateDynamic("customExecutor")(customExecutor)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    __obj.asInstanceOf[OpMapper]
  }
}

