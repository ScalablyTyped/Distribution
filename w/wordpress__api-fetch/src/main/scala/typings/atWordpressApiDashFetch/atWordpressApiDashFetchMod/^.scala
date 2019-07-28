package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod

import typings.atWordpressApiDashFetch.Anon_False
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/api-fetch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default(options: APIFetchOptions with Anon_False): js.Promise[Response] = js.native
  @JSName("default")
  def default_T[T](options: APIFetchOptions): js.Promise[T] = js.native
}

