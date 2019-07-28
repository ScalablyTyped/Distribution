package typings.unfetch

import typings.std.Body
import typings.std.Headers
import typings.std.Request
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object unfetchMod {
  type IsomorphicBody = Body | typings.nodeDashFetch.nodeDashFetchMod.Body
  type IsomorphicHeaders = Headers | typings.nodeDashFetch.nodeDashFetchMod.Headers
  type IsomorphicRequest = Request | typings.nodeDashFetch.nodeDashFetchMod.Request
  type IsomorphicResponse = Response | typings.nodeDashFetch.nodeDashFetchMod.Response
}
