package typings.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents name and value information used in a number of HTTP headers. */
trait HttpNameValueHeaderValue extends js.Object {
  /** Gets the name used in the HttpNameValueHeaderValue object. */
  var name: String
  /** Gets or sets the value associated with a name used in the HttpNameValueHeaderValue object. */
  var value: String
}

object HttpNameValueHeaderValue {
  @scala.inline
  def apply(name: String, value: String): HttpNameValueHeaderValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpNameValueHeaderValue]
  }
}

