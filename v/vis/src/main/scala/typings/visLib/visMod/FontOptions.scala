package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontOptions extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var face: js.UndefOr[java.lang.String] = js.undefined
  var mod: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var vadjust: js.UndefOr[java.lang.String] = js.undefined
}

object FontOptions {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    face: java.lang.String = null,
    mod: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    vadjust: java.lang.String = null
  ): FontOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (face != null) __obj.updateDynamic("face")(face)
    if (mod != null) __obj.updateDynamic("mod")(mod)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (vadjust != null) __obj.updateDynamic("vadjust")(vadjust)
    __obj.asInstanceOf[FontOptions]
  }
}

