package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.TeamProjectReference
import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.WebApiConnectedServiceRef
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
    val __obj = js.Dynamic.literal(connectedService = connectedService, definition = definition, gitBranch = gitBranch, hostedServiceName = hostedServiceName, project = project, repositoryId = repositoryId, storageAccountName = storageAccountName, subscriptionId = subscriptionId, website = website, webspace = webspace)
  
    __obj.asInstanceOf[ContinuousDeploymentDefinition]
  }
}

