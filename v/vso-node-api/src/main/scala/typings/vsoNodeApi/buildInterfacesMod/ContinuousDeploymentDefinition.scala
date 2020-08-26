package typings.vsoNodeApi.buildInterfacesMod

import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typings.vsoNodeApi.coreInterfacesMod.WebApiConnectedServiceRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinuousDeploymentDefinition extends js.Object {
  /**
    * The connected service associated with the continuous deployment
    */
  var connectedService: WebApiConnectedServiceRef = js.native
  /**
    * The definition associated with the continuous deployment
    */
  var definition: XamlDefinitionReference = js.native
  var gitBranch: String = js.native
  var hostedServiceName: String = js.native
  var project: TeamProjectReference = js.native
  var repositoryId: String = js.native
  var storageAccountName: String = js.native
  var subscriptionId: String = js.native
  var website: String = js.native
  var webspace: String = js.native
}

object ContinuousDeploymentDefinition {
  @scala.inline
  def apply(
    connectedService: WebApiConnectedServiceRef,
    definition: XamlDefinitionReference,
    gitBranch: String,
    hostedServiceName: String,
    project: TeamProjectReference,
    repositoryId: String,
    storageAccountName: String,
    subscriptionId: String,
    website: String,
    webspace: String
  ): ContinuousDeploymentDefinition = {
    val __obj = js.Dynamic.literal(connectedService = connectedService.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], gitBranch = gitBranch.asInstanceOf[js.Any], hostedServiceName = hostedServiceName.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any], storageAccountName = storageAccountName.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any], webspace = webspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousDeploymentDefinition]
  }
  @scala.inline
  implicit class ContinuousDeploymentDefinitionOps[Self <: ContinuousDeploymentDefinition] (val x: Self) extends AnyVal {
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
    def setConnectedService(value: WebApiConnectedServiceRef): Self = this.set("connectedService", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinition(value: XamlDefinitionReference): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def setGitBranch(value: String): Self = this.set("gitBranch", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostedServiceName(value: String): Self = this.set("hostedServiceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: TeamProjectReference): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryId(value: String): Self = this.set("repositoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorageAccountName(value: String): Self = this.set("storageAccountName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionId(value: String): Self = this.set("subscriptionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebsite(value: String): Self = this.set("website", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebspace(value: String): Self = this.set("webspace", value.asInstanceOf[js.Any])
  }
  
}

