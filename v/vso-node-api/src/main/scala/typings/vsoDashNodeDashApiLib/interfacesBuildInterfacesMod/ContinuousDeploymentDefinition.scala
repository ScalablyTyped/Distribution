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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connectedService")(connectedService)
    __obj.updateDynamic("definition")(definition)
    __obj.updateDynamic("gitBranch")(gitBranch)
    __obj.updateDynamic("hostedServiceName")(hostedServiceName)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("repositoryId")(repositoryId)
    __obj.updateDynamic("storageAccountName")(storageAccountName)
    __obj.updateDynamic("subscriptionId")(subscriptionId)
    __obj.updateDynamic("website")(website)
    __obj.updateDynamic("webspace")(webspace)
    __obj.asInstanceOf[ContinuousDeploymentDefinition]
  }
}

