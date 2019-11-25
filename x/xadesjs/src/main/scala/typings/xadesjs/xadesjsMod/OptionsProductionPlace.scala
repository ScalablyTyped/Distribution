package typings.xadesjs.xadesjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsProductionPlace extends js.Object {
  var city: js.UndefOr[String] = js.undefined
  var code: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object OptionsProductionPlace {
  @scala.inline
  def apply(city: String = null, code: String = null, country: String = null, state: String = null): OptionsProductionPlace = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsProductionPlace]
  }
}

