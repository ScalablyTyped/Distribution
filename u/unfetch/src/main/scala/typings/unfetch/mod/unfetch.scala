package typings.unfetch.mod

import typings.std.Body
import typings.std.Headers
import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("unfetch", "unfetch")
@js.native
object unfetch extends js.Object {
  
  type IsomorphicBody = Body | typings.nodeFetch.mod.Body
  
  type IsomorphicHeaders = Headers | typings.nodeFetch.mod.Headers
  
  type IsomorphicRequest = Request | typings.nodeFetch.mod.Request
  
  type IsomorphicRequestInit = RequestInit | typings.nodeFetch.mod.RequestInit
  
  type IsomorphicResponse = Response | typings.nodeFetch.mod.Response
}
