package typings.typedGithubApi

import typings.typedGithubApi.githubApiMod.GitHubApi
import typings.typedGithubApi.githubRefMod.OptionsOrRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class IssueWebHook ()
    extends typings.typedGithubApi.webHookMod.IssueWebHook
  
  @js.native
  class default protected () extends GitHubApi {
    def this(options: OptionsOrRef) = this()
  }
  
}

