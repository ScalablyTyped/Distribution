package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count
  extends vegaDashTypingsLib.typesSpecEncodeMod._ColorValueRef {
  var count: js.UndefOr[scala.Double] = js.undefined
  var gradient: vegaDashTypingsLib.typesSpecEncodeMod.Field
  var start: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var stop: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Anon_Count {
  @scala.inline
  def apply(
    gradient: vegaDashTypingsLib.typesSpecEncodeMod.Field,
    count: scala.Int | scala.Double = null,
    start: js.Array[scala.Double] = null,
    stop: js.Array[scala.Double] = null
  ): Anon_Count = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[Anon_Count]
  }
}

