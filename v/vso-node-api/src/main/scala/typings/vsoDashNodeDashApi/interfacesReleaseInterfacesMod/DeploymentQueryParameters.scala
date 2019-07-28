package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentQueryParameters extends js.Object {
  var artifactSourceId: String
  var artifactTypeId: String
  var artifactVersions: js.Array[String]
  var deploymentStatus: DeploymentStatus
  var deploymentsPerEnvironment: Double
  var environments: js.Array[DefinitionEnvironmentReference]
  var expands: DeploymentExpands
  var isDeleted: Boolean
  var latestDeploymentsOnly: Boolean
  var maxDeploymentsPerEnvironment: Double
  var maxModifiedTime: Date
  var minModifiedTime: Date
  var operationStatus: DeploymentOperationStatus
  var queryOrder: ReleaseQueryOrder
  var queryType: DeploymentsQueryType
  var sourceBranch: String
}

object DeploymentQueryParameters {
  @scala.inline
  def apply(
    artifactSourceId: String,
    artifactTypeId: String,
    artifactVersions: js.Array[String],
    deploymentStatus: DeploymentStatus,
    deploymentsPerEnvironment: Double,
    environments: js.Array[DefinitionEnvironmentReference],
    expands: DeploymentExpands,
    isDeleted: Boolean,
    latestDeploymentsOnly: Boolean,
    maxDeploymentsPerEnvironment: Double,
    maxModifiedTime: Date,
    minModifiedTime: Date,
    operationStatus: DeploymentOperationStatus,
    queryOrder: ReleaseQueryOrder,
    queryType: DeploymentsQueryType,
    sourceBranch: String
  ): DeploymentQueryParameters = {
    val __obj = js.Dynamic.literal(artifactSourceId = artifactSourceId, artifactTypeId = artifactTypeId, artifactVersions = artifactVersions, deploymentStatus = deploymentStatus, deploymentsPerEnvironment = deploymentsPerEnvironment, environments = environments, expands = expands, isDeleted = isDeleted, latestDeploymentsOnly = latestDeploymentsOnly, maxDeploymentsPerEnvironment = maxDeploymentsPerEnvironment, maxModifiedTime = maxModifiedTime, minModifiedTime = minModifiedTime, operationStatus = operationStatus, queryOrder = queryOrder, queryType = queryType, sourceBranch = sourceBranch)
  
    __obj.asInstanceOf[DeploymentQueryParameters]
  }
}

