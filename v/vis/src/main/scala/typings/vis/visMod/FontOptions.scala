package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontOptions extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var face: js.UndefOr[String] = js.undefined
  var mod: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var vadjust: js.UndefOr[String] = js.undefined
}

object FontOptions {
  @scala.inline
  def apply(
    color: String = null,
    face: String = null,
    mod: String = null,
    size: Int | Double = null,
    vadjust: String = null
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

