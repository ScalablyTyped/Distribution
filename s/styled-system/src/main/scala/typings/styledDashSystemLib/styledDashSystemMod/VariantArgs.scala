package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariantArgs extends js.Object {
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Component prop, defaults to "variant" */
  var prop: js.UndefOr[java.lang.String] = js.undefined
  /** theme key for variant definitions */
  var scale: js.UndefOr[java.lang.String] = js.undefined
}

object VariantArgs {
  @scala.inline
  def apply(key: java.lang.String = null, prop: java.lang.String = null, scale: java.lang.String = null): VariantArgs = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (prop != null) __obj.updateDynamic("prop")(prop)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    __obj.asInstanceOf[VariantArgs]
  }
}

