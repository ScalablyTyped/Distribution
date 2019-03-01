package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var highlight: js.UndefOr[java.lang.String] = js.undefined
  var hover: js.UndefOr[java.lang.String] = js.undefined
  var inherit: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    highlight: java.lang.String = null,
    hover: java.lang.String = null,
    inherit: scala.Boolean | java.lang.String = null,
    opacity: scala.Int | scala.Double = null
  ): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (highlight != null) __obj.updateDynamic("highlight")(highlight)
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (inherit != null) __obj.updateDynamic("inherit")(inherit.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Color]
  }
}

