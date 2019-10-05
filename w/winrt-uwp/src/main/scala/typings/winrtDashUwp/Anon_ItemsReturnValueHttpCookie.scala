package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Web.Http.HttpCookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpCookie extends js.Object {
  /** The HttpCookie items that start at startIndex in the HttpCookieCollection . */ var items: HttpCookie
  /** The number of HttpCookie items retrieved. */ var returnValue: Double
}

object Anon_ItemsReturnValueHttpCookie {
  @scala.inline
  def apply(items: HttpCookie, returnValue: Double): Anon_ItemsReturnValueHttpCookie = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpCookie]
  }
}

