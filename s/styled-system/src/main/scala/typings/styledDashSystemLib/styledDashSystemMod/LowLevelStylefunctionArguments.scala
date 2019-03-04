package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LowLevelStylefunctionArguments extends js.Object {
  var cssProperty: js.UndefOr[java.lang.String] = js.undefined
  var getter: js.UndefOr[js.Function0[_]] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var prop: java.lang.String
  var scale: js.UndefOr[js.Array[java.lang.String | scala.Double]] = js.undefined
  var transformValue: js.UndefOr[js.Function1[/* n */ java.lang.String | scala.Double, _]] = js.undefined
}

object LowLevelStylefunctionArguments {
  @scala.inline
  def apply(
    prop: java.lang.String,
    cssProperty: java.lang.String = null,
    getter: js.Function0[_] = null,
    key: java.lang.String = null,
    scale: js.Array[java.lang.String | scala.Double] = null,
    transformValue: js.Function1[/* n */ java.lang.String | scala.Double, _] = null
  ): LowLevelStylefunctionArguments = {
    val __obj = js.Dynamic.literal(prop = prop)
    if (cssProperty != null) __obj.updateDynamic("cssProperty")(cssProperty)
    if (getter != null) __obj.updateDynamic("getter")(getter)
    if (key != null) __obj.updateDynamic("key")(key)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (transformValue != null) __obj.updateDynamic("transformValue")(transformValue)
    __obj.asInstanceOf[LowLevelStylefunctionArguments]
  }
}

