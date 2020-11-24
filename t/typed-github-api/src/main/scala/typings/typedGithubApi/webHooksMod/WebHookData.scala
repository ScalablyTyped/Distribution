package typings.typedGithubApi.webHooksMod

import typings.typedGithubApi.repositoryMod.Repository
import typings.typedGithubApi.userMod.OrganizationSummary
import typings.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebHookData extends Event {
  
  var organization: js.UndefOr[OrganizationSummary] = js.native
  
  var repository: js.UndefOr[Repository] = js.native
  
  var sender: UserSummary = js.native
}
object WebHookData {
  
  @scala.inline
  def apply(action: String, sender: UserSummary): WebHookData = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebHookData]
  }
  
  @scala.inline
  implicit class WebHookDataOps[Self <: WebHookData] (val x: Self) extends AnyVal {
    
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
    def setSender(value: UserSummary): Self = this.set("sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization(value: OrganizationSummary): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    
    @scala.inline
    def setRepository(value: Repository): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
  }
}
