package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpCookiePairHeaderValue extends js.Object {
  /** An array of HttpCookiePairHeaderValue items that start at startIndex in the HttpCookiePairHeaderValueCollection . */ var items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpCookiePairHeaderValue
  /** The number of HttpCookiePairHeaderValue items retrieved. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueHttpCookiePairHeaderValue {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpCookiePairHeaderValue,
    returnValue: scala.Double
  ): Anon_ItemsReturnValueHttpCookiePairHeaderValue = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpCookiePairHeaderValue]
  }
}

