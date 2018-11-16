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

