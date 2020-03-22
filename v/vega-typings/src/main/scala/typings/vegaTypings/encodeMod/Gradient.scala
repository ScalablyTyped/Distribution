package typings.vegaTypings.encodeMod

import typings.vegaTypings.vegaTypingsStrings.linear
import typings.vegaTypings.vegaTypingsStrings.radial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.encodeMod.LinearGradient
  - typings.vegaTypings.encodeMod.RadialGradient
*/
trait Gradient extends js.Object

object Gradient {
  @scala.inline
  def LinearGradient(
    gradient: linear,
    stops: js.Array[GradientStop],
    id: String = null,
    x1: Int | Double = null,
    x2: Int | Double = null,
    y1: Int | Double = null,
    y2: Int | Double = null
  ): Gradient = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradient]
  }
  @scala.inline
  def RadialGradient(
    gradient: radial,
    stops: js.Array[GradientStop],
    id: String = null,
    r1: Int | Double = null,
    r2: Int | Double = null,
    x1: Int | Double = null,
    x2: Int | Double = null,
    y1: Int | Double = null,
    y2: Int | Double = null
  ): Gradient = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (r1 != null) __obj.updateDynamic("r1")(r1.asInstanceOf[js.Any])
    if (r2 != null) __obj.updateDynamic("r2")(r2.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradient]
  }
}

