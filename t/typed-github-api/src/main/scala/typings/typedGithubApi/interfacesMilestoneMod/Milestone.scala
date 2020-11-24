package typings.typedGithubApi.interfacesMilestoneMod

import typings.moment.mod.Moment
import typings.typedGithubApi.interfacesUserMod.UserSummary
import typings.typedGithubApi.typedGithubApiStrings.closed
import typings.typedGithubApi.typedGithubApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Milestone extends js.Object {
  
  var closed: js.UndefOr[Moment] = js.native
  
  var closedIssueCount: Double = js.native
  
  var created: Moment = js.native
  
  var creator: UserSummary = js.native
  
  var description: String = js.native
  
  var due: Moment = js.native
  
  var htmlUri: String = js.native
  
  var id: Double = js.native
  
  var number: Double = js.native
  
  var openIssueCount: Double = js.native
  
  var state: open | closed = js.native
  
  var title: String = js.native
  
  var updated: Moment = js.native
}
object Milestone {
  
  @scala.inline
  def apply(
    closedIssueCount: Double,
    created: Moment,
    creator: UserSummary,
    description: String,
    due: Moment,
    htmlUri: String,
    id: Double,
    number: Double,
    openIssueCount: Double,
    state: open | closed,
    title: String,
    updated: Moment
  ): Milestone = {
    val __obj = js.Dynamic.literal(closedIssueCount = closedIssueCount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], due = due.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], openIssueCount = openIssueCount.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Milestone]
  }
  
  @scala.inline
  implicit class MilestoneOps[Self <: Milestone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClosedIssueCount(value: Double): Self = this.set("closedIssueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Moment): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: UserSummary): Self = this.set("creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDue(value: Moment): Self = this.set("due", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUri(value: String): Self = this.set("htmlUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenIssueCount(value: Double): Self = this.set("openIssueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: open | closed): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: Moment): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosed(value: Moment): Self = this.set("closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
  }
}
