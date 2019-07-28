package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs.HttpCookiePairHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpCookiePairHeaderValue extends js.Object {
  /** An array of HttpCookiePairHeaderValue items that start at startIndex in the HttpCookiePairHeaderValueCollection . */ var items: HttpCookiePairHeaderValue
  /** The number of HttpCookiePairHeaderValue items retrieved. */ var returnValue: Double
}

object Anon_ItemsReturnValueHttpCookiePairHeaderValue {
  @scala.inline
  def apply(items: HttpCookiePairHeaderValue, returnValue: Double): Anon_ItemsReturnValueHttpCookiePairHeaderValue = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpCookiePairHeaderValue]
  }
}

