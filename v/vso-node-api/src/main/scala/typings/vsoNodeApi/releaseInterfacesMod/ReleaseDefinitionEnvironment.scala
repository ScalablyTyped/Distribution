package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.distributedTaskCommonInterfacesMod.ProcessParameters
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseDefinitionEnvironment extends StObject {
  
  var badgeUrl: String = js.native
  
  var conditions: js.Array[Condition] = js.native
  
  var demands: js.Array[_] = js.native
  
  var deployPhases: js.Array[DeployPhase] = js.native
  
  var deployStep: ReleaseDefinitionDeployStep = js.native
  
  var environmentOptions: EnvironmentOptions = js.native
  
  var executionPolicy: EnvironmentExecutionPolicy = js.native
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var owner: IdentityRef = js.native
  
  var postDeployApprovals: ReleaseDefinitionApprovals = js.native
  
  var postDeploymentGates: ReleaseDefinitionGatesStep = js.native
  
  var preDeployApprovals: ReleaseDefinitionApprovals = js.native
  
  var preDeploymentGates: ReleaseDefinitionGatesStep = js.native
  
  var processParameters: ProcessParameters = js.native
  
  var properties: js.Any = js.native
  
  var queueId: Double = js.native
  
  var rank: Double = js.native
  
  var retentionPolicy: EnvironmentRetentionPolicy = js.native
  
  var runOptions: StringDictionary[String] = js.native
  
  var schedules: js.Array[ReleaseSchedule] = js.native
  
  var variableGroups: js.Array[Double] = js.native
  
  var variables: StringDictionary[ConfigurationVariableValue] = js.native
}
object ReleaseDefinitionEnvironment {
  
  @scala.inline
  def apply(
    badgeUrl: String,
    conditions: js.Array[Condition],
    demands: js.Array[_],
    deployPhases: js.Array[DeployPhase],
    deployStep: ReleaseDefinitionDeployStep,
    environmentOptions: EnvironmentOptions,
    executionPolicy: EnvironmentExecutionPolicy,
    id: Double,
    name: String,
    owner: IdentityRef,
    postDeployApprovals: ReleaseDefinitionApprovals,
    postDeploymentGates: ReleaseDefinitionGatesStep,
    preDeployApprovals: ReleaseDefinitionApprovals,
    preDeploymentGates: ReleaseDefinitionGatesStep,
    processParameters: ProcessParameters,
    properties: js.Any,
    queueId: Double,
    rank: Double,
    retentionPolicy: EnvironmentRetentionPolicy,
    runOptions: StringDictionary[String],
    schedules: js.Array[ReleaseSchedule],
    variableGroups: js.Array[Double],
    variables: StringDictionary[ConfigurationVariableValue]
  ): ReleaseDefinitionEnvironment = {
    val __obj = js.Dynamic.literal(badgeUrl = badgeUrl.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], deployPhases = deployPhases.asInstanceOf[js.Any], deployStep = deployStep.asInstanceOf[js.Any], environmentOptions = environmentOptions.asInstanceOf[js.Any], executionPolicy = executionPolicy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], postDeployApprovals = postDeployApprovals.asInstanceOf[js.Any], postDeploymentGates = postDeploymentGates.asInstanceOf[js.Any], preDeployApprovals = preDeployApprovals.asInstanceOf[js.Any], preDeploymentGates = preDeploymentGates.asInstanceOf[js.Any], processParameters = processParameters.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], queueId = queueId.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], retentionPolicy = retentionPolicy.asInstanceOf[js.Any], runOptions = runOptions.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], variableGroups = variableGroups.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionEnvironment]
  }
  
  @scala.inline
  implicit class ReleaseDefinitionEnvironmentMutableBuilder[Self <: ReleaseDefinitionEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadgeUrl(value: String): Self = StObject.set(x, "badgeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditions(value: js.Array[Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: Condition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setDemands(value: js.Array[_]): Self = StObject.set(x, "demands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemandsVarargs(value: js.Any*): Self = StObject.set(x, "demands", js.Array(value :_*))
    
    @scala.inline
    def setDeployPhases(value: js.Array[DeployPhase]): Self = StObject.set(x, "deployPhases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployPhasesVarargs(value: DeployPhase*): Self = StObject.set(x, "deployPhases", js.Array(value :_*))
    
    @scala.inline
    def setDeployStep(value: ReleaseDefinitionDeployStep): Self = StObject.set(x, "deployStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentOptions(value: EnvironmentOptions): Self = StObject.set(x, "environmentOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionPolicy(value: EnvironmentExecutionPolicy): Self = StObject.set(x, "executionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: IdentityRef): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostDeployApprovals(value: ReleaseDefinitionApprovals): Self = StObject.set(x, "postDeployApprovals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostDeploymentGates(value: ReleaseDefinitionGatesStep): Self = StObject.set(x, "postDeploymentGates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreDeployApprovals(value: ReleaseDefinitionApprovals): Self = StObject.set(x, "preDeployApprovals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreDeploymentGates(value: ReleaseDefinitionGatesStep): Self = StObject.set(x, "preDeploymentGates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessParameters(value: ProcessParameters): Self = StObject.set(x, "processParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueId(value: Double): Self = StObject.set(x, "queueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPolicy(value: EnvironmentRetentionPolicy): Self = StObject.set(x, "retentionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunOptions(value: StringDictionary[String]): Self = StObject.set(x, "runOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedules(value: js.Array[ReleaseSchedule]): Self = StObject.set(x, "schedules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedulesVarargs(value: ReleaseSchedule*): Self = StObject.set(x, "schedules", js.Array(value :_*))
    
    @scala.inline
    def setVariableGroups(value: js.Array[Double]): Self = StObject.set(x, "variableGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableGroupsVarargs(value: Double*): Self = StObject.set(x, "variableGroups", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: StringDictionary[ConfigurationVariableValue]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
