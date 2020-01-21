package typings.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpList extends js.Object {
  /** OpList op */
  var op: js.UndefOr[js.Array[IOpDef] | Null] = js.undefined
}

object IOpList {
  @scala.inline
  def apply(op: js.Array[IOpDef] = null): IOpList = {
    val __obj = js.Dynamic.literal()
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOpList]
  }
}

