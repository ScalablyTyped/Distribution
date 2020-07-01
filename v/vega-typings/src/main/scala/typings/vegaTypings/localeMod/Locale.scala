package typings.vegaTypings.localeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var number: js.UndefOr[NumberLocale] = js.undefined
  var time: js.UndefOr[TimeLocale] = js.undefined
}

object Locale {
  @scala.inline
  def apply(number: NumberLocale = null, time: TimeLocale = null): Locale = {
    val __obj = js.Dynamic.literal()
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

