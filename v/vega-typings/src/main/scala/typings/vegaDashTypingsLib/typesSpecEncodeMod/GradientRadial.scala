package typings
package vegaDashTypingsLib.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientRadial extends js.Object {
  var gradient: vegaDashTypingsLib.vegaDashTypingsLibStrings.radial
  var id: js.UndefOr[java.lang.String] = js.undefined
  var r1: js.UndefOr[scala.Double] = js.undefined
  var r2: js.UndefOr[scala.Double] = js.undefined
  var stops: js.Array[GradientStop]
  var x1: js.UndefOr[scala.Double] = js.undefined
  var x2: js.UndefOr[scala.Double] = js.undefined
  var y1: js.UndefOr[scala.Double] = js.undefined
  var y2: js.UndefOr[scala.Double] = js.undefined
}

object GradientRadial {
  @scala.inline
  def apply(
    gradient: vegaDashTypingsLib.vegaDashTypingsLibStrings.radial,
    stops: js.Array[GradientStop],
    id: java.lang.String = null,
    r1: scala.Int | scala.Double = null,
    r2: scala.Int | scala.Double = null,
    x1: scala.Int | scala.Double = null,
    x2: scala.Int | scala.Double = null,
    y1: scala.Int | scala.Double = null,
    y2: scala.Int | scala.Double = null
  ): GradientRadial = {
    val __obj = js.Dynamic.literal(gradient = gradient, stops = stops)
    if (id != null) __obj.updateDynamic("id")(id)
    if (r1 != null) __obj.updateDynamic("r1")(r1.asInstanceOf[js.Any])
    if (r2 != null) __obj.updateDynamic("r2")(r2.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientRadial]
  }
}

