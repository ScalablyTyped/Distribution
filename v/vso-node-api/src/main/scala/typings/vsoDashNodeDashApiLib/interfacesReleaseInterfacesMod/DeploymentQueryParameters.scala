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

object DeploymentQueryParameters {
  @scala.inline
  def apply(
    artifactSourceId: java.lang.String,
    artifactTypeId: java.lang.String,
    artifactVersions: js.Array[java.lang.String],
    deploymentStatus: DeploymentStatus,
    deploymentsPerEnvironment: scala.Double,
    environments: js.Array[DefinitionEnvironmentReference],
    expands: DeploymentExpands,
    isDeleted: scala.Boolean,
    latestDeploymentsOnly: scala.Boolean,
    maxDeploymentsPerEnvironment: scala.Double,
    maxModifiedTime: stdLib.Date,
    minModifiedTime: stdLib.Date,
    operationStatus: DeploymentOperationStatus,
    queryOrder: ReleaseQueryOrder,
    queryType: DeploymentsQueryType,
    sourceBranch: java.lang.String
  ): DeploymentQueryParameters = {
    val __obj = js.Dynamic.literal(artifactSourceId = artifactSourceId, artifactTypeId = artifactTypeId, artifactVersions = artifactVersions, deploymentStatus = deploymentStatus, deploymentsPerEnvironment = deploymentsPerEnvironment, environments = environments, expands = expands, isDeleted = isDeleted, latestDeploymentsOnly = latestDeploymentsOnly, maxDeploymentsPerEnvironment = maxDeploymentsPerEnvironment, maxModifiedTime = maxModifiedTime, minModifiedTime = minModifiedTime, operationStatus = operationStatus, queryOrder = queryOrder, queryType = queryType, sourceBranch = sourceBranch)
  
    __obj.asInstanceOf[DeploymentQueryParameters]
  }
}

