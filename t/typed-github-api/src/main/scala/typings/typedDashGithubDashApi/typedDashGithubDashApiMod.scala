package typings.typedDashGithubDashApi

import typings.typedDashGithubDashApi.distGithubDashApiMod.GitHubApi
import typings.typedDashGithubDashApi.distGithubDashRefMod.OptionsOrRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api", JSImport.Namespace)
@js.native
object typedDashGithubDashApiMod extends js.Object {
  @js.native
  class IssueWebHook ()
    extends typings.typedDashGithubDashApi.distWebDashHookMod.IssueWebHook
  
  @js.native
  class default protected () extends GitHubApi {
    def this(options: OptionsOrRef) = this()
  }
  
}

