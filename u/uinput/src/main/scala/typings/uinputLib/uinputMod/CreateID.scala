package typings
package uinputLib.uinputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateID extends js.Object {
  var absflat: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var absfuzz: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var absmax: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var absmin: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var bustype: scala.Double
  var ff_effects_max: js.UndefOr[scala.Double] = js.undefined
  var product: scala.Double
  var vendor: scala.Double
  var version: scala.Double
}

object CreateID {
  @scala.inline
  def apply(
    bustype: scala.Double,
    product: scala.Double,
    vendor: scala.Double,
    version: scala.Double,
    absflat: js.Array[scala.Double] = null,
    absfuzz: js.Array[scala.Double] = null,
    absmax: js.Array[scala.Double] = null,
    absmin: js.Array[scala.Double] = null,
    ff_effects_max: scala.Int | scala.Double = null
  ): CreateID = {
    val __obj = js.Dynamic.literal(bustype = bustype, product = product, vendor = vendor, version = version)
    if (absflat != null) __obj.updateDynamic("absflat")(absflat)
    if (absfuzz != null) __obj.updateDynamic("absfuzz")(absfuzz)
    if (absmax != null) __obj.updateDynamic("absmax")(absmax)
    if (absmin != null) __obj.updateDynamic("absmin")(absmin)
    if (ff_effects_max != null) __obj.updateDynamic("ff_effects_max")(ff_effects_max.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateID]
  }
}

