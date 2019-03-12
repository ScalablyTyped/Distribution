package typings
package typedDashGithubDashApiLib.distApiDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/api-fetch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getAllPagesAsync[T](uri: java.lang.String, options: Options): js.Promise[js.Array[T] | scala.Null] = js.native
  def getAsync[T](uri: java.lang.String, options: Options): js.Promise[Response[T] | scala.Null] = js.native
}

