package typings.typedDashGithubDashApi.distApiDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/api-fetch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getAllPagesAsync[T](uri: String, options: Options): js.Promise[js.Array[T] | Null] = js.native
  def getAsync[T](uri: String, options: Options): js.Promise[Response[T] | Null] = js.native
}

