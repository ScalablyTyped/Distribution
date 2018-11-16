package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DeploymentQueryParameters extends js.Object {
  var artifactSourceId: java.lang.String
  var artifactTypeId: java.lang.String
  var artifactVersions: js.Array[java.lang.String]
  var deploymentStatus: DeploymentStatus
  var deploymentsPerEnvironment: scala.Double
  var environments: js.Array[DefinitionEnvironmentReference]
  var expands: DeploymentExpands
  var isDeleted: scala.Boolean
  var latestDeploymentsOnly: scala.Boolean
  var maxDeploymentsPerEnvironment: scala.Double
  var maxModifiedTime: stdLib.Date
  var minModifiedTime: stdLib.Date
  var operationStatus: DeploymentOperationStatus
  var queryOrder: ReleaseQueryOrder
  var queryType: DeploymentsQueryType
  var sourceBranch: java.lang.String
}

