package typings.typedGithubApi.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationSummary extends UserOrOrgSummary {
  
  var description: String = js.native
  
  var hooks_url: String = js.native
  
  var issues_url: String = js.native
  
  var members_url: String = js.native
  
  var public_members_url: String = js.native
  
  @JSName("type")
  var type_OrganizationSummary: typings.typedGithubApi.typedGithubApiStrings.Organization = js.native
}
object OrganizationSummary {
  
  @scala.inline
  def apply(
    avatar_url: String,
    description: String,
    events_url: String,
    hooks_url: String,
    id: Double,
    issues_url: String,
    login: String,
    members_url: String,
    public_members_url: String,
    repos_url: String,
    `type`: typings.typedGithubApi.typedGithubApiStrings.Organization,
    url: String
  ): OrganizationSummary = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], public_members_url = public_members_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationSummary]
  }
  
  @scala.inline
  implicit class OrganizationSummaryOps[Self <: OrganizationSummary] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooks_url(value: String): Self = this.set("hooks_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssues_url(value: String): Self = this.set("issues_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers_url(value: String): Self = this.set("members_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_members_url(value: String): Self = this.set("public_members_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.typedGithubApi.typedGithubApiStrings.Organization): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
