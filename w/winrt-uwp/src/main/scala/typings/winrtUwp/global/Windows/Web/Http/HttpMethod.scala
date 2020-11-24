package typings.winrtUwp.global.Windows.Web.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Retrieves standard HTTP methods such as GET and POST and creates new HTTP methods. */
@JSGlobal("Windows.Web.Http.HttpMethod")
@js.native
class HttpMethod protected ()
  extends typings.winrtUwp.Windows.Web.Http.HttpMethod {
  /**
    * Initializes a new instance of the HttpMethod class with a specific HTTP method.
    * @param method The HTTP method.
    */
  def this(method: String) = this()
}
/* static members */
@JSGlobal("Windows.Web.Http.HttpMethod")
@js.native
object HttpMethod extends js.Object {
  
  /** Gets the HTTP DELETE method. */
  var delete: typings.winrtUwp.Windows.Web.Http.HttpMethod = js.native
  
  /** Gets the HTTP GET method. */
  var get: typings.winrtUwp.Windows.Web.Http.HttpMethod = js.native
  
  /** Gets the HTTP HEAD method. */
  var head: typings.winrtUwp.Windows.Web.Http.HttpMethod = js.native
  
  /** Gets the HTTP OPTIONS method. */
  var options: typings.winrtUwp.Windows.Web.Http.HttpMethod = js.native
  
  /** Gets the HTTP PATCH method, */
  var patch: typings.winrtUwp.Windows.Web.Http.HttpMethod = js.native
  
  /** Gets the HTTP POST method. */
  var post: typings.winrtUwp.Windows.Web.Http.HttpMethod = js.native
  
  /** Gets the HTTP PUT method. */
  var put: typings.winrtUwp.Windows.Web.Http.HttpMethod = js.native
}
