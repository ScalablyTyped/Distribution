package typings.uinput.uinputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateID extends js.Object {
  var absflat: js.UndefOr[js.Array[Double]] = js.undefined
  var absfuzz: js.UndefOr[js.Array[Double]] = js.undefined
  var absmax: js.UndefOr[js.Array[Double]] = js.undefined
  var absmin: js.UndefOr[js.Array[Double]] = js.undefined
  var bustype: Double
  var ff_effects_max: js.UndefOr[Double] = js.undefined
  var product: Double
  var vendor: Double
  var version: Double
}

object CreateID {
  @scala.inline
  def apply(
    bustype: Double,
    product: Double,
    vendor: Double,
    version: Double,
    absflat: js.Array[Double] = null,
    absfuzz: js.Array[Double] = null,
    absmax: js.Array[Double] = null,
    absmin: js.Array[Double] = null,
    ff_effects_max: Int | Double = null
  ): CreateID = {
    val __obj = js.Dynamic.literal(bustype = bustype.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (absflat != null) __obj.updateDynamic("absflat")(absflat.asInstanceOf[js.Any])
    if (absfuzz != null) __obj.updateDynamic("absfuzz")(absfuzz.asInstanceOf[js.Any])
    if (absmax != null) __obj.updateDynamic("absmax")(absmax.asInstanceOf[js.Any])
    if (absmin != null) __obj.updateDynamic("absmin")(absmin.asInstanceOf[js.Any])
    if (ff_effects_max != null) __obj.updateDynamic("ff_effects_max")(ff_effects_max.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateID]
  }
}

