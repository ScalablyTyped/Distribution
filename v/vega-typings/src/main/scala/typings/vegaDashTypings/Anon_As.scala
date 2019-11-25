package typings.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_As extends js.Object {
  var as: js.Array[String]
  var cross: js.UndefOr[Boolean] = js.undefined
  var fields: js.Array[String]
  var ops: js.Array[String]
}

object Anon_As {
  @scala.inline
  def apply(
    as: js.Array[String],
    fields: js.Array[String],
    ops: js.Array[String],
    cross: js.UndefOr[Boolean] = js.undefined
  ): Anon_As = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any])
    if (!js.isUndefined(cross)) __obj.updateDynamic("cross")(cross.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_As]
  }
}

