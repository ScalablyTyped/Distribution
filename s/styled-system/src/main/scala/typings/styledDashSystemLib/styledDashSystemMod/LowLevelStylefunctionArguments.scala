package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LowLevelStylefunctionArguments extends js.Object {
  var alias: js.UndefOr[java.lang.String] = js.undefined
  var cssProperty: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var prop: java.lang.String
  var scale: js.UndefOr[js.Array[java.lang.String | scala.Double]] = js.undefined
  var transformValue: js.UndefOr[
    js.Function2[
      /* n */ java.lang.String | scala.Double, 
      /* scale */ js.Array[java.lang.String | scala.Double], 
      _
    ]
  ] = js.undefined
}

object LowLevelStylefunctionArguments {
  @scala.inline
  def apply(
    prop: java.lang.String,
    alias: java.lang.String = null,
    cssProperty: java.lang.String = null,
    key: java.lang.String = null,
    scale: js.Array[java.lang.String | scala.Double] = null,
    transformValue: (/* n */ java.lang.String | scala.Double, /* scale */ js.Array[java.lang.String | scala.Double]) => _ = null
  ): LowLevelStylefunctionArguments = {
    val __obj = js.Dynamic.literal(prop = prop)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (cssProperty != null) __obj.updateDynamic("cssProperty")(cssProperty)
    if (key != null) __obj.updateDynamic("key")(key)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (transformValue != null) __obj.updateDynamic("transformValue")(js.Any.fromFunction2(transformValue))
    __obj.asInstanceOf[LowLevelStylefunctionArguments]
  }
}

