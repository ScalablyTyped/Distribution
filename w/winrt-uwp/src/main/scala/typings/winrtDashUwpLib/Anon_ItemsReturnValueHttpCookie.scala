package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpCookie extends js.Object {
  /** The HttpCookie items that start at startIndex in the HttpCookieCollection . */ var items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpCookie
  /** The number of HttpCookie items retrieved. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueHttpCookie {
  @scala.inline
  def apply(items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpCookie, returnValue: scala.Double): Anon_ItemsReturnValueHttpCookie = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpCookie]
  }
}

