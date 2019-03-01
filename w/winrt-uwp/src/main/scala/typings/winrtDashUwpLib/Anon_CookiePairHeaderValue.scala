package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CookiePairHeaderValue extends js.Object {
  /** The HttpCookiePairHeaderValue version of the string. */ var cookiePairHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpCookiePairHeaderValue
  /** true if input is valid HttpCookiePairHeaderValue information; otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_CookiePairHeaderValue {
  @scala.inline
  def apply(
    cookiePairHeaderValue: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpCookiePairHeaderValue,
    returnValue: scala.Boolean
  ): Anon_CookiePairHeaderValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cookiePairHeaderValue")(cookiePairHeaderValue)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_CookiePairHeaderValue]
  }
}

