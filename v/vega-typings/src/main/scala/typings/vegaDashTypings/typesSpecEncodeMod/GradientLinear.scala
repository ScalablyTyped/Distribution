package typings.vegaDashTypings.typesSpecEncodeMod

import typings.vegaDashTypings.vegaDashTypingsStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientLinear extends js.Object {
  var gradient: linear
  var id: js.UndefOr[String] = js.undefined
  var stops: js.Array[GradientStop]
  var x1: js.UndefOr[Double] = js.undefined
  var x2: js.UndefOr[Double] = js.undefined
  var y1: js.UndefOr[Double] = js.undefined
  var y2: js.UndefOr[Double] = js.undefined
}

object GradientLinear {
  @scala.inline
  def apply(
    gradient: linear,
    stops: js.Array[GradientStop],
    id: String = null,
    x1: Int | Double = null,
    x2: Int | Double = null,
    y1: Int | Double = null,
    y2: Int | Double = null
  ): GradientLinear = {
    val __obj = js.Dynamic.literal(gradient = gradient, stops = stops)
    if (id != null) __obj.updateDynamic("id")(id)
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientLinear]
  }
}

