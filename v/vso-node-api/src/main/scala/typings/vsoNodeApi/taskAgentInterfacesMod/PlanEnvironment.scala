package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlanEnvironment extends StObject {
  
  var mask: js.Array[MaskHint] = js.native
  
  var options: StringDictionary[JobOption] = js.native
  
  var variables: StringDictionary[String] = js.native
}
object PlanEnvironment {
  
  @scala.inline
  def apply(
    mask: js.Array[MaskHint],
    options: StringDictionary[JobOption],
    variables: StringDictionary[String]
  ): PlanEnvironment = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanEnvironment]
  }
  
  @scala.inline
  implicit class PlanEnvironmentMutableBuilder[Self <: PlanEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMask(value: js.Array[MaskHint]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskVarargs(value: MaskHint*): Self = StObject.set(x, "mask", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: StringDictionary[JobOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: StringDictionary[String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
