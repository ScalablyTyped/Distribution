package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.HttpCookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsHttpCookie extends js.Object {
  /** The HttpCookie items that start at startIndex in the HttpCookieCollection . */ var items: HttpCookie
  /** The number of HttpCookie items retrieved. */ var returnValue: Double
}

object AnonItemsHttpCookie {
  @scala.inline
  def apply(items: HttpCookie, returnValue: Double): AnonItemsHttpCookie = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsHttpCookie]
  }
}

