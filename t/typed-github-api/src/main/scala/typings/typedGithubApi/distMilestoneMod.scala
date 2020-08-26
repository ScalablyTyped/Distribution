package typings.typedGithubApi

import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.githubRefMod.OptionsOrRef
import typings.typedGithubApi.interfacesMilestoneMod.Milestone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/milestone", JSImport.Namespace)
@js.native
object distMilestoneMod extends js.Object {
  @js.native
  class MilestoneClass protected ()
    extends GitHubRef
       with Milestone {
    def this(data: typings.typedGithubApi.milestoneMod.Milestone, options: OptionsOrRef) = this()
  }
  
}

