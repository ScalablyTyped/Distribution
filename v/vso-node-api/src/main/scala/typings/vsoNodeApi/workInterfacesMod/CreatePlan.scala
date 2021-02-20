package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePlan extends StObject {
  
  /**
    * Description of the plan
    */
  var description: String = js.native
  
  /**
    * Name of the plan to create.
    */
  var name: String = js.native
  
  /**
    * Plan properties.
    */
  var properties: js.Any = js.native
  
  /**
    * Type of plan to create.
    */
  var `type`: PlanType = js.native
}
object CreatePlan {
  
  @scala.inline
  def apply(description: String, name: String, properties: js.Any, `type`: PlanType): CreatePlan = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlan]
  }
  
  @scala.inline
  implicit class CreatePlanMutableBuilder[Self <: CreatePlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PlanType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
