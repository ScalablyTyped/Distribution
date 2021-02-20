package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentQueryParameters extends StObject {
  
  var artifactSourceId: String = js.native
  
  var artifactTypeId: String = js.native
  
  var artifactVersions: js.Array[String] = js.native
  
  var deploymentStatus: DeploymentStatus = js.native
  
  var deploymentsPerEnvironment: Double = js.native
  
  var environments: js.Array[DefinitionEnvironmentReference] = js.native
  
  var expands: DeploymentExpands = js.native
  
  var isDeleted: Boolean = js.native
  
  var latestDeploymentsOnly: Boolean = js.native
  
  var maxDeploymentsPerEnvironment: Double = js.native
  
  var maxModifiedTime: Date = js.native
  
  var minModifiedTime: Date = js.native
  
  var operationStatus: DeploymentOperationStatus = js.native
  
  var queryOrder: ReleaseQueryOrder = js.native
  
  var queryType: DeploymentsQueryType = js.native
  
  var sourceBranch: String = js.native
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
    val __obj = js.Dynamic.literal(artifactSourceId = artifactSourceId.asInstanceOf[js.Any], artifactTypeId = artifactTypeId.asInstanceOf[js.Any], artifactVersions = artifactVersions.asInstanceOf[js.Any], deploymentStatus = deploymentStatus.asInstanceOf[js.Any], deploymentsPerEnvironment = deploymentsPerEnvironment.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], expands = expands.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], latestDeploymentsOnly = latestDeploymentsOnly.asInstanceOf[js.Any], maxDeploymentsPerEnvironment = maxDeploymentsPerEnvironment.asInstanceOf[js.Any], maxModifiedTime = maxModifiedTime.asInstanceOf[js.Any], minModifiedTime = minModifiedTime.asInstanceOf[js.Any], operationStatus = operationStatus.asInstanceOf[js.Any], queryOrder = queryOrder.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], sourceBranch = sourceBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentQueryParameters]
  }
  
  @scala.inline
  implicit class DeploymentQueryParametersMutableBuilder[Self <: DeploymentQueryParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactSourceId(value: String): Self = StObject.set(x, "artifactSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactTypeId(value: String): Self = StObject.set(x, "artifactTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactVersions(value: js.Array[String]): Self = StObject.set(x, "artifactVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactVersionsVarargs(value: String*): Self = StObject.set(x, "artifactVersions", js.Array(value :_*))
    
    @scala.inline
    def setDeploymentStatus(value: DeploymentStatus): Self = StObject.set(x, "deploymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentsPerEnvironment(value: Double): Self = StObject.set(x, "deploymentsPerEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironments(value: js.Array[DefinitionEnvironmentReference]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentsVarargs(value: DefinitionEnvironmentReference*): Self = StObject.set(x, "environments", js.Array(value :_*))
    
    @scala.inline
    def setExpands(value: DeploymentExpands): Self = StObject.set(x, "expands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestDeploymentsOnly(value: Boolean): Self = StObject.set(x, "latestDeploymentsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDeploymentsPerEnvironment(value: Double): Self = StObject.set(x, "maxDeploymentsPerEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxModifiedTime(value: Date): Self = StObject.set(x, "maxModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinModifiedTime(value: Date): Self = StObject.set(x, "minModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationStatus(value: DeploymentOperationStatus): Self = StObject.set(x, "operationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryOrder(value: ReleaseQueryOrder): Self = StObject.set(x, "queryOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryType(value: DeploymentsQueryType): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBranch(value: String): Self = StObject.set(x, "sourceBranch", value.asInstanceOf[js.Any])
  }
}
