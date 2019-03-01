package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpExpectationHeaderValue extends js.Object {
  /** An array of HttpExpectationHeaderValue items that start at startIndex in the HttpExpectationHeaderValueCollection . */ var items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpExpectationHeaderValue
  /** The number of items retrieved. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueHttpExpectationHeaderValue {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpExpectationHeaderValue,
    returnValue: scala.Double
  ): Anon_ItemsReturnValueHttpExpectationHeaderValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpExpectationHeaderValue]
  }
}

