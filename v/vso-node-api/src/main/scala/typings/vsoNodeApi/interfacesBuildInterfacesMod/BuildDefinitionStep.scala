package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildDefinitionStep extends StObject {
  
  /**
    * Indicates whether this step should run even if a previous step fails.
    */
  var alwaysRun: Boolean
  
  /**
    * A condition that determines whether this step should run.
    */
  var condition: String
  
  /**
    * Indicates whether the phase should continue even if this step fails.
    */
  var continueOnError: Boolean
  
  /**
    * The display name for this step.
    */
  var displayName: String
  
  /**
    * Indicates whether the step is enabled.
    */
  var enabled: Boolean
  
  var environment: StringDictionary[String]
  
  var inputs: StringDictionary[String]
  
  /**
    * The reference name for this step.
    */
  var refName: String
  
  /**
    * The task associated with this step.
    */
  var task: TaskDefinitionReference
  
  /**
    * The time, in minutes, that this step is allowed to run.
    */
  var timeoutInMinutes: Double
}
object BuildDefinitionStep {
  
  inline def apply(
    alwaysRun: Boolean,
    condition: String,
    continueOnError: Boolean,
    displayName: String,
    enabled: Boolean,
    environment: StringDictionary[String],
    inputs: StringDictionary[String],
    refName: String,
    task: TaskDefinitionReference,
    timeoutInMinutes: Double
  ): BuildDefinitionStep = {
    val __obj = js.Dynamic.literal(alwaysRun = alwaysRun.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], continueOnError = continueOnError.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], refName = refName.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionStep]
  }
  
  extension [Self <: BuildDefinitionStep](x: Self) {
    
    inline def setAlwaysRun(value: Boolean): Self = StObject.set(x, "alwaysRun", value.asInstanceOf[js.Any])
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: StringDictionary[String]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: StringDictionary[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setRefName(value: String): Self = StObject.set(x, "refName", value.asInstanceOf[js.Any])
    
    inline def setTask(value: TaskDefinitionReference): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInMinutes(value: Double): Self = StObject.set(x, "timeoutInMinutes", value.asInstanceOf[js.Any])
  }
}
