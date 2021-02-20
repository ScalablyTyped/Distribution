package typings.typedGithubApi

import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.githubRefMod.OptionsOrRef
import typings.typedGithubApi.interfacesMilestoneMod.Milestone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMilestoneMod {
  
  @JSImport("typed-github-api/dist/milestone", "MilestoneClass")
  @js.native
  class MilestoneClass protected ()
    extends GitHubRef
       with Milestone {
    def this(data: typings.typedGithubApi.milestoneMod.Milestone, options: OptionsOrRef) = this()
  }
}
