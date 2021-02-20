package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseDeploymentInput extends StObject {
  
  var condition: String = js.native
  
  /**
    * Gets or sets the job cancel timeout in minutes for deployment which are cancelled by user for this release environment
    */
  var jobCancelTimeoutInMinutes: Double = js.native
  
  var overrideInputs: StringDictionary[String] = js.native
  
  /**
    * Gets or sets the job execution timeout in minutes for deployment which are queued against this release environment
    */
  var timeoutInMinutes: Double = js.native
}
object BaseDeploymentInput {
  
  @scala.inline
  def apply(
    condition: String,
    jobCancelTimeoutInMinutes: Double,
    overrideInputs: StringDictionary[String],
    timeoutInMinutes: Double
  ): BaseDeploymentInput = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes.asInstanceOf[js.Any], overrideInputs = overrideInputs.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseDeploymentInput]
  }
  
  @scala.inline
  implicit class BaseDeploymentInputMutableBuilder[Self <: BaseDeploymentInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobCancelTimeoutInMinutes(value: Double): Self = StObject.set(x, "jobCancelTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideInputs(value: StringDictionary[String]): Self = StObject.set(x, "overrideInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMinutes(value: Double): Self = StObject.set(x, "timeoutInMinutes", value.asInstanceOf[js.Any])
  }
}
