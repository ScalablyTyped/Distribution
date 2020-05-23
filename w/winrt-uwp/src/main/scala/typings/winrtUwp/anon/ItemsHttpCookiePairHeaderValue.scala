package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpCookiePairHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsHttpCookiePairHeaderValue extends js.Object {
  /** An array of HttpCookiePairHeaderValue items that start at startIndex in the HttpCookiePairHeaderValueCollection . */ var items: HttpCookiePairHeaderValue
  /** The number of HttpCookiePairHeaderValue items retrieved. */ var returnValue: Double
}

object ItemsHttpCookiePairHeaderValue {
  @scala.inline
  def apply(items: HttpCookiePairHeaderValue, returnValue: Double): ItemsHttpCookiePairHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpCookiePairHeaderValue]
  }
}

