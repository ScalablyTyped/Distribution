package typings
package terminalDashKitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Continue extends js.Object {
  var continue: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var width: scala.Null | scala.Double
  var x: scala.Double
}

object Anon_Continue {
  @scala.inline
  def apply(
    x: scala.Double,
    continue: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_Continue = {
    val __obj = js.Dynamic.literal(x = x)
    if (!js.isUndefined(continue)) __obj.updateDynamic("continue")(continue)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Continue]
  }
}

