package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgValueRef extends js.Object {
  var band: js.UndefOr[scala.Boolean | scala.Double | VgValueRef] = js.undefined
  var field: js.UndefOr[java.lang.String | vegaDashLiteLib.Anon_Datum] = js.undefined
  var mult: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double | VgValueRef] = js.undefined
  var scale: js.UndefOr[java.lang.String] = js.undefined
  var signal: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double | java.lang.String | scala.Boolean] = js.undefined
}

object VgValueRef {
  @scala.inline
  def apply(
    band: scala.Boolean | scala.Double | VgValueRef = null,
    field: java.lang.String | vegaDashLiteLib.Anon_Datum = null,
    mult: scala.Int | scala.Double = null,
    offset: scala.Double | VgValueRef = null,
    scale: java.lang.String = null,
    signal: java.lang.String = null,
    value: scala.Double | java.lang.String | scala.Boolean = null
  ): VgValueRef = {
    val __obj = js.Dynamic.literal()
    if (band != null) __obj.updateDynamic("band")(band.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (mult != null) __obj.updateDynamic("mult")(mult.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgValueRef]
  }
}

