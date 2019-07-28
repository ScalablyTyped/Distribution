package typings.typedDashGithubDashApi.distGithubDashRefMod

import typings.typedDashGithubDashApi.distApiDashFetchMod.Options
import typings.typedDashGithubDashApi.distApiDashFetchMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/github-ref", "GitHubRef")
@js.native
class GitHubRef protected () extends OptionsOrRef {
  protected def this(options: OptionsOrRef) = this()
  val options: Options = js.native
  def getAllPagesAsync[T](uri: String): js.Promise[js.Array[T] | Null] = js.native
  def getAsync[T](uri: String): js.Promise[Response[T] | Null] = js.native
  def getPreviewAsync[T](uri: String): js.Promise[Response[T] | Null] = js.native
}

