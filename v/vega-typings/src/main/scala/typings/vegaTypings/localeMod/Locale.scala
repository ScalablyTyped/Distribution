package typings.vegaTypings.localeMod

import typings.vegaTypings.anon.Currency
import typings.vegaTypings.anon.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  /**
    * Locale definition for formatting numbers.
    */
  var number: js.UndefOr[Currency] = js.undefined
  /**
    * Locale definition for formatting dates and times.
    */
  var time: js.UndefOr[Date] = js.undefined
}

object Locale {
  @scala.inline
  def apply(number: Currency = null, time: Date = null): Locale = {
    val __obj = js.Dynamic.literal()
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

