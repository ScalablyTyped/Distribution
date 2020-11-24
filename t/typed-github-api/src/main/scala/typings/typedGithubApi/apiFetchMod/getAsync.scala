package typings.typedGithubApi.apiFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typed-github-api/dist/api-fetch", "getAsync")
@js.native
object getAsync extends js.Object {
  
  def apply[T](uri: String, options: Options): js.Promise[Response[T] | Null] = js.native
}
