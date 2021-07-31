package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePlan extends StObject {
  
  /**
    * Description of the plan
    */
  var description: String
  
  /**
    * Name of the plan to create.
    */
  var name: String
  
  /**
    * Plan properties.
    */
  var properties: js.Any
  
  /**
    * Revision of the plan that was updated - the value used here should match the one the server gave the client in the Plan.
    */
  var revision: Double
  
  /**
    * Type of the plan
    */
  var `type`: PlanType
}
object UpdatePlan {
  
  @scala.inline
  def apply(description: String, name: String, properties: js.Any, revision: Double, `type`: PlanType): UpdatePlan = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePlan]
  }
  
  @scala.inline
  implicit class UpdatePlanMutableBuilder[Self <: UpdatePlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PlanType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
