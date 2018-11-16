package typings
package typedDashGithubDashApiLib.distGithubDashRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/github-ref", "GitHubRef")
@js.native
class GitHubRef protected () extends js.Object {
  protected def this(options: OptionsOrRef) = this()
  val options: typedDashGithubDashApiLib.distApiDashFetchMod.Options = js.native
  def getAllPagesAsync[T](uri: java.lang.String): stdLib.Promise[js.Array[T] | scala.Null] = js.native
  def getAsync[T](uri: java.lang.String): stdLib.Promise[typedDashGithubDashApiLib.distApiDashFetchMod.Response[T] | scala.Null] = js.native
  def getPreviewAsync[T](uri: java.lang.String): stdLib.Promise[typedDashGithubDashApiLib.distApiDashFetchMod.Response[T] | scala.Null] = js.native
}

