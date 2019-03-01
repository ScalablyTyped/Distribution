package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
    // 50,
  var color: js.UndefOr[java.lang.String] = js.undefined
  var face: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    color: java.lang.String = null,
    face: java.lang.String = null,
    size: scala.Int | scala.Double = null
  ): Anon_Code = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (color != null) __obj.updateDynamic("color")(color)
    if (face != null) __obj.updateDynamic("face")(face)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Code]
  }
}

