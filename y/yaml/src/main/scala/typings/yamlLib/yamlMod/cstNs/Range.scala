package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var end: scala.Double
  var origEnd: js.UndefOr[scala.Double] = js.undefined
  var origStart: js.UndefOr[scala.Double] = js.undefined
  var start: scala.Double
  def isEmpty(): scala.Boolean
}

object Range {
  @scala.inline
  def apply(
    end: scala.Double,
    isEmpty: js.Function0[scala.Boolean],
    start: scala.Double,
    origEnd: scala.Int | scala.Double = null,
    origStart: scala.Int | scala.Double = null
  ): Range = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("isEmpty")(isEmpty)
    __obj.updateDynamic("start")(start)
    if (origEnd != null) __obj.updateDynamic("origEnd")(origEnd.asInstanceOf[js.Any])
    if (origStart != null) __obj.updateDynamic("origStart")(origStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

