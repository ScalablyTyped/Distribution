package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecEncodeMod.Field
import typings.vegaDashTypings.typesSpecEncodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends _ColorValueRef {
  var count: js.UndefOr[Double] = js.undefined
  var gradient: Field
  var start: js.UndefOr[js.Array[Double]] = js.undefined
  var stop: js.UndefOr[js.Array[Double]] = js.undefined
}

object Anon_Count {
  @scala.inline
  def apply(
    gradient: Field,
    count: Int | Double = null,
    start: js.Array[Double] = null,
    stop: js.Array[Double] = null
  ): Anon_Count = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[Anon_Count]
  }
}

