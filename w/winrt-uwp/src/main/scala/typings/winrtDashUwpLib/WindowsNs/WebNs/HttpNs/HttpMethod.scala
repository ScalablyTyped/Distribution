package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs

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
  def this(method: java.lang.String) = this()
  /** Gets the HTTP method. */
  var method: java.lang.String = js.native
}

/** Retrieves standard HTTP methods such as GET and POST and creates new HTTP methods. */
@JSGlobal("Windows.Web.Http.HttpMethod")
@js.native
object HttpMethod extends js.Object {
  /** Gets the HTTP DELETE method. */
  var delete: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpMethod = js.native
  /** Gets the HTTP GET method. */
  var get: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpMethod = js.native
  /** Gets the HTTP HEAD method. */
  var head: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpMethod = js.native
  /** Gets the HTTP OPTIONS method. */
  var options: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpMethod = js.native
  /** Gets the HTTP PATCH method, */
  var patch: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpMethod = js.native
  /** Gets the HTTP POST method. */
  var post: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpMethod = js.native
  /** Gets the HTTP PUT method. */
  var put: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HttpMethod = js.native
}

