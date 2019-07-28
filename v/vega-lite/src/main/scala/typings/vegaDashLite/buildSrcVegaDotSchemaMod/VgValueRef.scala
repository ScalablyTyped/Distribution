package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.Anon_Datum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgValueRef extends js.Object {
  var band: js.UndefOr[Boolean | Double | VgValueRef] = js.undefined
  var field: js.UndefOr[String | Anon_Datum] = js.undefined
  var mult: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double | VgValueRef] = js.undefined
  var scale: js.UndefOr[String] = js.undefined
  var signal: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double | String | Boolean] = js.undefined
}

object VgValueRef {
  @scala.inline
  def apply(
    band: Boolean | Double | VgValueRef = null,
    field: String | Anon_Datum = null,
    mult: Int | Double = null,
    offset: Double | VgValueRef = null,
    scale: String = null,
    signal: String = null,
    value: Double | String | Boolean = null
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

