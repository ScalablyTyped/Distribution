package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.distributedTaskCommonInterfacesMod.ProcessParameters
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseDefinitionEnvironment extends StObject {
  
  var badgeUrl: String
  
  var conditions: js.Array[Condition]
  
  var demands: js.Array[js.Any]
  
  var deployPhases: js.Array[DeployPhase]
  
  var deployStep: ReleaseDefinitionDeployStep
  
  var environmentOptions: EnvironmentOptions
  
  var executionPolicy: EnvironmentExecutionPolicy
  
  var id: Double
  
  var name: String
  
  var owner: IdentityRef
  
  var postDeployApprovals: ReleaseDefinitionApprovals
  
  var postDeploymentGates: ReleaseDefinitionGatesStep
  
  var preDeployApprovals: ReleaseDefinitionApprovals
  
  var preDeploymentGates: ReleaseDefinitionGatesStep
  
  var processParameters: ProcessParameters
  
  var properties: js.Any
  
  var queueId: Double
  
  var rank: Double
  
  var retentionPolicy: EnvironmentRetentionPolicy
  
  var runOptions: StringDictionary[String]
  
  var schedules: js.Array[ReleaseSchedule]
  
  var variableGroups: js.Array[Double]
  
  var variables: StringDictionary[ConfigurationVariableValue]
}
object ReleaseDefinitionEnvironment {
  
  inline def apply(
    badgeUrl: String,
    conditions: js.Array[Condition],
    demands: js.Array[js.Any],
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
  
  extension [Self <: ReleaseDefinitionEnvironment](x: Self) {
    
    inline def setBadgeUrl(value: String): Self = StObject.set(x, "badgeUrl", value.asInstanceOf[js.Any])
    
    inline def setConditions(value: js.Array[Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: Condition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    inline def setDemands(value: js.Array[js.Any]): Self = StObject.set(x, "demands", value.asInstanceOf[js.Any])
    
    inline def setDemandsVarargs(value: js.Any*): Self = StObject.set(x, "demands", js.Array(value :_*))
    
    inline def setDeployPhases(value: js.Array[DeployPhase]): Self = StObject.set(x, "deployPhases", value.asInstanceOf[js.Any])
    
    inline def setDeployPhasesVarargs(value: DeployPhase*): Self = StObject.set(x, "deployPhases", js.Array(value :_*))
    
    inline def setDeployStep(value: ReleaseDefinitionDeployStep): Self = StObject.set(x, "deployStep", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentOptions(value: EnvironmentOptions): Self = StObject.set(x, "environmentOptions", value.asInstanceOf[js.Any])
    
    inline def setExecutionPolicy(value: EnvironmentExecutionPolicy): Self = StObject.set(x, "executionPolicy", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: IdentityRef): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPostDeployApprovals(value: ReleaseDefinitionApprovals): Self = StObject.set(x, "postDeployApprovals", value.asInstanceOf[js.Any])
    
    inline def setPostDeploymentGates(value: ReleaseDefinitionGatesStep): Self = StObject.set(x, "postDeploymentGates", value.asInstanceOf[js.Any])
    
    inline def setPreDeployApprovals(value: ReleaseDefinitionApprovals): Self = StObject.set(x, "preDeployApprovals", value.asInstanceOf[js.Any])
    
    inline def setPreDeploymentGates(value: ReleaseDefinitionGatesStep): Self = StObject.set(x, "preDeploymentGates", value.asInstanceOf[js.Any])
    
    inline def setProcessParameters(value: ProcessParameters): Self = StObject.set(x, "processParameters", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setQueueId(value: Double): Self = StObject.set(x, "queueId", value.asInstanceOf[js.Any])
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRetentionPolicy(value: EnvironmentRetentionPolicy): Self = StObject.set(x, "retentionPolicy", value.asInstanceOf[js.Any])
    
    inline def setRunOptions(value: StringDictionary[String]): Self = StObject.set(x, "runOptions", value.asInstanceOf[js.Any])
    
    inline def setSchedules(value: js.Array[ReleaseSchedule]): Self = StObject.set(x, "schedules", value.asInstanceOf[js.Any])
    
    inline def setSchedulesVarargs(value: ReleaseSchedule*): Self = StObject.set(x, "schedules", js.Array(value :_*))
    
    inline def setVariableGroups(value: js.Array[Double]): Self = StObject.set(x, "variableGroups", value.asInstanceOf[js.Any])
    
    inline def setVariableGroupsVarargs(value: Double*): Self = StObject.set(x, "variableGroups", js.Array(value :_*))
    
    inline def setVariables(value: StringDictionary[ConfigurationVariableValue]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
