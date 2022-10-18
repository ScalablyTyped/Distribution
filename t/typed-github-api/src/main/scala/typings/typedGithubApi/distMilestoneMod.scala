package typings.typedGithubApi

import typings.moment.mod.Moment
import typings.typedGithubApi.distGithubRefMod.GitHubRef
import typings.typedGithubApi.distGithubRefMod.OptionsOrRef
import typings.typedGithubApi.distInterfacesMilestoneMod.Milestone
import typings.typedGithubApi.distInterfacesUserMod.UserSummary
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMilestoneMod {
  
  @JSImport("typed-github-api/dist/milestone", "MilestoneClass")
  @js.native
  open class MilestoneClass protected ()
    extends GitHubRef
       with Milestone {
    def this(data: typings.typedGithubApi.distApiInterfacesMilestoneMod.Milestone, options: OptionsOrRef) = this()
    
    /* CompleteClass */
    var closedIssueCount: Double = js.native
    
    /* CompleteClass */
    var created: Moment = js.native
    
    /* CompleteClass */
    var creator: UserSummary = js.native
    
    /* CompleteClass */
    var description: String = js.native
    
    /* CompleteClass */
    var due: Moment = js.native
    
    /* CompleteClass */
    var htmlUri: String = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var number: Double = js.native
    
    /* CompleteClass */
    var openIssueCount: Double = js.native
    
    /* CompleteClass */
    var state: open | closed = js.native
    
    /* CompleteClass */
    var title: String = js.native
    
    /* CompleteClass */
    var updated: Moment = js.native
  }
}
