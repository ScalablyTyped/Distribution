package typings.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var highlight: js.UndefOr[String] = js.undefined
  var hover: js.UndefOr[String] = js.undefined
  var inherit: js.UndefOr[Boolean | String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object AnonColor {
  @scala.inline
  def apply(
    color: String = null,
    highlight: String = null,
    hover: String = null,
    inherit: Boolean | String = null,
    opacity: Int | Double = null
  ): AnonColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inherit != null) __obj.updateDynamic("inherit")(inherit.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
}

