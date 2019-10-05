package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Web.Http.Headers.HttpCookiePairHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CookiePairHeaderValue extends js.Object {
  /** The HttpCookiePairHeaderValue version of the string. */ var cookiePairHeaderValue: HttpCookiePairHeaderValue
  /** true if input is valid HttpCookiePairHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object Anon_CookiePairHeaderValue {
  @scala.inline
  def apply(cookiePairHeaderValue: HttpCookiePairHeaderValue, returnValue: Boolean): Anon_CookiePairHeaderValue = {
    val __obj = js.Dynamic.literal(cookiePairHeaderValue = cookiePairHeaderValue, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_CookiePairHeaderValue]
  }
}

