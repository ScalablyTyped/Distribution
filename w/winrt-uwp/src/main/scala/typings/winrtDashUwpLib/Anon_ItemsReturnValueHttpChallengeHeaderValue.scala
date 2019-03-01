package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpChallengeHeaderValue extends js.Object {
  /** An array of HttpChallengeHeaderValue items that start at startIndex in the HttpChallengeHeaderValueCollection . */ var items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpChallengeHeaderValue
  /** The number of HttpChallengeHeaderValue items retrieved. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueHttpChallengeHeaderValue {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpChallengeHeaderValue,
    returnValue: scala.Double
  ): Anon_ItemsReturnValueHttpChallengeHeaderValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpChallengeHeaderValue]
  }
}

