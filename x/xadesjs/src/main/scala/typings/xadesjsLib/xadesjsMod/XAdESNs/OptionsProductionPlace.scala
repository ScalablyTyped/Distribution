package typings
package xadesjsLib.xadesjsMod.XAdESNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsProductionPlace extends js.Object {
  var city: js.UndefOr[java.lang.String] = js.undefined
  var code: js.UndefOr[java.lang.String] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object OptionsProductionPlace {
  @scala.inline
  def apply(
    city: java.lang.String = null,
    code: java.lang.String = null,
    country: java.lang.String = null,
    state: java.lang.String = null
  ): OptionsProductionPlace = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city)
    if (code != null) __obj.updateDynamic("code")(code)
    if (country != null) __obj.updateDynamic("country")(country)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[OptionsProductionPlace]
  }
}

