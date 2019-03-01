package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_As extends js.Object {
  var as: js.Array[java.lang.String]
  var cross: js.UndefOr[scala.Boolean] = js.undefined
  var fields: js.Array[java.lang.String]
  var ops: js.Array[java.lang.String]
}

object Anon_As {
  @scala.inline
  def apply(
    as: js.Array[java.lang.String],
    fields: js.Array[java.lang.String],
    ops: js.Array[java.lang.String],
    cross: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_As = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("as")(as)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("ops")(ops)
    if (!js.isUndefined(cross)) __obj.updateDynamic("cross")(cross)
    __obj.asInstanceOf[Anon_As]
  }
}

