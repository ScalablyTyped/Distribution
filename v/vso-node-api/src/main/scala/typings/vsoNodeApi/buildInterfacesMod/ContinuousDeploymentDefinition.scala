package typings.vsoNodeApi.buildInterfacesMod

import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typings.vsoNodeApi.coreInterfacesMod.WebApiConnectedServiceRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousDeploymentDefinition extends js.Object {
  /**
    * The connected service associated with the continuous deployment
    */
  var connectedService: WebApiConnectedServiceRef
  /**
    * The definition associated with the continuous deployment
    */
  var definition: XamlDefinitionReference
  var gitBranch: String
  var hostedServiceName: String
  var project: TeamProjectReference
  var repositoryId: String
  var storageAccountName: String
  var subscriptionId: String
  var website: String
  var webspace: String
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
}

