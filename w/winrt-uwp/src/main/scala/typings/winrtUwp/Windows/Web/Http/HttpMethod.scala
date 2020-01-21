package typings.winrtUwp.Windows.Web.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Retrieves standard HTTP methods such as GET and POST and creates new HTTP methods. */
@JSGlobal("Windows.Web.Http.HttpMethod")
@js.native
class HttpMethod protected () extends js.Object {
  /**
    * Initializes a new instance of the HttpMethod class with a specific HTTP method.
    * @param method The HTTP method.
    */
  def this(method: String) = this()
  /** Gets the HTTP method. */
  var method: String = js.native
}

/* static members */
@JSGlobal("Windows.Web.Http.HttpMethod")
@js.native
object HttpMethod extends js.Object {
  /** Gets the HTTP DELETE method. */
  var delete: HttpMethod = js.native
  /** Gets the HTTP GET method. */
  var get: HttpMethod = js.native
  /** Gets the HTTP HEAD method. */
  var head: HttpMethod = js.native
  /** Gets the HTTP OPTIONS method. */
  var options: HttpMethod = js.native
  /** Gets the HTTP PATCH method, */
  var patch: HttpMethod = js.native
  /** Gets the HTTP POST method. */
  var post: HttpMethod = js.native
  /** Gets the HTTP PUT method. */
  var put: HttpMethod = js.native
}

