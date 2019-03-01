package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpProductInfoHeaderValue extends js.Object {
  /** An array of HttpProductInfoHeaderValue items that start at startIndex in the HttpProductInfoHeaderValueCollection . */ var items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpProductInfoHeaderValue
  /** The number of items retrieved. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueHttpProductInfoHeaderValue {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpProductInfoHeaderValue,
    returnValue: scala.Double
  ): Anon_ItemsReturnValueHttpProductInfoHeaderValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpProductInfoHeaderValue]
  }
}

