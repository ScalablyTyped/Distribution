package typings.typedDashGithubDashApi

import typings.typedDashGithubDashApi.distApiDashFetchMod.Options
import typings.typedDashGithubDashApi.distApiDashFetchMod.Response
import typings.typedDashGithubDashApi.distGithubDashRefMod.OptionsOrRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/github-ref", JSImport.Namespace)
@js.native
object distGithubDashRefMod extends js.Object {
  @js.native
  class GitHubRef protected () extends OptionsOrRef {
    protected def this(options: OptionsOrRef) = this()
    val options: Options = js.native
    def getAllPagesAsync[T](uri: String): js.Promise[js.Array[T] | Null] = js.native
    def getAsync[T](uri: String): js.Promise[Response[T] | Null] = js.native
    def getPreviewAsync[T](uri: String): js.Promise[Response[T] | Null] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedDashGithubDashApi.distApiDashFetchMod.Options
    - typings.typedDashGithubDashApi.distGithubDashRefMod.GitHubRef
  */
  trait OptionsOrRef extends js.Object
  
}

