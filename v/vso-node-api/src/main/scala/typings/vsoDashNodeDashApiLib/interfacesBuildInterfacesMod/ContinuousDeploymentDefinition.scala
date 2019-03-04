package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousDeploymentDefinition extends js.Object {
  /**
    * The connected service associated with the continuous deployment
    */
  var connectedService: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiConnectedServiceRef
  /**
    * The definition associated with the continuous deployment
    */
  var definition: XamlDefinitionReference
  var gitBranch: java.lang.String
  var hostedServiceName: java.lang.String
  var project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference
  var repositoryId: java.lang.String
  var storageAccountName: java.lang.String
  var subscriptionId: java.lang.String
  var website: java.lang.String
  var webspace: java.lang.String
}

object ContinuousDeploymentDefinition {
  @scala.inline
  def apply(
    connectedService: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiConnectedServiceRef,
    definition: XamlDefinitionReference,
    gitBranch: java.lang.String,
    hostedServiceName: java.lang.String,
    project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference,
    repositoryId: java.lang.String,
    storageAccountName: java.lang.String,
    subscriptionId: java.lang.String,
    website: java.lang.String,
    webspace: java.lang.String
  ): ContinuousDeploymentDefinition = {
    val __obj = js.Dynamic.literal(connectedService = connectedService, definition = definition, gitBranch = gitBranch, hostedServiceName = hostedServiceName, project = project, repositoryId = repositoryId, storageAccountName = storageAccountName, subscriptionId = subscriptionId, website = website, webspace = webspace)
  
    __obj.asInstanceOf[ContinuousDeploymentDefinition]
  }
}

