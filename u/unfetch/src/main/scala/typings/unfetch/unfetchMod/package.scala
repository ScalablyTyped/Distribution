package typings.unfetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object unfetchMod {
  import typings.std.Body
  import typings.std.Headers
  import typings.std.Request
  import typings.std.Response

  type IsomorphicBody = Body | typings.nodeDashFetch.nodeDashFetchMod.Body
  type IsomorphicHeaders = Headers | typings.nodeDashFetch.nodeDashFetchMod.Headers
  type IsomorphicRequest = Request | typings.nodeDashFetch.nodeDashFetchMod.Request
  type IsomorphicResponse = Response | typings.nodeDashFetch.nodeDashFetchMod.Response
}
