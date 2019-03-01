package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountOp extends js.Object {
  var op: vegaDashTypingsLib.vegaDashTypingsLibStrings.count
  var order: js.UndefOr[vegaDashTypingsLib.typesSpecScaleMod.SortOrder] = js.undefined
}

object Anon_CountOp {
  @scala.inline
  def apply(
    op: vegaDashTypingsLib.vegaDashTypingsLibStrings.count,
    order: vegaDashTypingsLib.typesSpecScaleMod.SortOrder = null
  ): Anon_CountOp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("op")(op)
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[Anon_CountOp]
  }
}

