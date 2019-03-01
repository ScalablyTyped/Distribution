package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache extends js.Object {
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  var font: js.UndefOr[vexflowLib.VexNs.IFont] = js.undefined
}

object Anon_Cache {
  @scala.inline
  def apply(cache: js.UndefOr[scala.Boolean] = js.undefined, font: vexflowLib.VexNs.IFont = null): Anon_Cache = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[Anon_Cache]
  }
}

