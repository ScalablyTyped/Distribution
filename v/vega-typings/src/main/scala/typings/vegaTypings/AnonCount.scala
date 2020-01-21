package typings.vegaTypings

import typings.vegaTypings.encodeMod.Field
import typings.vegaTypings.encodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends _ColorValueRef {
  var count: js.UndefOr[Double] = js.undefined
  var gradient: Field
  var start: js.UndefOr[js.Array[Double]] = js.undefined
  var stop: js.UndefOr[js.Array[Double]] = js.undefined
}

object AnonCount {
  @scala.inline
  def apply(
    gradient: Field,
    count: Int | Double = null,
    start: js.Array[Double] = null,
    stop: js.Array[Double] = null
  ): AnonCount = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
}

