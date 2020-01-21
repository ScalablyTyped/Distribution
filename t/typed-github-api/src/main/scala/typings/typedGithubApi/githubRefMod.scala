package typings.typedGithubApi

import typings.typedGithubApi.apiFetchMod.Options
import typings.typedGithubApi.apiFetchMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/github-ref", JSImport.Namespace)
@js.native
object githubRefMod extends js.Object {
  @js.native
  class GitHubRef protected () extends OptionsOrRef {
    protected def this(options: OptionsOrRef) = this()
    val options: Options = js.native
    def getAllPagesAsync[T](uri: String): js.Promise[js.Array[T] | Null] = js.native
    def getAsync[T](uri: String): js.Promise[Response[T] | Null] = js.native
    def getPreviewAsync[T](uri: String): js.Promise[Response[T] | Null] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedGithubApi.apiFetchMod.Options
    - typings.typedGithubApi.githubRefMod.GitHubRef
  */
  trait OptionsOrRef extends js.Object
  
}

