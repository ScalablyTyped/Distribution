package typings
package svgDotJsLib.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO finishs FX
trait StopProperties extends js.Object {
  var color: js.UndefOr[ColorAlias] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object StopProperties {
  @scala.inline
  def apply(
    color: ColorAlias = null,
    offset: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null
  ): StopProperties = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopProperties]
  }
}

