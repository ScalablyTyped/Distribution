package typings.winrtUwp.Windows.Web.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Retrieves standard HTTP methods such as GET and POST and creates new HTTP methods. */
trait HttpMethod extends js.Object {
  /** Gets the HTTP method. */
  var method: String
}

object HttpMethod {
  @scala.inline
  def apply(method: String): HttpMethod = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpMethod]
  }
}

