package typings.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents cookie information used in the Cookie HTTP header on an HTTP request. */
trait HttpCookiePairHeaderValue extends js.Object {
  /** Gets a token that represents the cookie name used in the Cookie HTTP header. */
  var name: String
  /** Gets or sets a value for the cookie used in the Cookie HTTP header. */
  var value: String
}

object HttpCookiePairHeaderValue {
  @scala.inline
  def apply(name: String, value: String): HttpCookiePairHeaderValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpCookiePairHeaderValue]
  }
}

