package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePlan extends StObject {
  
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
  var properties: Any
  
  /**
    * Type of plan to create.
    */
  var `type`: PlanType
}
object CreatePlan {
  
  inline def apply(description: String, name: String, properties: Any, `type`: PlanType): CreatePlan = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlan]
  }
  
  extension [Self <: CreatePlan](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: PlanType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
