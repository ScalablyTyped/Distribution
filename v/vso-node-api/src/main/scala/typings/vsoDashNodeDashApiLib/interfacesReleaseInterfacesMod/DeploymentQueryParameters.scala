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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("artifactSourceId")(artifactSourceId)
    __obj.updateDynamic("artifactTypeId")(artifactTypeId)
    __obj.updateDynamic("artifactVersions")(artifactVersions)
    __obj.updateDynamic("deploymentStatus")(deploymentStatus)
    __obj.updateDynamic("deploymentsPerEnvironment")(deploymentsPerEnvironment)
    __obj.updateDynamic("environments")(environments)
    __obj.updateDynamic("expands")(expands)
    __obj.updateDynamic("isDeleted")(isDeleted)
    __obj.updateDynamic("latestDeploymentsOnly")(latestDeploymentsOnly)
    __obj.updateDynamic("maxDeploymentsPerEnvironment")(maxDeploymentsPerEnvironment)
    __obj.updateDynamic("maxModifiedTime")(maxModifiedTime)
    __obj.updateDynamic("minModifiedTime")(minModifiedTime)
    __obj.updateDynamic("operationStatus")(operationStatus)
    __obj.updateDynamic("queryOrder")(queryOrder)
    __obj.updateDynamic("queryType")(queryType)
    __obj.updateDynamic("sourceBranch")(sourceBranch)
    __obj.asInstanceOf[DeploymentQueryParameters]
  }
}

