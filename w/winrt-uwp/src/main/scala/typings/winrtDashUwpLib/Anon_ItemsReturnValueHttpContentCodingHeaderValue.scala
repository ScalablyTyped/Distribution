package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpContentCodingHeaderValue extends js.Object {
  /** An array of HttpContentCodingHeaderValue items that start at startIndex in the HttpContentCodingHeaderValueCollection . */ var items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentCodingHeaderValue
  /** The number of HttpContentCodingHeaderValue items retrieved. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueHttpContentCodingHeaderValue {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpContentCodingHeaderValue,
    returnValue: scala.Double
  ): Anon_ItemsReturnValueHttpContentCodingHeaderValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpContentCodingHeaderValue]
  }
}

